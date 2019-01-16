package com.how2java.pojoTest;

/**
 * @Description: 英雄
 * @Author: LYS
 * @Date: 2019/1/16 8:26
 */
public class Hero {
    private float hp = 23.5f;

    public void setHp(float hp) {
        this.hp = hp;
    }

    public void legendary() {
        System.out.println("超神了！");
    }

    public float getHp() {
        return this.hp;
    }

    public void recovery(Float blood) {
        this.hp = this.hp + blood;
    }

}
