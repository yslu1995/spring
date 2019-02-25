package com.how2java.BaseKnowledge.runable.firstday;


import java.util.List;

/**
 * @Description:
 * @Author: LYS
 * @Date: 2019/1/17 16:33
 */
public class Hero {
//    private org.slf4j.Logger logger = LoggerFactory.getLogger(Hero.class);
//    PropertyConfigurator.configure("e:\\workspace\\spring\\src\\log4j.properties");
    public String name;
    public float hp;

    public int damage;

    public List<String> serectList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getHp() {
        return hp;
    }

    public void setHp(float hp) {
        this.hp = hp;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public List<String> getSerectList() {
        return serectList;
    }

    public void setSerectList(List<String> serectList) {
        this.serectList = serectList;
    }

    public void attackHero(Hero h) {
        //把暂停时间去掉，多条线程各自会尽力去占有CPU资源
        //线程的优先级效果才可以看得出来
//        try {
//
//            Thread.sleep(0);
//        } catch (InterruptedException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
        h.hp -= damage;
        System.out.format("%s 正在攻击 %s, %s的血变成了 %.0f%n", name, h.name, h.name, h.hp);

        if (h.isDead())
            System.out.println(h.name + "死了！");
    }

    public boolean isDead() {
        return 0 >= hp ? true : false;
    }

    public void sendADuoGei(){
        System.out.println("波动拳:啊多给！");
    }
}
