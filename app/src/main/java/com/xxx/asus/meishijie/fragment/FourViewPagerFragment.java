package com.xxx.asus.meishijie.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;
import com.xxx.asus.meishijie.R;
import com.xxx.asus.meishijie.base.BaseFrament;
import com.xxx.asus.meishijie.model.HeadEntity;
import com.xxx.asus.meishijie.util.Contants;
import com.xxx.asus.meishijie.util.FrescoUtil;

import java.util.List;

import butterknife.Bind;

/**
 * Created by asus on 2016/2/27.
 */
public class FourViewPagerFragment extends BaseFrament{
    private static final String TAG = "print";
    @Bind(R.id.four_image_1)
    public SimpleDraweeView simpleDraweeView;



    public static Fragment getInstance(HeadEntity.ObjEntity.Top3Entity datas){
        FourViewPagerFragment fragment = new FourViewPagerFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable(Contants.KEY.FOUR_ENTITY, datas);
        fragment.setArguments(bundle);
        return fragment;
    }
    @Override
    protected int getViewResid() {
        Log.e(TAG, "JSON------------> getViewResid");
        return R.layout.four_viewpager_layout;
    }

    @Override
    protected void getDatas(Bundle arguments) {
        HeadEntity.ObjEntity.Top3Entity datas = (HeadEntity.ObjEntity.Top3Entity) arguments.getSerializable(Contants.KEY.FOUR_ENTITY);
        FrescoUtil.imageViewBind(datas.getPhoto(), simpleDraweeView);

    }
}
