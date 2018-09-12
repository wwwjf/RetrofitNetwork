package com.xianghe.networkdemo.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.blankj.utilcode.util.ToastUtils;
import com.xianghe.networkdemo.NetWork.NetworkServiceUtil;
import com.xianghe.networkdemo.NetWork.OnRequestListener;
import com.xianghe.networkdemo.R;
import com.xianghe.networkdemo.model.MovieBean;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = MainActivity.class.getSimpleName();
    public TextView mTextViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        mTextViewResult = (TextView) findViewById(R.id.textView_result);
        NetworkServiceUtil.movieList("new", new OnRequestListener<List<MovieBean>>() {
            @Override
            public void onResponse(List<MovieBean> entity,String msg) {
                ToastUtils.showShort("请求成功");
//                mTextViewResult.setText("请求成功");
                for (MovieBean movieBean : entity) {
                    Log.e(TAG, "onResponse: "+movieBean.toString());
                }
            }

            @Override
            public void onFailure(String errorMsg) {
                String error = "请求失败,"+errorMsg;
                ToastUtils.showShort(error);
//                mTextViewResult.setText(error);
                Log.e(TAG, "onFailure:"+errorMsg);
            }
        });
    }
}
