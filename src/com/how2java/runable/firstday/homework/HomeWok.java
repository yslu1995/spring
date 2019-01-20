package com.how2java.runable.firstday.homework;

/**
 * @Description: 课后作业
 * @Author: LYS
 * @Date: 2019/1/17 17:42
 */
public class HomeWok {
    //    public static void main(String[] args) {
//        Hero hero = new Hero();
//        HeroThread fajineng = new HeroThread(hero);
//        fajineng.start();
    public static void main(String[] args) {
        int i = 3; //二进制是11
        int j = 2; //二进制是10
        int c = ((i | j) ^ (i & j)) << 2 >>> 1;
        //  11        10
        //		01     <<  2
        //			  0100   >>>  1
        //					 010
        System.out.println(c);
    }
//    }
}
