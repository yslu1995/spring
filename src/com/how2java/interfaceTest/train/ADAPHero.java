package com.how2java.interfaceTest.train;

/**
 * @Description:
 * @Author: LYS
 * @Date: 2019/2/16 11:46
 */
public class ADAPHero extends Hero implements Mortal {
    @Override
    public void die() {
        System.out.println("勇士 die!");
    }
}
