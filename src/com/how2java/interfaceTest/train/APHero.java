package com.how2java.interfaceTest.train;

/**
 * @Description:
 * @Author: LYS
 * @Date: 2019/2/16 11:45
 */
public class APHero extends Hero implements Mortal {
    @Override
    public void die() {
        System.out.println("法师 die!");
    }
}
