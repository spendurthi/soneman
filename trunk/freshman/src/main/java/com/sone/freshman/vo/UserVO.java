package com.sone.freshman.vo;

public class UserVO {
	private String userName;
	private String password;
	
	public UserVO(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}
	public UserVO(){}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
