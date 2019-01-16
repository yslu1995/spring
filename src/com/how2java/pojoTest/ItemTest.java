package com.how2java.pojoTest;

import com.alibaba.fastjson.JSON;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Author: LYS
 * @Date: 2019/1/16 8:12
 * 类别测试
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class ItemTest {
    @Test
    public void test1() {
        Item blood = new Item();
        blood.setName("血瓶");
        blood.setPrice(50);
        System.out.println(JSON.toJSONString(blood));

        Item caoxie = new Item();
        caoxie.setName("草鞋");
        caoxie.setPrice(300);
        System.out.println(JSON.toJSONString(caoxie));

        Item changjian = new Item();
        changjian.setName("长剑");
        changjian.setPrice(350);
        System.out.println(JSON.toJSONString(changjian));
        System.out.println("succeed");

    }

    @Test
    public void test2() {
        Hero hero = new Hero();
        System.out.println(hero.getHp());

        hero.legendary();

        hero.recovery(35.0f);

        System.out.println(hero.getHp());
//        System.out.println(JSON.toJSONString());
    }
}
