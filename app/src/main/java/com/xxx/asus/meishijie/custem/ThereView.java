package com.xxx.asus.meishijie.custem;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;

import com.facebook.drawee.view.SimpleDraweeView;
import com.xxx.asus.meishijie.R;
import com.xxx.asus.meishijie.fragment.HeadViewPagerFragment;
import com.xxx.asus.meishijie.model.HeadEntity;
import com.xxx.asus.meishijie.util.FrescoUtil;

import java.util.List;


/**
 * Created by asus on 2016/2/25.
 */
public class ThereView extends LinearLayout{

    private static final String TAG = "print";
    private FragmentManager fragmentManager;
    private SimpleDraweeView image1;
    private SimpleDraweeView image2;

    public ThereView(Context context) {
        super(context);
        init();
    }

    private void init() {
        View  view=  LayoutInflater.from(getContext()).inflate(R.layout.three_view, this, true);

        image1 = (SimpleDraweeView) view.findViewById(R.id.threr_simple1);
        image2 = (SimpleDraweeView) view.findViewById(R.id.threr_simple2);
    }

    public void setData(HeadEntity datas){
        if (datas != null) {
            HeadEntity.ObjEntity.Func1Entity func1 = datas.getObj().getFunc1();
            HeadEntity.ObjEntity.Func2Entity func2 = datas.getObj().getFunc2();
            //第三个绑定数据
            FrescoUtil.imageViewBind(func1.getImage(), image1);
            FrescoUtil.imageViewBind(func2.getImage(), image2);
        }
    }
}

