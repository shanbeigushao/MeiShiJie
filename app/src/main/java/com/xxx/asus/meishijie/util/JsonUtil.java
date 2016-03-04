package com.xxx.asus.meishijie.util;

import com.google.gson.Gson;
import com.xxx.asus.meishijie.model.HeadEntity;
import com.xxx.asus.meishijie.model.KnowLikeEntity;

/**
 * Created by asus on 2016/2/27.
 */
public class JsonUtil {
    //获得评论数据
    public static HeadEntity geHeadByJSON(String json){
        return new Gson().fromJson(json, HeadEntity.class);
    }
    public static KnowLikeEntity getListByJSON(String json){
        return new Gson().fromJson(json, KnowLikeEntity.class);
    }
}
