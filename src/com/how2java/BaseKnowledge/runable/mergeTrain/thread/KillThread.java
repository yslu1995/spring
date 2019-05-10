package com.how2java.BaseKnowledge.runable.mergeTrain.thread;


import com.how2java.BaseKnowledge.runable.secondday.Hero;

/**
 * @author Administrator
 */
public class KillThread extends Thread{
    private Hero h1;
    private Hero h2;

    public KillThread(Hero h1, Hero h2){
        this.h1 = h1;
        this.h2 = h2;
    }

    @Override
    public void run(){
        while(!h2.isDead()){
            h1.attackHero(h2);
        }
    }

}
