package com.xxx.asus.meishijie.fragment;

import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;

import com.facebook.drawee.view.SimpleDraweeView;
import com.xxx.asus.meishijie.R;
import com.xxx.asus.meishijie.adapter.FiveViewAdapter;
import com.xxx.asus.meishijie.adapter.ListViewAdapter;
import com.xxx.asus.meishijie.adapter.TwoViewAdapter;
import com.xxx.asus.meishijie.base.BaseFrament;
import com.xxx.asus.meishijie.custem.FourPagerView;
import com.xxx.asus.meishijie.custem.HeadPagerView;
import com.xxx.asus.meishijie.custem.NoScrollGridView;
import com.xxx.asus.meishijie.custem.ThereView;
import com.xxx.asus.meishijie.model.HeadEntity;
import com.xxx.asus.meishijie.model.KnowLikeEntity;
import com.xxx.asus.meishijie.util.Contants;
import com.xxx.asus.meishijie.util.FrescoUtil;
import com.xxx.asus.meishijie.util.JsonUtil;
import com.xxx.asus.meishijie.util.OkHttpUtil;

import java.util.List;

import butterknife.Bind;

/**
 * Created by asus on 2016/2/25.
 */
public class RecomentFragment extends BaseFrament implements OkHttpUtil.OnDownDataListener {
    @Bind(R.id.listview)
    public ListView listView;
    private String [] str = {"xx","xx"};
    private HeadPagerView headPagerView;
    private NoScrollGridView gridView;
    private TwoViewAdapter gridViewAdapter;
    private ThereView thereView;
    private FourPagerView fourPagerView;
    private NoScrollGridView fiveGridViewfive;
    private FiveViewAdapter fiveViewAdapter;
    private ListViewAdapter adapter;

    @Override
    protected int getViewResid() {
        return R.layout.fragment_recoment;
    }

    @Override
    protected void init() {
        //获得头部控件
        headPagerView = new HeadPagerView(getActivity(), getActivity().getSupportFragmentManager());
        //获得第二个控件
        gridView = new NoScrollGridView(getActivity());
        gridView.setNumColumns(4);
        gridViewAdapter = new TwoViewAdapter(getActivity());
        gridView.setAdapter(gridViewAdapter);
        //得到第三个控件
        thereView = new ThereView(getContext());
        //得到第四个控件
        fourPagerView = new FourPagerView(getActivity(), getActivity().getSupportFragmentManager());
        //获得第五个控件
        fiveGridViewfive = new NoScrollGridView(getActivity());
        fiveGridViewfive.setNumColumns(2);
        fiveViewAdapter = new FiveViewAdapter(getActivity());
        fiveGridViewfive.setAdapter(fiveViewAdapter);


        listView.addHeaderView(headPagerView);
        listView.addHeaderView(gridView);
        listView.addHeaderView(thereView);
        listView.addHeaderView(fourPagerView);
        listView.addHeaderView(fiveGridViewfive);
        adapter = new ListViewAdapter(getContext());
        listView.setAdapter(adapter);
    }

    @Override
    protected void loadDatas() {
            OkHttpUtil.downJSON(Contants.URL.HEAD_DATAS, this);
            OkHttpUtil.downJSON(Contants.URL.KONWLIKE_DATAS, this);
    }

    @Override
    public void onResponse(String url, String json) {
        if (url.equals(Contants.URL.HEAD_DATAS)) {
            HeadEntity headEntity = JsonUtil.geHeadByJSON(json);
            //头部添加数据
            headPagerView.setData(headEntity);
            //第二个添加数据
            gridViewAdapter.setDatas(headEntity.getObj().getFenlei());
            //第三个添加数据
            thereView.setData(headEntity);
            //第四个添加数据
            fourPagerView.setData(headEntity);
            //第五个添加数据
            //第四个添加数据
            fiveViewAdapter.setDatas(headEntity.getObj().getShops());
        }else if (url.equals(Contants.URL.KONWLIKE_DATAS)){
            KnowLikeEntity knowLikeEntity = JsonUtil.getListByJSON(json);
            List<KnowLikeEntity.ObjEntity.CustomizedEntity.DataEntity> data = knowLikeEntity.getObj().getCustomized().getData();
            adapter.setDatas(data);

        }

    }

    @Override
    public void onFailure(String url, String error) {

    }
}
