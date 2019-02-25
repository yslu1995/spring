package com.how2java.BaseKnowledge.zhuangxiang.train;

/**
 * Created by LuYaoSheng
 * Created time 2019/02/19 22:13
 * Description
 */
public class mahin {
    public static void main(String[] args) {

        //int的最大值
        System.out.println(Integer.MAX_VALUE);
        //int的最小值
        System.out.println(Integer.MIN_VALUE);

//        1. 对byte,short,float,double进行自动拆箱和自动装箱
        byte a = 1;
        Byte A = a;
        short b = 1;
        Short B = b;
        float c = 1l;
        Float C = c;
        double d = 3;
        Double D = d;
        System.out.println(A + "," + B + "," + C + "," + D);
//        2. byte和Integer之间能否进行自动拆箱和自动装箱  不能
        byte hh =12;
//        Integer dd = hh;

//        3. 通过Byte获取byte的最大值

        Byte kk = Byte.MAX_VALUE;
        System.out.println(kk);

    }
}