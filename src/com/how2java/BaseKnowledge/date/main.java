package com.how2java.BaseKnowledge.date;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by LuYaoSheng
 * Created time 2019/01/20 21:21
 * Description
 */
public class main {
    public static void main(String[] args) {
        Date now = new Date();
//        //当前日期的毫秒数
//        System.out.println("Date.getTime() \t\t\t返回值: "+now.getTime());
//        //通过System.currentTimeMillis()获取当前日期的毫秒数
//        System.out.println("System.currentTimeMillis() \t返回值: "+System.currentTimeMillis());
        //练习：借助随机数，创建一个从1995.1.1 00:00:00 到 1995.12.31 23:59:59 之间的随机日期
        Date start = new Date();
        Date end = new Date();

        //1.获取两个字符串时间的date对象
        try {
            start = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss").parse("1995.1.1 00:00:00");
            end = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss").parse("1995.12.31 23:59:59");
        } catch (Exception r) {
            r.printStackTrace();
        }

        //2.获取两个date的getTime之差放入随机数中，生成一个随机数
//        Random random = new Random();//默认构造方法
//        long dif = end.getTime() - start.getTime();
//        System.out.println("时间差是：" + dif);
//        System.out.println("开始时间是：" + start.getTime());
//        int i2 = random.nextInt((int) dif);
        //产生一个随机时间
        long a = (long) (1 + Math.random() * (end.getTime() - start.getTime() + 1)) + start.getTime();

        //3.将该随机数加上开始时间的gettime，再转化成date时间输出
//        long now1 = start.getTime() + (long) i2;
        Date date = new Date(a);
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateString = formatter.format(date);
        System.out.println("随机的时间是：" + dateString);
    }


}