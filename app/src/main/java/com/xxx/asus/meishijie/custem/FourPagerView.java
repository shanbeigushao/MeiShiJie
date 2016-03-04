package com.xxx.asus.meishijie.custem;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.widget.LinearLayout;

import com.xxx.asus.meishijie.R;
import com.xxx.asus.meishijie.fragment.FourViewPagerFragment;
import com.xxx.asus.meishijie.fragment.HeadViewPagerFragment;
import com.xxx.asus.meishijie.model.HeadEntity;

import java.util.List;


/**
 * Created by asus on 2016/2/25.
 */
public class FourPagerView extends LinearLayout implements ViewPager.OnPageChangeListener {

    private static final String TAG = "print";
    private FragmentManager fragmentManager;
    public ViewPager viewPager;
    public NavView navView;

    public FourPagerView(Context context, FragmentManager fragmentManager) {
        super(context);
        this.fragmentManager = fragmentManager;
        init();
    }

    private void init() {
        LayoutInflater.from(getContext()).inflate(R.layout.four_viewpager, this, true);
        navView = (NavView) findViewById(R.id.four_naview);
        viewPager = (ViewPager) findViewById(R.id.four_viewpager);
        viewPager.addOnPageChangeListener(this);

    }

    public void setData(HeadEntity datas){
        if (datas != null) {
            List<HeadEntity.ObjEntity.Top3Entity> top3 = datas.getObj().getTop3();
            FourViewPagerAdapter adapter = new FourViewPagerAdapter(fragmentManager, top3);
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

    class FourViewPagerAdapter extends FragmentStatePagerAdapter{
        private List<HeadEntity.ObjEntity.Top3Entity> datas;
        public FourViewPagerAdapter(FragmentManager fragmentManager, List<HeadEntity.ObjEntity.Top3Entity> datas) {
            super(fragmentManager);
            this.datas = datas;
        }

        @Override
        public Fragment getItem(int position) {
            Log.e(TAG, "JSON------------> getItem");
            return FourViewPagerFragment.getInstance(datas.get(position));
        }

        @Override
        public int getCount() {
            return datas.size();
        }
    }
}

