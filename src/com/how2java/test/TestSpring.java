package com.how2java.test;

import com.how2java.pojo.Product;
import com.how2java.service.ProductService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] { "applicationContext.xml" });

//        Category c = (Category) context.getBean("c");
//
//        System.out.println(c.getName());

//        Product product = (Product) context.getBean("product");
//
//        System.out.println(product.getId());

        Product p = (Product) context.getBean("p");

        System.out.println("-----------华丽的分割线---------------");
        System.out.println(p.getName());
        System.out.println(p.getCategory().getName());

        System.out.println("-----------华丽的分割线---------------");
        ProductService s = (ProductService) context.getBean("s");
        s.doSomeService();



    }
}