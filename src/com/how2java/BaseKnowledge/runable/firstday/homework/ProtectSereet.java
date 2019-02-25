package com.how2java.BaseKnowledge.runable.firstday.homework;

import com.how2java.BaseKnowledge.runable.firstday.Hero;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by LuYaoSheng
 * Created time 2019/01/17 23:21
 * Description
 */
public class ProtectSereet {
    public static void main(String[] args) {
        String[] arr = {"A", "B", "C", "D", "E", "F", "G",
                "H", "I", "J", "K", "L", "M", "N",
                "O", "P", "Q", "R", "S", "T", "U",
                "V", "W", "X", "Y", "Z", "q", "w", "e", "r", "t", "y", "u", "i", "o", "p", "a", "s", "d", "f", "g",
                "h", "j", "k", "l", "z", "x", "c", "v", "b", "n", "m", "`", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0"};
        System.out.println("枚举的字符个数：" + String.valueOf(arr.length));
        StringBuffer d = new StringBuffer();
        Random random = new Random();//默认构造方法
        for (int count = 3; count > 0; count--) {
            int i = random.nextInt(arr.length);
            d.append(arr[i]);
        }
        System.out.println("本次生成的密码是：[" + d + "]");
        System.out.println("—————————开始线程———————————————");
        Hero hero = new Hero();
        hero.setSerectList(new ArrayList<String>());
        //t1 破解线程，使用穷举法，匹配这个密码
        BreakThread t1 = new BreakThread(hero, d.toString());

        //日志线程，打印都用过哪些字符串去匹配，这个日志线程设计为守护线程
        SecretThread t2 = new SecretThread(hero);

        //设置t2为守护线程,启动线程
        t2.setDaemon(true);
        t1.start();
        t2.start();

    }
}