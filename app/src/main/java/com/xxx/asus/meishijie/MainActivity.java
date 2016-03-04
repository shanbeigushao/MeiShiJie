package com.xxx.asus.meishijie;



import android.widget.*;
import android.widget.RadioGroup;

import com.xxx.asus.meishijie.base.BaseActivity;
import com.xxx.asus.meishijie.fragment.RecomentFragment;

import butterknife.Bind;

public class MainActivity extends BaseActivity implements RadioGroup.OnCheckedChangeListener {
    @Bind(R.id.rg_tab)
    public RadioGroup rgTab;

    @Override
    protected int getViewResid() {
        return R.layout.activity_main;
    }

    @Override
    protected void init() {
        rgTab.setOnCheckedChangeListener(this);
        rgTab.getChildAt(0).performClick();
    }
    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        switch (checkedId) {
            case R.id.rb_recoment://推荐
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fl_fragment, new RecomentFragment()).commit();
                break;
            case R.id.rb_discover:break;
            case R.id.rb_shop:break;
            case R.id.rb_topic:break;
            case R.id.rb_wode:break;
        }
    }
}
