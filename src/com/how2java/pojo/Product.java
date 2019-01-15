package com.how2java.pojo;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Created by LuYaoSheng
 * Created time 2019/01/15 20:57
 * Description 练习对象
 */
@Component("p")
public class Product {
    private Integer number;

    private int id;
    private String name="product1";

    @Resource
    private Category category;

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

    public Category getCategory() {
        return category;
    }


    public void setCategory(Category category) {
        this.category = category;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}