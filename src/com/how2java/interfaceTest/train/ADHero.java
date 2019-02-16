package com.how2java.interfaceTest.train;

/**
 * @Description:
 * @Author: LYS
 * @Date: 2019/2/16 11:45
 */
public class ADHero extends Hero implements Mortal {
    @Override
    public void die() {
        System.out.println("战士 die!");
    }
}
