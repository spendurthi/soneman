package com.sone.freshman.bu.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.sone.exceptions.SoneWebException;
import com.sone.freshman.bu.LoginManager;
import com.sone.freshman.vo.UserVO;
import com.standone.exceptions.SoneDataException;
import com.standone.hbr.dao.UsersDao;
import com.standone.hbr.vo.UserDTO;
public class LoginManagerImpl implements LoginManager {
	
	@Autowired private UsersDao userDao;

	public boolean validateUser(UserVO user) throws SoneWebException{		
		UserDTO userLocal=null;
		try {
			userLocal = (UserDTO) userDao.getUser(user.getUserName());
		} catch (SoneDataException e) {
			throw new SoneWebException(e);
		}
		if (userLocal!=null){
			return user.getPassword().equals(userLocal.getPassword());
		}
		return false;
	}
	public void setUserDao(UsersDao userDao) {
		this.userDao = userDao;
	}
}
