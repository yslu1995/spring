package com.how2java.runable.firstday;

import com.how2java.runable.firstday.task.KillThread;

/**
 * @Description:
 * @Author: LYS
 * @Date: 2019/1/17 16:29
 */
public class TestThread {
    public static void main(String[] args) {

        final Hero gareen = new Hero();
        gareen.name = "盖伦";
        gareen.hp = 6160;
        gareen.damage = 1;

        final Hero teemo = new Hero();
        teemo.name = "提莫";
        teemo.hp = 3000;
        teemo.damage = 1;

        final Hero bh = new Hero();
        bh.name = "赏金猎人";
        bh.hp = 5000;
        bh.damage = 1;

        final Hero leesin = new Hero();
        leesin.name = "盲僧";
        leesin.hp = 4550;
        leesin.damage = 1;

//        //盖伦攻击提莫
//        while(!teemo.isDead()){
//            gareen.attackHero(teemo);
//        }
//
//        //赏金猎人攻击盲僧
//        while(!leesin.isDead()){
//            bh.attackHero(leesin);
//        }

        //way1（推荐）  继承Thread，并且重写run方法 class类编程一个线程
        //启动线程办法： 实例化一个KillThread对象，并且调用其start方法
        KillThread killThread1 = new KillThread(gareen,teemo); //构造方法来初始化对象
        KillThread killThread2 = new KillThread(bh,leesin);
        killThread1.setPriority(Thread.MAX_PRIORITY);
        killThread2.setPriority(Thread.MIN_PRIORITY);
        killThread1.start();
        killThread2.start();

        //way2  实现Runnable接口  该接口也有runable方法
        //启动线程办法： 实例化一个Battle对象，新建一个线程并且调用其start方法
//        Battle battle1 = new Battle(gareen,teemo);
//        new Thread(battle1).start();
//        Battle battle2 = new Battle(bh,leesin);
//        new Thread(battle2).start();

        //way3
        //匿名类 重写run方法
//        Thread t1= new Thread(){
//            public void run(){
//                //匿名类中用到外部的局部变量teemo，必须把teemo声明为final
//                //但是在JDK7以后，就不是必须加final的了
//                while(!teemo.isDead()){
//                    gareen.attackHero(teemo);
//                }
//            }
//        };
//        t1.start();
//        Thread t2= new Thread(){
//            public void run(){
//                while(!leesin.isDead()){
//                    bh.attackHero(leesin);
//                }
//            }
//        };
//        t2.start();

//        Thread t1= new Thread(){
//            public void run(){
//                while(!teemo.isDead()){
//                    gareen.attackHero(teemo);
//                }
//            }
//        };
//
//        t1.start();
//
//        //代码执行到这里，一直是main线程在运行
//        try {
//            //t1线程加入到main线程中来，只有t1线程运行结束，才会继续往下走
//            t1.join();
//        } catch (InterruptedException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
//
//        Thread t2= new Thread(){
//            public void run(){
//                while(!leesin.isDead()){
//                    bh.attackHero(leesin);
//                }
//            }
//        };
//        //会观察到盖伦把提莫杀掉后，才运行t2线程
//        t2.start();
    }
}
