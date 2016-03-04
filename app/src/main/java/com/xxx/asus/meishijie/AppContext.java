package com.xxx.asus.meishijie;

import android.app.Application;

import com.xxx.asus.meishijie.util.FrescoUtil;
import com.xxx.asus.meishijie.util.OkHttpUtil;

/**
 * Created by asus on 2016/2/25.
 */
public class AppContext extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        FrescoUtil.initFresco(this);
        OkHttpUtil.initOkHttp();
    }
}
