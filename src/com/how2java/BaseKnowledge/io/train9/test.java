package com.how2java.BaseKnowledge.io.train9;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Author: LYS
 * @Date: 2019/3/3 13:40
 */
public class test {
    public static void main(String[] args) {
        //创建一个Hero garen
        //要把Hero对象直接保存在文件上，务必让Hero类实现Serializable接口
        Hero h = new Hero();
        h.name = "garen";
        h.hp = 616;
        //准备一个文件用于保存该对象
        File f = new File("d:/garen.lol");
        try (
                //创建对象输出流
                FileOutputStream fos = new FileOutputStream(f);
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                //创建对象输入流
                FileInputStream fis = new FileInputStream(f);
                ObjectInputStream ois = new ObjectInputStream(fis);
        ) {
            List<Hero> heroList = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                Hero hero = new Hero();
                hero.hp = i * 10;
                hero.name = "英雄" + i;
                heroList.add(hero);
            }
            oos.writeObject(heroList);
            List<Hero> heroList1 = (List<Hero>) ois.readObject();

            for (Hero hero : heroList1) {
                System.out.println(hero.name);
                System.out.println(hero.hp);
            }


        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
