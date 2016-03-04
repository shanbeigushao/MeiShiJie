package com.xxx.asus.meishijie.base;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.ButterKnife;

/**
 * Created by asus on 2016/2/25.
 */
public abstract class BaseFrament extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(getViewResid(), container, false);
        ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        init();
        loadDatas();
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        getDatas(getArguments());
    }
    protected  void loadDatas(){}

    protected  void init(){}

    /***
     * 绑定布局
     * @return
     */
    protected abstract  int getViewResid();
    /**
     * 解析获得的数据
     * @param arguments
     */
    protected void getDatas(Bundle arguments) {

    }


}
