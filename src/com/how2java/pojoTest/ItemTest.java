package com.how2java.pojoTest;

//适应于高并发的json封装
//import com.alibaba.fastjson.JSON;

import com.alibaba.fastjson.JSON;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

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
//        System.out.println(JSON.toJSONString(blood));

        Item caoxie = new Item();
        caoxie.setName("草鞋");
        caoxie.setPrice(300);
//        System.out.println(JSON.toJSONString(caoxie));

        Item changjian = new Item();
        changjian.setName("长剑");
        changjian.setPrice(350);
//        System.out.println(JSON.toJSONString(changjian));
        System.out.println("succeed");

    }

    @Test
    public void test2() {
        Hero hero = new Hero();
        System.out.println(hero.getHp());

        hero.legendary();

        hero.recovery(35.0f);

        System.out.println(hero.getHp());
    }

    /**
     * 查找黄金分割数
     */
    @Test
    public void test4() {
        Map<String, String> result = new TreeMap<String, String>(
                new Comparator<String>() {
                    public int compare(String obj2, String obj1) {
                        // 降序排序
                        return obj2.compareTo(obj1);
                    }
                });
        for (float i = 1; i < 21; i++) {
            for (float j = 1; j < i; j++) {
                if ((i + j) % 2 == 0) {
                    continue;
                }
                result.put(String.valueOf(Math.abs(j / i - 0.618)), "j/i=" + j + "/" + i + "=" + j / i);
            }
        }
        System.out.println(JSON.toJSONString(result));
    }


    /**
     * 寻找水仙花数
     */
    @Test
    public void test5() {
        int a;
        int b;
        int c;
        for (int i = 100; i < 999; i++) {
            a = i / 100;
            b = (i - 100 * a) / 10;
            c = i % 10;
            if ((a * a * a + b * b * b + c * c * c) == i) {
                System.out.println("水仙花数找到了！" + i);
            }
        }
    }


}
