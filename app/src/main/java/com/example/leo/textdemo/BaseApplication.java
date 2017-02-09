package com.example.leo.textdemo;

import android.app.Application;
import android.content.Context;

import com.yasin.px_percent_layout.utils.PxAppConfig;

/**
 * Created by leo on 17/2/9.
 */

public class BaseApplication extends Application {
    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        PxAppConfig.init(base);
    }
}
