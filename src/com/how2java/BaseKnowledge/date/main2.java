package com.how2java.BaseKnowledge.date;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

/**
 * Created time 2019/01/20 21:58
 * Description 准备一个长度是9的日期数组
 * 使用1970年-2000年之间的随机日期初始化该数组
 */
public class main2 {
    public static void main(String[] args) {
        long[] dates = new long[9];
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date start = new Date();
        Date end = new Date();
        try {
            start = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss").parse("1970.1.1 00:00:00");
            end = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss").parse("2000.12.31 23:59:59");
        } catch (Exception r) {
            r.printStackTrace();
        }
        for (int i=0;i<dates.length;i++) {
            //产生随机时间1970-2000
            dates[i] = (long) (1 + Math.random() * (end.getTime() - start.getTime() + 1)) + start.getTime();
            System.out.println(dates[i]);
        }
        System.out.println("打印生成的时间") ;


        for (long date : dates) {
            long a = date;
            Date date1 = new Date(a);
            String dateString =  sdf.format(date1);
            System.out.println(dateString);
        }
        Arrays.sort(dates);
        System.out.println("排序后---------") ;
        for (long date : dates) {
            long a = date;
            Date date1 = new Date(a);
            String dateString =  sdf.format(date1);
            System.out.println(dateString);
        }
    }
}