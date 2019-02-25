package com.how2java.BaseKnowledge.runable.firstday.homework;

import com.how2java.BaseKnowledge.runable.firstday.Hero;

/**
 * @Description: 密码日志守护
 * @Author: LYS
 * @Date: 2019/1/18 8:06
 */
public class SecretThread extends Thread {

    private Hero hero;

    public SecretThread(Hero hero) {
        this.hero = hero;
    }

    @Override
    public void run() {
        if (hero.getSerectList().size() == 0) {
            try {
                System.out.println("集合对象为空，休息1秒！");
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("正在打印字符串：" + hero.getSerectList().get(0));
            hero.getSerectList().remove(0);
        }
    }
}
