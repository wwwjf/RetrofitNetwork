package com.xianghe.networkdemo.NetWork;

import com.xianghe.networkdemo.model.response.BaseResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface INetworkService {

    /**
     * 指定分类数据视频列表
     * @return
     */
    @POST("index_categoryList")
    Call<BaseResponse> movieList(@Query("type") String type);

    /**
     * 单个视频详细信息
     * @param id
     * @return
     */
    @POST("index_mediaDetail")
    Call<BaseResponse> mediaDetail(@Query("id") String id);

}
