package com.blog.code.myblogcode;

import android.graphics.Bitmap;

import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by luning03 on 2016/8/24.
 */
public class LSPExample {

    // 窗口类
    public class Window {
        public void show(View child) {
            child.draw();
        }
    }

    // 建立视图抽象，measure为共有代码，draw的实现交给具体子类
    public abstract class View {
        public abstract void draw();
        public void measure(int width, int height) {
            // 测量视图大小
        }
    }

    // 按钮类的实现
    public class Button extends View {

        @Override
        public void draw() {
            // 绘制按钮
        }
    }

    // TextView的具体实现
    public class TextView extends View {

        @Override
        public void draw() {
            // 绘制文本
        }
    }

    // 接口隔离
    public void put(String dir, Bitmap bmp) {
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(dir);
            bmp.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
        }catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } finally {
            CloseUtils.closeQuietly(fileOutputStream);
        }
    }


    // Demeter 原则
    public class Room {
        public float area;
        public float price;
        public Room(float area, float price) {
            this.area = area;
            this.price = price;
        }
    }

}
