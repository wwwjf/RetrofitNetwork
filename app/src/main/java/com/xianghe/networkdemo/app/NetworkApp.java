package com.xianghe.networkdemo.app;

import android.app.Application;

import com.blankj.utilcode.util.Utils;
import com.orhanobut.logger.AndroidLogAdapter;
import com.orhanobut.logger.Logger;

public class NetworkApp extends Application {

    private static NetworkApp mInstance;

    @Override
    public void onCreate() {
        super.onCreate();
        mInstance = this;
        Utils.init(this);
        Logger.addLogAdapter(new AndroidLogAdapter());
    }


    public static NetworkApp getInstance(){
        return mInstance;
    }
}
