package com.hyde.carelinkpatient.ui.activity;

import android.os.Bundle;
import android.view.View;

import com.hyde.carelinkpatient.CustomApplication;
import com.hyde.carelinkpatient.R;
import com.hyde.carelinkpatient.net.request.RegistRequest;
import com.hyde.carelinkpatient.net.model.LoginModel;
import com.hyde.carelinkpatient.utils.Utils;

import org.greenrobot.eventbus.Subscribe;

public class HomeActivity extends BaseActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home);

	}

	public void regist(View view) {
		RegistRequest input = new RegistRequest("13354282532", "qqq", "nianqing", "121343545656767656", 0);
		CustomApplication.getApplication().getApiCenter().register(input);
	}

	@Subscribe
	public void onEvent(LoginModel event) {
		event.getCode();
		Utils.ToastUtls("注册成功");
	}
}
