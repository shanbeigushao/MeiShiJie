package com.xxx.asus.meishijie.util;

import android.content.Context;
import android.net.Uri;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.controller.AbstractDraweeController;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.core.ImagePipeline;
import com.facebook.imagepipeline.core.ImagePipelineConfig;

import java.util.logging.SimpleFormatter;

/**
 * Created by asus on 2016/2/25.
 */
public class FrescoUtil {

    public static void initFresco(Context context){
        Fresco.initialize(context);
    }
    public static void initFresco(Context context, ImagePipelineConfig imagePipelineConfig){
        Fresco.initialize(context, imagePipelineConfig);
    }

    /***
     * 普通图片加载
     * @param url
     * @param simpleDraweeView
     */
    public static void imageViewBind(String url, SimpleDraweeView simpleDraweeView){
        Uri uri = Uri.parse(url);
        simpleDraweeView.setImageURI(uri);
    }

    /***
     * 开启图片重新加载
     * @param url
     * @param simpleDraweeView
     */
    public static void imageViewBindRetry(String url, SimpleDraweeView simpleDraweeView){
        Uri uri = Uri.parse(url);
        AbstractDraweeController build = Fresco.newDraweeControllerBuilder()
                .setUri(uri)
                .setTapToRetryEnabled(true)
                .setOldController(simpleDraweeView.getController())
                .build();

        simpleDraweeView.setController(build);
    }
}
