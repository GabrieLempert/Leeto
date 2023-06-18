package com.example.foodfun_v2.controller;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;

import androidx.annotation.Nullable;

import com.example.foodfun_v2.R;


public class LoginActivity extends Activity {

    private Context applicationContext;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);
        applicationContext = getApplicationContext();

    }

}
