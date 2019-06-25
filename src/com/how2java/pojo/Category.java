package com.how2java.pojo;

import org.springframework.stereotype.Component;

/**
 * Created by LuYaoSheng
 * Created time 2019/01/15 20:42
 * Description 类别
 */

@Component
public class Category {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
