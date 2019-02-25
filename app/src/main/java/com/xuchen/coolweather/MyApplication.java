package com.xuchen.coolweather;

import android.app.Application;
import android.content.Context;

import org.litepal.LitePal;

/**
 * Created by xuchen
 * on 2019/2/24.
 */
public class MyApplication extends Application {

    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        LitePal.initialize(context);
    }

    public static Context getContext() {
        return context;
    }
}
