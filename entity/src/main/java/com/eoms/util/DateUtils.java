package com.eoms.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public  class DateUtils {
    public static String DateTimeStr(Date date) {
        String dateStr = "";
        DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        dateStr = sdf.format(date);
        return dateStr;
    }

    public static void main(String[] args) {
        Date date=new Date();

        System.out.println(DateTimeStr(date));
    }
    //字符串转换Date格式
    public static Date strForDate(String time){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date dateTime = null;
        try {
            dateTime = simpleDateFormat.parse(time);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return dateTime;
    }
    //date格式转换字符串
    public static String formatDateDay(Date date) {
        String dateStr = "";
        DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        dateStr = sdf.format(date);
        return dateStr;
    }

    public static String formatDateDay8(Date date) {
        String dateStr = "";
        DateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        dateStr = sdf.format(date);
        return dateStr;
    }
}
