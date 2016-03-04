package com.xxx.asus.meishijie.base;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;

/**
 * Created by asus on 2016/2/25.
 */
public abstract class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getViewResid());
        ButterKnife.bind(this);
        init();
        loadDatas();
    }

    protected  void loadDatas(){}

    protected  void init(){}

    protected abstract  int getViewResid();
}
