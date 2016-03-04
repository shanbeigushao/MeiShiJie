package com.xxx.asus.meishijie.adapter;

import android.content.Context;
import android.util.Log;

import com.xxx.asus.meishijie.R;
import com.xxx.asus.meishijie.base.AbsBaseAdapter;
import com.xxx.asus.meishijie.model.HeadEntity;


/**
 * Created by asus on 2016/2/29.
 */
public class TwoViewAdapter extends AbsBaseAdapter<HeadEntity.ObjEntity.FenleiEntity> {

    private static final String TAG = "print" ;

    public TwoViewAdapter(Context context) {
        super(context, R.layout.item_twoview_layout);
    }

    @Override
    public void bindDatas(ViewHolder viewHolder, HeadEntity.ObjEntity.FenleiEntity data) {
        Log.e(TAG, "bindDatas------------>" + data.getImage());
        viewHolder.bindTextView(R.id.two_text, data.getTitle());
        viewHolder.bindSimpleDraweeView(R.id.two_iamge, data.getImage());
    }
}
