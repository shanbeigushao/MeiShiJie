package com.xxx.asus.meishijie.custem;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.widget.*;
import com.xxx.asus.meishijie.R;
import com.xxx.asus.meishijie.fragment.HeadViewPagerFragment;
import com.xxx.asus.meishijie.model.HeadEntity;
import java.util.List;


/**
 * Created by asus on 2016/2/25.
 */
public class HeadPagerView extends LinearLayout implements ViewPager.OnPageChangeListener {

    private static final String TAG = "print";
    private FragmentManager fragmentManager;
    public ViewPager viewPager;
    public NavView navView;

    public HeadPagerView(Context context, FragmentManager fragmentManager) {
        super(context);
        this.fragmentManager = fragmentManager;
        init();
    }

    private void init() {
        LayoutInflater.from(getContext()).inflate(R.layout.head_viewpager, this, true);
        navView = (NavView) findViewById(R.id.naview);
        viewPager = (ViewPager) findViewById(R.id.head_viewpager);
        viewPager.addOnPageChangeListener(this);

    }

    public void setData(HeadEntity datas){
        if (datas != null) {
            List<HeadEntity.ObjEntity.SanCanTitlesEntity> san_can_titles = datas.getObj().getSan_can_titles();
            int count = san_can_titles.size();
            Log.e(TAG, "JSON------------>"+count);
            HeadViewPagerAdapter adapter = new HeadViewPagerAdapter(fragmentManager, datas, count);
            Log.e(TAG, "JSON------------> adapter");
            viewPager.setAdapter(adapter);
        }
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
        if(navView.getCount() > 0) {
            navView.setNavAddress(position, positionOffset);
        }
    }

    @Override
    public void onPageSelected(int position) {

    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }

    class HeadViewPagerAdapter extends FragmentStatePagerAdapter{
        private HeadEntity data;
        private  int count;

        public HeadViewPagerAdapter(FragmentManager fm, HeadEntity data, int count) {
            super(fm);
            Log.e(TAG, "JSON------------> HeadViewPagerAdapter");
            this.data = data;
            this.count = count;
        }

        @Override
        public Fragment getItem(int position) {
            Log.e(TAG, "JSON------------> getItem");
            return HeadViewPagerFragment.getInstance(data, position);
        }

        @Override
        public int getCount() {
            Log.e(TAG, "JSON------------> getCount");
            return count;
        }
    }
}

