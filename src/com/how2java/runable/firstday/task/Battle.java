package com.how2java.runable.firstday.task;

import com.how2java.runable.firstday.Hero;

/**
 * @Description: 多线程--实现Runnable接口
 * @Author: LYS
 * @Date: 2019/1/17 16:49
 */
public class Battle implements Runnable {
    private Hero h1;
    private Hero h2;

    public Battle(Hero h1, Hero h2){
        this.h1 = h1;
        this.h2 = h2;
    }

    public void run(){
        while(!h2.isDead()){
            h1.attackHero(h2);
        }
    }
}
