package com.how2java.runable.homework;

import com.how2java.runable.Hero;

/**
 * @Description: 课后作业
 * @Author: LYS
 * @Date: 2019/1/17 17:42
 */
public class HomeWok {
    public static void main(String[] args) {
        Hero hero = new Hero();
        HeroThread fajineng = new HeroThread(hero);
        fajineng.start();

    }

}
