package com.yq.scommonlib.log;


import android.util.Log;

public class SLog {

    private static boolean isEnable;


    public static void setIsEnable(boolean isEnable) {
        SLog.isEnable = isEnable;
    }

    public static void i(String tag, String s) {
        if (isEnable) {
            Log.i(tag, s);
        }

    }

    public static void i(String s) {
        if (isEnable) {
            String tag = getTargetStackTraceTag();
            Log.i(tag, s);
        }

    }


    public static void d(String tag, String s) {
        if (isEnable) {
            Log.d(tag, s);
        }

    }


    public static void e(String s) {
        if (isEnable) {
            String tag = getTargetStackTraceTag();
            Log.e(tag, s);
        }
    }

    public static void w(String tag, String s) {
        if (isEnable) {
            Log.w(tag, s);
        }

    }

    public static void w(String s) {
        if (isEnable) {
            String tag = getTargetStackTraceTag();
            Log.w(tag, s);
        }
    }


    public static void e(String tag, String s) {
        if (isEnable) {
            Log.e(tag, s);
        }

    }

    public static void d(String s) {
        if (isEnable) {
            String tag = getTargetStackTraceTag();
            Log.d(tag, s);
        }
    }

    private static String getTargetStackTraceTag() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        return "ddd";
    }


}
