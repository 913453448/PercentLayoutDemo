package com.yasin.px_percent_layout.utils;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.util.Log;

/**
 * Created by leo on 17/2/9.
 */

public class PxAppConfig {
    private static final String TAG = PxAppConfig.class.getSimpleName();

    /**
     * UI设计的基准宽度.
     */
    public static int UI_WIDTH = 720;

    /**
     * UI设计的基准高度.
     */
    public static int UI_HEIGHT = 1280;

    /**
     * UI设计的密度.
     */
    public static int UI_DENSITY = 2;

    /**
     * init uiconfig
     * @param context
     */
    public static void init(Context context) {
        try {
            ApplicationInfo info = context.getPackageManager().getApplicationInfo(context.getPackageName(), PackageManager.GET_META_DATA);
            UI_WIDTH=info.metaData.getInt("UI_WIDTH",UI_WIDTH);
            UI_HEIGHT=info.metaData.getInt("UI_HEIGHT",UI_HEIGHT);
            UI_DENSITY=info.metaData.getInt("UI_DENSITY",UI_DENSITY);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            if(Log.isLoggable(TAG,Log.ERROR)){
                Log.e(TAG,"erro init AppConfig");
            }
        }
    }
}
