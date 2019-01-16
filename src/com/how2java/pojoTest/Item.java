package com.how2java.pojoTest;

import java.util.Scanner;

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
//        Scanner s = new Scanner(System.in);
//        int a = s.nextInt();
//        if (a >= 1 && a <= 5) {
//            System.out.println("今天要上班！");
//        } else {
//            System.out.println("今天吃鸡！");
//        }
//        int i =0;
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int t = a;
        while (t >= 2) {
            a = a * (t - 1);
            t--;
        }
        System.out.println("a的阶乘是：" + a);
    }
}
