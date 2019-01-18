package com.how2java.runable.firstday.task;

import com.how2java.runable.firstday.Hero;

import java.util.Random;

/**
 * 多线程--继承线程类
 * 继承Thread，并且重写run方法
 *
 * @Author: LYS
 * @Date: 2019/1/17 16:40
 */
public class KillThread extends Thread {

    private Hero h1;
    private Hero h2;

    public KillThread(Hero h1, Hero h2) {
        this.h1 = h1;
        this.h2 = h2;
    }
    public void run() {
        Random random = new Random();//默认构造方法
        while (!h2.isDead()) {
            try {
                int i2 = random.nextInt(1000);
                Thread.sleep(i2);
            } catch (InterruptedException e) {

                e.printStackTrace();
            }
            h1.attackHero(h2);
        }
    }
}
