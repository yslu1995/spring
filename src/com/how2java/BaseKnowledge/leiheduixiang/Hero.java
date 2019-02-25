package com.how2java.BaseKnowledge.leiheduixiang;

/**
 * Created by LuYaoSheng
 * Created time 2019/01/20 20:23
 * Description 单例-饿汉式 （初始化的时候已经新建好了单例对象）
 */
public class Hero {

    private String name;

    private Integer hp;

    //私有构造方法，使其无法new对象，因为new对象的时候回调用构造方法！
    private Hero() {}

    private static Hero instance = new Hero();

    public static Hero getInstance() {
        return instance;
    }

}