package com.xxx.asus.meishijie.util;

import android.os.Handler;

import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * OkHttp的工具类
 */
public class OkHttpUtil {

    private static OkHttpClient okHttpClient;
    private static Handler handler = new Handler();

    public static void initOkHttp(){
        okHttpClient = new OkHttpClient.Builder()
                .connectTimeout(10, TimeUnit.SECONDS)
                .readTimeout(10, TimeUnit.SECONDS)
                .writeTimeout(10, TimeUnit.SECONDS)
                .build();
    }



    /**
     * 下载json
     * @param url
     */
    public static void downJSON(final String url, final OnDownDataListener onDownDataListener){
        Request request = new Request.Builder()
                .url(url)
                .build();

        Call call = okHttpClient.newCall(request);
        call.enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                if(onDownDataListener != null){
                    onDownDataListener.onFailure(url, e.getMessage());
                }
            }

            @Override
            public void onResponse(Call call, final Response response) throws IOException {
                final String str = response.body().string();
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        if(onDownDataListener != null){
                            onDownDataListener.onResponse(url, str);
                        }
                    }
                });
            }
        });
    }


    /**
     * 同步get请求 -- 让子类调用
     * @return
     */
    public static Response downResponse(String url){
        Request request = new Request.Builder()
                .url(url)
                .build();

        Call call = okHttpClient.newCall(request);
        try {
            return call.execute();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * post提交表单
     */
    public static void postSubmitForm(final String url, Map<String, String> params, final OnDownDataListener onDownDataListener){
        if(params.size() > 0) {
            FormBody.Builder builder = new FormBody.Builder();
            for(String key : params.keySet()){
                String value = params.get(key);
                builder.add(key, value);
            }
            FormBody formBody = builder.build();

            final Request request = new Request.Builder()
                    .url(url)
                    .post(formBody)
                    .build();

            okHttpClient.newCall(request).enqueue(new Callback() {
                @Override
                public void onFailure(Call call, IOException e) {

                }

                @Override
                public void onResponse(Call call, final Response response) throws IOException {
                    final String str = response.body().string();
                    handler.post(new Runnable() {
                        @Override
                        public void run() {
                            if(onDownDataListener != null){
                                onDownDataListener.onResponse(url, str);
                            }
                        }
                    });
                }
            });
        }
    }



    public interface OnDownDataListener{
        void onResponse(String url, String json);
        void onFailure(String url, String error);
    }
}
