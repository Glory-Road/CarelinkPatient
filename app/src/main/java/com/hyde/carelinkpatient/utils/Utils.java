package com.hyde.carelinkpatient.utils;

import android.widget.Toast;

import com.hyde.carelinkpatient.CustomApplication;

/**
 * Created by wangnianqing on 2016/5/27.
 */
public class Utils {
	private Utils() {}

	public static void ToastUtls(String content) {
		Toast.makeText(CustomApplication.getApplication(), content, Toast.LENGTH_SHORT).show();
	}
}
