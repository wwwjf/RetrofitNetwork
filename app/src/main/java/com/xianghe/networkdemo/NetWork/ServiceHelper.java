package com.xianghe.networkdemo.NetWork;

import android.util.Log;

import com.xianghe.networkdemo.model.response.BaseResponse;

import java.util.List;

import retrofit2.Call;

/**
 * 请求处理的通用模块
 */
public final class ServiceHelper {

    private static final String TAG = ServiceHelper.class.getSimpleName();
    private ServiceHelper() {
        throw new RuntimeException("ServiceHelper cannot be initialized!");
    }


    /**
     * 获取单个实体的处理操作
     *
     * @param call        请求
     * @param entityClass 实体类型
     * @param listener    监听器
     */
    public static <T> void callEntity(Call<BaseResponse> call, final Class<T> entityClass,
                                      final OnRequestListener<T> listener) {
        call.enqueue(new RequestCallBack() {
            @Override
            protected void onDataObtain(String jsonData,String msg) {
                T info = GsonHelper.convertEntity(jsonData, entityClass);
                if (info == null) {
                    if (listener != null) {
                        listener.onFailure("对象解析失败");
                    }
                } else {
                    if (listener != null) {
                        listener.onResponse(info,msg);
                    }
                }
            }

            @Override
            protected void onError(String errMsg) {
                if (listener != null) {
                    listener.onFailure(errMsg);
                }
            }
        });
    }

    /**
     * 获取复数实体的处理操作
     *
     * @param call        请求
     * @param entityClass 实体类型
     * @param listener    监听器
     */
    public static <T> void callEntities(Call<BaseResponse> call, final Class<T> entityClass,
                                        final OnRequestListener<List<T>> listener) {
        call.enqueue(new RequestCallBack() {
            @Override
            protected void onDataObtain(String jsonData,String msg) {
                Log.e(TAG, "onDataObtain");
                List<T> infos = GsonHelper.convertEntities(jsonData, entityClass);
                if (infos == null) {
                        Log.e(TAG, "onDataObtain: 对象解析失败");
                    if (listener != null) {
                        listener.onFailure("对象解析失败");
                    }
                } else {
                    if (listener != null) {
                        Log.e(TAG, "onDataObtain: ");
                        listener.onResponse(infos,msg);
                    }
                }
            }

            @Override
            protected void onError(String errMsg) {
                Log.e(TAG, "onError: errMsg:"+errMsg);
                if (listener != null) {
                    listener.onFailure(errMsg);
                }
            }
        });
    }
}

