package com.blog.code.myblogcode.loader;

import android.graphics.Bitmap;

/**
 * Created by luning03 on 2016/8/24.
 */
public class MemoryCache implements ImageCache {
    @Override
    public Bitmap get(String url) {
        return null;
    }

    @Override
    public void put(String url, Bitmap bmp) {
        // 自定义存储逻辑
    }


}
