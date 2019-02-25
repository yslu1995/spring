package com.how2java.BaseKnowledge.runable.secondday.homework;

/**
 * @Description:  作业： 设计让abc发生死锁
 * @Author: LYS
 * @Date: 2019/1/18 11:10
 */
public class TestThread {
    public static void main(String[] args) {
        final String dianwei = "典韦";
        final String kai = "凱";
        final String luban = "鲁班";
        Thread t1 = new Thread() {
            public void run() {
                synchronized (dianwei) {
                    System.out.println("t1 已占有 典韦");
                    try {
                        //等待其他线程有足够的时间来占有各自的英雄
                        Thread.sleep(1000);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    System.out.println("t1 试图占有 凱");
                    System.out.println("t1 等待中");
                    synchronized (kai) {
                        System.out.println("t1 已占有 凱");
                    }
                }
            }
        };
        Thread t2 = new Thread() {
            public void run() {
                synchronized (kai) {
                    System.out.println("t2 已占有 凱");
                    try {
                        //等待其他线程有足够的时间来占有各自的英雄
                        Thread.sleep(1000);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    System.out.println("t2 试图占有 鲁班");
                    System.out.println("t2 等待中");
                    synchronized (luban) {
                        System.out.println("t2 已占有 鲁班");
                    }
                }
            }
        };
        Thread t3 = new Thread() {
            public void run() {
                synchronized (luban) {
                    System.out.println("t3 已占有 鲁班");
                    try {
                        //等待其他线程有足够的时间来占有各自的英雄
                        Thread.sleep(1000);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    System.out.println("t3 试图占有 典韦");
                    System.out.println("t3 等待中");
                    synchronized (dianwei) {
                        System.out.println("t3 已占有 典韦");
                    }
                }
            }
        };
        t1.start();
        t2.start();
        t3.start();

    }
}
