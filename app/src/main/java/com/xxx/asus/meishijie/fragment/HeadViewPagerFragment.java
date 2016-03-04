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
public class HeadViewPagerFragment extends BaseFrament{
    private static final String TAG = "print";
    @Bind(R.id.head_image_1)
    public SimpleDraweeView iamge1;
    @Bind(R.id.head_image_2)
    public SimpleDraweeView iamge2;
    @Bind(R.id.head_image_3)
    public SimpleDraweeView iamge3;
    @Bind(R.id.head_title)
    public TextView texttitle;
    @Bind(R.id.head_cont)
    public TextView textcont;
    @Bind(R.id.head_image_title_1)
    public TextView texttitle1;
    @Bind(R.id.head_image_cont_1)
    public TextView textcont1;
    @Bind(R.id.head_image_title_2)
    public TextView texttitle2;
    @Bind(R.id.head_image_cont_2)
    public TextView textcont2;
    @Bind(R.id.head_image_title_3)
    public TextView texttitle3;
    @Bind(R.id.head_image_cont_3)
    public TextView textcont3;



    public static Fragment getInstance(HeadEntity headEntity, int position){
        HeadViewPagerFragment fragment = new HeadViewPagerFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable(Contants.KEY.HEAD_ENTITY, headEntity);
        bundle.putInt(Contants.KEY.POSITION, position);
        fragment.setArguments(bundle);
        return fragment;
    }
    @Override
    protected int getViewResid() {
        Log.e(TAG, "JSON------------> getViewResid");
        return R.layout.head_viewpager_layout;
    }

    @Override
    protected void getDatas(Bundle arguments) {
        HeadEntity headEntity = (HeadEntity) arguments.getSerializable(Contants.KEY.HEAD_ENTITY);
        int count = arguments.getInt(Contants.KEY.POSITION);
        List<HeadEntity.ObjEntity.SanCanEntity> san_can = headEntity.getObj().getSan_can();
        List<HeadEntity.ObjEntity.SanCanTitlesEntity> san_can_titles = headEntity.getObj().getSan_can_titles();
        Log.e(TAG, "JSON------------>" + san_can.get(count).getTitlepic());
        FrescoUtil.imageViewBind(san_can.get(count*3).getTitlepic(), iamge1);
        FrescoUtil.imageViewBind(san_can.get(count*3 + 1).getTitlepic(), iamge2);
        FrescoUtil.imageViewBind(san_can.get(count*3 + 2).getTitlepic(), iamge3);
        texttitle.setText(san_can_titles.get(count).getTitle());
        textcont.setText(san_can_titles.get(count).getSub_title());
        texttitle1.setText(san_can.get(count * 3).getTitle());
        textcont1.setText(san_can.get(count*3).getDescr());
        texttitle2.setText(san_can.get(count*3 + 1).getTitle());
        textcont2.setText(san_can.get(count*3 + 1).getDescr());
        texttitle3.setText(san_can.get(count*3+ 2).getTitle());
        textcont3.setText(san_can.get(count*3+ 2).getDescr());

    }
}
