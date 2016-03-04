package com.xxx.asus.meishijie.util;

/**
 * Created by asus on 2016/2/27.
 */
public interface Contants {
    interface URL{
        String HEAD_DATAS = "http://api.meishi.cc/v5/index4.php?format=json";
        String KONWLIKE_DATAS = "http://api.meishi.cc/v5/index4.php?format=json&c_md5=958586a040c1db0420851cf2e13487fe&page=2";
    }
    interface KEY{
        String HEAD_ENTITY = "headDatas";
        String POSITION = "position";
        String FOUR_ENTITY = "fourDatas";
    }
}
