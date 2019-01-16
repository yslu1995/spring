//package com.how2java.test;
//
//import com.how2java.service.ProductService;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
//public class TestSpring {
//
//    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext(
//                new String[] { "applicationContext.xml" });
////        Category c = (Category) context.getBean("c");
////        System.out.println(c.getName());
////        Product product = (Product) context.getBean("product");
////        System.out.println(product.getId())
////        Product p = (Product) context.getBean("p");
////        System.out.println("-----------华丽的分割线---------------");
////        System.out.println(p.getName());
////        System.out.println(p.getCategory().getName());
//        System.out.println("-----------华丽的分割线---------------");
//        ProductService s = (ProductService) context.getBean("s");
//        s.doSomeService();
//    }
//}

package com.how2java.test;

import com.how2java.pojo.Category;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.Scanner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestSpring {
    @Resource
    Category c;

    @Test
    public void test() {
        System.out.println(c.getName());
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        System.out.println("第一个整数：" + a);
        int b = s.nextInt();
        System.out.println("第二个整数：" + b);
    }


}