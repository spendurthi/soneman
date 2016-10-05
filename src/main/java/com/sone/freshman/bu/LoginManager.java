package com.sone.freshman.bu;

import com.sone.exceptions.SoneWebException;
import com.sone.freshman.vo.UserVO;


public interface LoginManager {	

	public boolean validateUser(UserVO user)throws SoneWebException;
}
