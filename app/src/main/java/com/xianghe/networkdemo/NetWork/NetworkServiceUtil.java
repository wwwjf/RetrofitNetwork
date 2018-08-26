package com.xianghe.networkdemo.NetWork;

import com.xianghe.networkdemo.model.MovieBean;
import com.xianghe.networkdemo.model.response.BaseResponse;

import java.util.List;

import retrofit2.Call;

public class NetworkServiceUtil {

    private static INetworkService networkService = RetrofitClient.getInstance().create(INetworkService.class);

    /**
     * 影片列表
     * @param param
     * @param listener
     * @return
     */
    public static Call movieList(String param, OnRequestListener<List<MovieBean>> listener) {
        Call<BaseResponse> call = networkService.movieList(param);
        ServiceHelper.callEntities(call, MovieBean.class, listener);
        return call;

    }

    /**
     * 影片详情
     * @param param
     * @param listener
     * @return
     */
    public static Call movieDetail(String param, OnRequestListener<MovieBean> listener) {
        Call<BaseResponse> call = networkService.mediaDetail(param);
        ServiceHelper.callEntity(call, MovieBean.class, listener);
        return call;

    }


}
