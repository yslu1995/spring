package com.how2java.BaseKnowledge.io.train9;

import java.io.Serializable;

/**
 * @Description:
 * @Author: LYS
 * @Date: 2019/3/3 13:40
 */
public class Hero implements Serializable{
    //表示这个类当前的版本，如果有了变化，比如新设计了属性，就应该修改这个版本号
    private static final long serialVersionUID = 1L;
    public String name;
    public float hp;
}
