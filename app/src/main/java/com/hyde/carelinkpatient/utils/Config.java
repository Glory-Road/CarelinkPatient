package com.hyde.carelinkpatient.utils;

import android.content.Context;
import android.content.SharedPreferences;

import com.hyde.carelinkpatient.CustomApplication;

/**
 * Created by wangnianqing on 2016/5/27.
 */
public class Config {

	private static final String KEY_TOKEN = "key_token";
	private static final String KEY_USERID = "key_userid";
	private static final String KEY_PHONE = "key_phone";
	private static final String KEY_ONLINE_CONFIG = "key_online_config";
	private static final String CURRENT_CITY = "current_city";

	private static SharedPreferences mSharedPreferences = CustomApplication.getApplication()
			.getSharedPreferences("default", Context.MODE_PRIVATE);
	private static SharedPreferences.Editor mEditor = mSharedPreferences.edit();

	private Config() {}

	public void saveUserInfo(String userId, String token, String phone) {
		mEditor.putString(KEY_USERID, userId);
		mEditor.putString(KEY_TOKEN, token);
		mEditor.putString(KEY_PHONE, phone);
		mEditor.apply();
	}

	public static String getToken() {
		return mSharedPreferences.getString(KEY_TOKEN, "");
	}

	public static String getUserId() {
		return mSharedPreferences.getString(KEY_USERID, "");
	}

	public static String getPhone() {
		return mSharedPreferences.getString(KEY_PHONE, "");
	}

}
