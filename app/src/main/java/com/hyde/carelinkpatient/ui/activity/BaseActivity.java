package com.hyde.carelinkpatient.ui.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.hyde.carelinkpatient.net.model.ErrorModel;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;

/**
 * Created by wangnianqing on 2016/5/27.
 */
public class BaseActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		EventBus.getDefault().register(this);
	}

	@Override
	protected void onDestroy() {
		EventBus.getDefault().unregister(this);
		super.onDestroy();
	}

	@Subscribe
	public void onEvent(ErrorModel event) {
	}
}
