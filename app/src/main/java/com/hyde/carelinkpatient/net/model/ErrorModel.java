package com.hyde.carelinkpatient.net.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by wangnianqing on 2016/5/27.
 */
public final class ErrorModel extends BaseModel {
  public static final int SC_SUCCESS = 0;
  public static final int SC_ACCOUNT_ALREADY_EXISTS = 101;  // 账号已经存在
  public static final int SC_ACCOUNT_NOT_EXISTS = 102;  // 账号不存在
  public static final int SC_LOGIN_ERROR = 111;  // 用户名或者密码错误
  public static final int SC_VERIFY_ERROR = 121;  // 验证码错误
  public static final int SC_SEND_VERIFY_ERROR = 122;  // 发送验证码失败，请稍后重试
  public static final int SC_SEND_VERIFY_TOO_MANY = 123;  // 发送验证码次数过多
  public static final int SC_PHONE_NUMBER_INVALID = 131;  // 非法电话号码
  public static final int SC_PASSWORD_INVALID = 132;  // 密码不合法

  @SerializedName("openId")
  private String mOpenId;

  @SerializedName("accessToken")
  private String mAccessToken;

  public ErrorModel(int code, String message) {
    setCode(code);
    setMsg(message);
  }

  public String getOpenId() {
    return mOpenId;
  }

  public String getAccessToken() {
    return mAccessToken;
  }
}
