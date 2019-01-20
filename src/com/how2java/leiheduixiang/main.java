package com.how2java.leiheduixiang;

/**
 * Created by LuYaoSheng
 * Created time 2019/01/20 20:28
 * Description
 */
public class main {
    public static void main(String[] args) {
        //通过new实例化会报错
//      Hero g = new Hero();

        //只能通过getInstance得到对象

        Hero g1 = Hero.getInstance();
        Hero g2 = Hero.getInstance();
        Hero g3 = Hero.getInstance();

        //都是同一个对象
        System.out.println(g1==g2);
        System.out.println(g1==g3);
    }
}