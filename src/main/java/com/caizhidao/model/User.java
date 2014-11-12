package com.caizhidao.model;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

@Alias("user")
public class User implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8512537050845316347L;
	/*
	 * userId
	 */
	private int userId;
	/*
	 * userName
	 */
	private String userName;
	/**
	 * 获得 userId
	 * @return
	 */
	public int getUserId() {
		return userId;
	}
	/**
	 * 设置 userId
	 * @param userId
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}
	/**
	 * 获得 userName
	 * @return
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * 设置 userName
	 * @param userName
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + "]";
	}
}
