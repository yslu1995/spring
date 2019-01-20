package com.how2java.pojoTest;

/**
 * @Description:
 * @Author: LYS
 * @Date: 2019/1/16 8:11
 */
public class Item {
    private String name;

    private int price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static void main(String[] args) {

        float a = 3.14f;
        String b = String.valueOf(a);
        System.out.println(b);
        Float A = a;
        String c = A.toString();
        System.out.println(c);
        String d = "3.14";
        float e = Float.parseFloat(d);
        System.out.println(e);


    }
}
