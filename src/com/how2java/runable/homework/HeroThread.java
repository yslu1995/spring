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
        int seconds = 3;
        while (true) {
            try {
                if (seconds > 0) {
                    System.out.print("第" + (4 - seconds) + "拳" + ":");
                    hero.sendADuoGei();
                    seconds--;
                    try {
                        Thread.sleep(1000);
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                } else {
                    System.out.println("cd中......");
                    Thread.sleep(5000);
                    seconds = 3;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
