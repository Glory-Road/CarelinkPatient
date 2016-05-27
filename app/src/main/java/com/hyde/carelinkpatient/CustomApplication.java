package com.hyde.carelinkpatient;

import android.app.Application;

import com.hyde.carelinkpatient.net.ApiCenter;

/**
 * Created by wangnianqing on 2016/5/27.
 */
public class CustomApplication extends Application {
	private static CustomApplication instance;
	private final ApiCenter mApiCenter = new ApiCenter();

	public static CustomApplication getApplication() {
		return instance;
	}

	@Override
	public void onCreate() {
		instance = this;
		super.onCreate();
	}

	public ApiCenter getApiCenter() {
		return mApiCenter;
	}
}
