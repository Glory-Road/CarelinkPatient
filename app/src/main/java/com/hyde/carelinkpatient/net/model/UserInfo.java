package com.hyde.carelinkpatient.net.model;

/**
 * 用户登录返回，以后需要再补充内容
 * 
 * @author ligang
 *
 */
public class UserInfo {
	
	int userId;// 用户id
	String mobile;//手机号
	String nickName;//昵称
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	
}

