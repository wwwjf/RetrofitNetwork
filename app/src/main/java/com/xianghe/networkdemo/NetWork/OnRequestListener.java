package com.xianghe.networkdemo.NetWork;

/**
 * 请求监听器
 */
public interface OnRequestListener<T> {

    /**
     * 获取请求实体数据
     * @param entity 实体
     */
    void onResponse(T entity);

    /**
     * 请求失败
     * @param errorMsg 异常数据
     */
    void onFailure(String errorMsg);
}

