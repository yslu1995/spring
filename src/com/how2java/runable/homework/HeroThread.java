package com.how2java.runable.homework;

import com.how2java.runable.Hero;

/**
 * @Description:
 * @Author: LYS
 * @Date: 2019/1/17 17:45
 */
public class HeroThread extends Thread {
    private Hero hero;

    public HeroThread(Hero hero) {
        this.hero = hero;
    }

    public void run() {
        try {
            Thread.sleep(5000);
            hero.sendADuoGei();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
