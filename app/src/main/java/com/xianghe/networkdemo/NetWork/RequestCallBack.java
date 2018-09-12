package com.xianghe.networkdemo.NetWork;

import android.util.Log;

import com.xianghe.networkdemo.model.response.BaseResponse;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * 对CallBack进行封装
 */
public abstract class RequestCallBack implements Callback<BaseResponse> {

    public static final String TAG = RequestCallBack.class.getSimpleName();

    // 请求成功是的状态值
    private static final String RESPONSE_SUCC = "1";
    // 请求失败是的状态值
    private static final String RESPONSE_FAIL = "0";

    @Override
    public void onResponse(Call<BaseResponse> call, Response<BaseResponse> response) {
        Log.e(TAG, "onResponse: ");
        BaseResponse body = response.body();
        handleResponse(body);
    }

    @Override
    public void onFailure(Call<BaseResponse> call, Throwable t) {
        Log.e(TAG, "onFailure: ");
        t.printStackTrace();
        onError(t.getMessage());
    }

    /**
     * 处理应答
     *
     * @param response 应答实体
     */
    private void handleResponse(BaseResponse response) {
        try {
            if (response.getStatus() == 0) {
                onError(response.getInfo());
                return;
            }
            if (response.getStatus() == 1) {
                // 请求成功才处理数据
                onDataObtain(GsonHelper.object2JsonStr(response.getData()),response.getInfo());
            } else {
                onError("新增的status值,请处理");
            }
        } catch (Exception e) {
            if (e.getMessage() == null) {
                onError("thread exiting with uncaught exception");
            } else {
                onError(e.getMessage());
            }
        }
    }

    /**
     * 获取json数据
     *
     * @param jsonData json字符串
     * @param msg
     * @return
     */
    protected abstract void onDataObtain(String jsonData, String msg);

    /**
     * 获取错误数据
     *
     * @param errMsg 错误数据
     */
    protected abstract void onError(String errMsg);
}

