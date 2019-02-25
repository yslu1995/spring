package com.how2java.BaseKnowledge.runable.firstday.homework;

import com.how2java.BaseKnowledge.runable.firstday.Hero;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:j
 * @Author: LYS
 * @Date: 2019/1/18 8:16
 */
public class BreakThread extends Thread {
    String[] arr = {"A", "B", "C", "D", "E", "F", "G",
            "H", "I", "J", "K", "L", "M", "N",
            "O", "P", "Q", "R", "S", "T", "U",
            "V", "W", "X", "Y", "Z", "q", "w", "e", "r", "t", "y", "u", "i", "o", "p", "a", "s", "d", "f", "g",
            "h", "j", "k", "l", "z", "x", "c", "v", "b", "n", "m", "`", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0"};

    private Hero hero;

    private String targetSecret;

    public BreakThread(Hero hero, String targetSecret) {
        this.hero = hero;
        this.targetSecret = targetSecret;
    }

    @Override
    public void run() {
        StringBuffer stringBuffer = new StringBuffer();
        List<String> stringList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            stringBuffer.append(arr[i]);
            for (int j = 0; j < arr.length; j++) {
                stringBuffer.append(arr[j]);
                for (int k = 0; k < arr.length; k++) {
                    stringBuffer.append(arr[k]);
                    stringList.add(stringBuffer.toString());
                    hero.setSerectList(stringList);
                    if (!stringBuffer.toString().equals(targetSecret)) {
                        stringBuffer.delete(2, 3);
//                        try {
//                            Thread.sleep(100);
//                        } catch (Exception e) {
//                            e.printStackTrace();
//                        }
                        continue;
                    } else {
                        System.out.println("找到密码！密码是：" + stringBuffer.toString());
                        Thread.yield();
                    }
                }
                stringBuffer.delete(1, 2);
            }
            stringBuffer.delete(0, 1);
        }
    }
}

