package com.xxx.asus.meishijie.custem;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.GridView;

/**
 * Created by asus on 2016/2/17.
 */
public class NoScrollGridView extends GridView{
    public NoScrollGridView(Context context) {
        super(context);
    }

    public NoScrollGridView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
       int expandspec = MeasureSpec.makeMeasureSpec(Integer.MAX_VALUE>>2,MeasureSpec.AT_MOST);
        super.onMeasure(widthMeasureSpec, expandspec);
    }
}
