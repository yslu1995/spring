package com.how2java.BaseKnowledge.runable.mergeTrain;

import com.how2java.BaseKnowledge.runable.mergeTrain.thread.KillThread;
import com.how2java.BaseKnowledge.runable.secondday.Hero;

public class merge {
    public static void main(String[] args) {
        //启动一个线程
        Hero gareen = new Hero();
        gareen.name = "盖伦";
        gareen.hp = 616;
        gareen.damage = 50;

        Hero teemo = new Hero();
        teemo.name = "提莫";
        teemo.hp = 300;
        teemo.damage = 30;

        Hero bh = new Hero();
        bh.name = "赏金猎人";
        bh.hp = 500;
        bh.damage = 65;

        Hero leesin = new Hero();
        leesin.name = "盲僧";
        leesin.hp = 455;
        leesin.damage = 80;

        KillThread killThread1 = new KillThread(gareen,teemo);
        killThread1.start();
        KillThread killThread2 = new KillThread(bh,leesin);
        killThread2.start();
    }
}
