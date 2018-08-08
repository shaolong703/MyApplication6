package com.example.a10000.myapplication;

import android.util.Log;

public class Translation {
    private int status;

    private content content;

    private static class content {
        private String from;
        private String to;
        private String vendor;
        private String out;
        private int errNo;

    }


    public String getForm() {
        return content.from;
    }

    //定义 输出返回数据 的方法
    public void show() {
        System.out.println(status);
        Log.e("abcdd", "status---------------->" + status);
        Log.e("abcdd", "to---------------->" + content.to);
        Log.e("abcdd", "from---------------->" + content.from);
        Log.e("abcdd", "vendor---------------->" + content.vendor);
        Log.e("abcdd", "out---------------->" + content.out);
        Log.e("abcdd", "errNo---------------->" + content.errNo);
        System.out.println(content.from);
        System.out.println(content.to);
        System.out.println(content.vendor);
        System.out.println(content.out);
        System.out.println(content.errNo);
    }
}