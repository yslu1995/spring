package com.how2java.BaseKnowledge.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by LuYaoSheng
 * Created time 2019/01/20 22:40
 * Description 练习：找出下个月的倒数第三天
 */
public class main3 {
    private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public static void main(String[] arg){
//        Calendar calendar = Calendar.getInstance();
//        calendar.add(Calendar.MONTH, -1);
//        calendar.set(Calendar.DAY_OF_MONTH, 1);
//        System.out.println("当前日期：\t" + format(calendar.getTime()));

//        Date now = c.getTime();
//        // 当前日期
//        System.out.println("当前日期：\t" + format(c.getTime()));

//        // 下个月的今天
//        c.setTime(now);
//        c.add(Calendar.MONTH, 1);
////        c.add(Calendar.DAY_OF_MONTH, );
//
//        System.out.println("下个月的今天:\t" +format(c.getTime()));
        // 下个月的倒数第三天
        Calendar c = Calendar.getInstance();
        c.add(Calendar.MONTH, 2);
        c.set(Calendar.DATE, -4);
        System.out.println("下个月的倒数第三天:\t" +format(c.getTime()));
    }

    private static String format(Date time) {
        return sdf.format(time);
    }
}