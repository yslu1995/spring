package com.how2java.leiheduixiang;

/**
 * Created by LuYaoSheng
 * Created time 2019/01/20 20:23
 * Description 单例-懒汉式（调用的时候才会new单例对象）
 */
public class Item {

    private String name;

    private Integer hp;

    private Item() {
    }

    private static Item instance;

    public static Item getInstance() {
        //第一次访问的时候，发现instance没有指向任何对象，这时实例化一个对象
        if (null == instance) {
            instance = new Item();
        }
        return instance;
    }
}