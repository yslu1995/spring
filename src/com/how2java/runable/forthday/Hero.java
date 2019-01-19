package com.how2java.runable.forthday;

/**
 * @Description:
 * @Author: LYS
 * @Date: 2019/1/19 11:57
 */
public class Hero {
    public String name;
    public float hp;

    public int damage;

    public synchronized void recover() {
        if (hp == 1000) {
            try {
                // 让占有this的加血线程，暂时释放对this的占有，并等待
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        hp = hp + 1;
        System.out.printf("%s 回血1点,增加血后，%s的血量是%.0f%n", name, name, hp);
        // 通知那些等待在this对象上的线程，可以醒过来了，如第20行，等待着的减血线程，苏醒过来
        this.notify();
    }

    public synchronized void hurt() {
        if (hp <= 1) {
//        while (hp <= 1) {
            try {
                // 让占有this的减血线程，暂时释放对this的占有，并等待,当被唤醒时，再从这一行执行下去
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        hp = hp - 1;
        System.out.printf("%s 减血1点,减少血后，%s的血量是%.0f%n", name, name, hp);
        this.notify();
    }

    public void attackHero(Hero h) {
        h.hp -= damage;
        System.out.format("%s 正在攻击 %s, %s的血变成了 %.0f%n", name, h.name, h.name, h.hp);
        if (h.isDead())
            System.out.println(h.name + "死了！");
    }

    public boolean isDead() {
        return 0 >= hp ? true : false;
    }
}
