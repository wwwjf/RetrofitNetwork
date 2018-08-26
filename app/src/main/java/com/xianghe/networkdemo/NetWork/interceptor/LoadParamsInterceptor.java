package com.xianghe.networkdemo.NetWork.interceptor;

import android.text.TextUtils;
import android.util.Log;

import com.xianghe.networkdemo.app.NetworkConstants;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/**
 * 添加接口公共参数
 */
public class LoadParamsInterceptor implements Interceptor {
    private static final String TAG = LoadParamsInterceptor.class.getSimpleName();
    @Override
    public Response intercept(Chain chain) throws IOException {
        Request originalRequest = chain.request();
        HttpUrl originalHttpUrl = originalRequest.url();
        HttpUrl.Builder builder = originalHttpUrl.newBuilder();
        String sign = NetworkConstants.signValue;
        //用户token
        //Android客户端
        builder.addQueryParameter("ClientSource", "1");
        //客户端系统版本
        builder.addQueryParameter("ClientSystem", "20180801");
//        builder.addQueryParameter("ClientSystem", "micromessenger");
        //APP版本
        builder.addQueryParameter("Version", "Android5.0");
        //签名为空，生成签名
        if (TextUtils.isEmpty(sign)) {
            Set<String> parameterNames = builder.build().queryParameterNames();
            HashMap<String,String> treeMap = new HashMap<>();
            for (String parameterName : parameterNames) {
                Log.e(TAG, "intercept: parameterName="+parameterName);
                List<String> parameterValues = builder.build().queryParameterValues(parameterName);
                for (String parameterValue : parameterValues) {
                    Log.e(TAG, "intercept: parameterValue="+parameterValue);
                    treeMap.put(parameterName,parameterValue);
                }
            }
            Iterator<String> iterator = treeMap.keySet().iterator();
            while (iterator.hasNext()){
                String next = iterator.next();
            }
            Log.e(TAG, "intercept: sign=" + sign);
        }
        //请求数据签名
        builder.addQueryParameter("sign", sign);
        Request request = originalRequest.newBuilder()
                .url(builder.build())
                .method(originalRequest.method(), originalRequest.body())
                .build();

        return chain.proceed(request);
    }
}
