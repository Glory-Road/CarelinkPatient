package com.hyde.carelinkpatient.net.request;

/**
 * 用户注册input
 * 
 * @author ligang
 *
 */
public class RegistRequest {
	/** 手机号*/
	private String mobile;
	/** 密码*/
	private String password;
	/** 昵称*/
	private String nickName;
	/** imei*/
	private String imei;
	/** 省份Id，开始先传0*/
	private int provinceId;

	public RegistRequest(String mobile, String password, String nickName, String imei, int provinceId) {
		this.mobile = mobile;
		this.password = password;
		this.nickName = nickName;
		this.imei = imei;
		this.provinceId = provinceId;
	}
}
