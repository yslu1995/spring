package com.how2java.BaseKnowledge.runable.ThreadPool;

/**
 * @Description:
 * @Author: LYS
 * @Date: 2019/2/25 17:20
 */
public class TestThread {
    public static void main(String[] args) {
        ThreadPool pool = new ThreadPool();

        for (int i = 0; i < 5; i++) {
            Runnable task = new Runnable() {
                @Override
                public void run() {
                    System.out.println("执行任务");
                    //任务可能是打印一句话
                    //可能是访问文件
                    //可能是做排序
                }
            };

            pool.add(task);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
