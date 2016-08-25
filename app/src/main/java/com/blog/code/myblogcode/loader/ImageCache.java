package com.blog.code.myblogcode.loader;

import android.graphics.Bitmap;

/**
 * Created by luning03 on 2016/8/24.
 */
public interface ImageCache {
    public Bitmap get(String url);
    public void put(String url, Bitmap bmp);
}
