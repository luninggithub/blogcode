package com.blog.code.myblogcode;

import java.io.Closeable;
import java.io.IOException;

/**
 * Created by luning03 on 2016/8/24.
 */
public final class CloseUtils {
    private CloseUtils() { }
    public static void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}