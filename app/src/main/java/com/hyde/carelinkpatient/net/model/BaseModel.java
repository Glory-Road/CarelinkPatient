/**
 * 
 */
package com.hyde.carelinkpatient.net.model;

/**
 * Created by wangnianqing on 2016/5/27.
 */
public class BaseModel {
	private int code;
	private String msg;
	private Object mRequest;
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Object getRequest() {
		return mRequest;
	}
	public void setRequest(Object request) {
		mRequest = request;
	}
	
}
