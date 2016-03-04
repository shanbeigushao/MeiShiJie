package com.xxx.asus.meishijie.adapter;

import android.content.Context;
import com.xxx.asus.meishijie.R;
import com.xxx.asus.meishijie.base.AbsBaseAdapter;
import com.xxx.asus.meishijie.model.KnowLikeEntity;


/**
 * Created by asus on 2016/2/29.
 */
public class ListViewAdapter extends AbsBaseAdapter<KnowLikeEntity.ObjEntity.CustomizedEntity.DataEntity> {

    private static final String TAG = "print" ;

    public ListViewAdapter(Context context) {
        super(context, R.layout.item_fiveview_layout);
    }

    @Override
    public void bindDatas(ViewHolder viewHolder, KnowLikeEntity.ObjEntity.CustomizedEntity.DataEntity data) {
        viewHolder.bindTextView(R.id.list_name1, data.getTitle());
        viewHolder.bindSimpleDraweeView(R.id.two_iamge, data.getTitlepic());

    }
}
