package com.how2java.BaseKnowledge.runable.forthday;

/**
 * @Description:
 * @Author: LYS
 * @Date: 2019/1/19 11:58
 */
public class TestThread {
    public static void main(String[] args) {
        final Hero gareen = new Hero();
        gareen.name = "盖伦";
        gareen.hp = 616;

        Thread t1 = new Thread() {
            public void run() {
                while (true) {
                    //无需循环判断
//                    while(gareen.hp==1){
//                        continue;
//                    }
                    gareen.hurt();
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            }
        };
        t1.start();

        Thread t2 = new Thread() {
            public void run() {
                while (true) {
                    gareen.hurt();
                    try {
                        Thread.sleep(20);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            }
        };
        t2.start();

//        Thread t3 = new Thread() {
//            public void run() {
//                while (true) {
//                    //无需循环判断
////                    while(gareen.hp==1){
////                        continue;
////                    }
//                    gareen.hurt();
//                    try {
//                        Thread.sleep(30);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//
//            }
//        };
//        t3.start();
//
//        Thread t4 = new Thread() {
//            public void run() {
//                while (true) {
//                    //无需循环判断
////                    while(gareen.hp==1){
////                        continue;
////                    }
//                    gareen.hurt();
//                    try {
//                        Thread.sleep(40);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//
//            }
//        };
//        t4.start();
//
//        Thread t5 = new Thread() {
//            public void run() {
//                while (true) {
//                    //无需循环判断
////                    while(gareen.hp==1){
////                        continue;
////                    }
//                    gareen.hurt();
//                    try {
//                        Thread.sleep(50);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//            }
//        };
//        t5.start();

        Thread t6 = new Thread() {
            public void run() {
                while (true) {
                    gareen.recover();
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        t6.start();

        Thread t7 = new Thread() {
            public void run() {
                while (true) {
                    gareen.recover();
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        t7.start();
    }
}
