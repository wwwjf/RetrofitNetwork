package com.xianghe.networkdemo.NetWork.interceptor;

import android.util.Log;

import com.orhanobut.logger.Logger;

import java.io.IOException;
import java.util.Locale;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/**
 * 日志打印
 */
public class LoggingInterceptor implements Interceptor {
    public static final String TAG = LoggingInterceptor.class.getSimpleName();
    @Override
    public Response intercept(Chain chain) throws IOException {

        Request request = chain.request();
        Log.v(TAG, "request:" + request.toString());
        long t1 = System.nanoTime();
        okhttp3.Response response = chain.proceed(chain.request());
        long t2 = System.nanoTime();
        Log.v(TAG, String.format(Locale.getDefault(), "Received response %s for %s in %.1fms%n%s",
                response.code(),response.request().url(), (t2 - t1) / 1e6d, response.headers()));
        okhttp3.MediaType mediaType = response.body().contentType();
        String content = response.body().string();
//        Log.i(TAG, "response body:" + content);
        Logger.json(content);
        return response.newBuilder().body(okhttp3.ResponseBody.create(mediaType, content)).build();

    }
}
