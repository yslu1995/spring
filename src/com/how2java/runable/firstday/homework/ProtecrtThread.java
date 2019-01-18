package com.how2java.runable.firstday.homework;

import com.how2java.runable.firstday.Hero;
import com.how2java.runable.firstday.task.KillThread;

/**
 * Created by LuYaoSheng
 * Created time 2019/01/17 22:02
 * Description
 */
public class ProtecrtThread {
    public static void main(String[] args) {
        final Hero gareen = new Hero();
        gareen.name = "盖伦";
        gareen.hp = 6160;
        gareen.damage = 1;

        final Hero teemo = new Hero();
        teemo.name = "提莫";
        teemo.hp = 3000;
        teemo.damage = 1;

        KillThread killThread1 = new KillThread(gareen, teemo); //构造方法来初始化对象
//        killThread1.setPriority(Thread.MAX_PRIORITY);
        killThread1.start();


        Thread t1 = new Thread() {
            public void run() {
                int seconds = 0;

                while (true) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.printf("已经玩了LOL %d 秒%n", seconds++);

                }
            }
        };
        t1.setDaemon(true);
        t1.start();

    }
}