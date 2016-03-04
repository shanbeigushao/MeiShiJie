package com.xxx.asus.meishijie.adapter;

import android.content.Context;
import android.util.Log;

import com.xxx.asus.meishijie.R;
import com.xxx.asus.meishijie.base.AbsBaseAdapter;
import com.xxx.asus.meishijie.model.HeadEntity;


/**
 * Created by asus on 2016/2/29.
 */
public class FiveViewAdapter extends AbsBaseAdapter<HeadEntity.ObjEntity.ShopsEntity> {

    private static final String TAG = "print" ;

    public FiveViewAdapter(Context context) {
        super(context, R.layout.item_fiveview_layout);
    }

    @Override
    public void bindDatas(ViewHolder viewHolder, HeadEntity.ObjEntity.ShopsEntity data) {
        Log.e(TAG, "bindDatas------------>" + data.getImage());
        viewHolder.bindTextView(R.id.five_name, data.getTitle());
        viewHolder.bindTextView(R.id.five_cone1, data.getPrice());
        viewHolder.bindTextView(R.id.five_cone2, data.getGuige());
        viewHolder.bindSimpleDraweeView(R.id.two_iamge, data.getImage());
    }
}
