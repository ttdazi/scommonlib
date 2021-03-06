package com.aidazi.scommonlib.utils;

import java.text.DecimalFormat;

/**
 * author: Y_Qing
 * date: 2019/4/28
 */
public class StringFormat {


    public static String float2String(float flatValue) {
        return String.format("%.2f", flatValue);
    }

    public static String decimalFloat2String(float flatValue) {
        DecimalFormat df = new DecimalFormat("#.00");
        return df.format(flatValue);
    }
    public static String phone2Format(String phone) {
        return phone.replaceAll("(\\d{3})\\d{4}(\\d{4})", "$1****$2");
    }
}
