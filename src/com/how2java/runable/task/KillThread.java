package com.how2java.runable.task;

import com.how2java.runable.Hero;

/**
 * 多线程--继承线程类
 *  继承Thread，并且重写run方法
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
        while (!h2.isDead()) {
            h1.attackHero(h2);
        }
    }
}
