package com.how2java.BaseKnowledge.interfaceTest.train;

/**
 * @Description: 练习
 * @Author: LYS
 * @Date: 2019/2/16 10:51
 */
//immortal是不朽的，不死的意思
//        mortal就是终有一死的，凡人的意思
//
//
//        1. 设计一个接口
//        接口叫做Mortal,其中有一个方法叫做die
//        2. 实现接口
//        分别让ADHero,APHero,ADAPHero这三个类，实现Mortal接口，不同的类实现die方法的时候，都打印出不一样的字符串
//        3. 为Hero类，添加一个方法,在这个方法中调用 m的die方法。
//
//public void kill(Mortal m)
//
//
//        4. 在主方法中
//        首先实例化出一个Hero对象:盖伦
//        然后实例化出3个对象，分别是ADHero,APHero,ADAPHero的实例
//        然后让盖伦 kill 这3个对象


public class train {
    public static void main(String[] args) {
        ADHero ad = new ADHero();
        APHero ap = new APHero();
        ADAPHero adap = new ADAPHero();
        Hero hero = new Hero();
//        hero.setName("gailun");
//        hero.kill(ad);
//        hero.kill(ap);
//        hero.kill(adap);
    }
}
