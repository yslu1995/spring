package com.how2java.test;

import com.how2java.service.ProductService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description:
 * @Author: LYS
 * @Date: 2019/1/16 17:40
 */
public class NoSpringLimit {
    /**
     * aop单元测试
     */
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
        ProductService s = (ProductService) context.getBean("productService");
        s.doSomeService();
    }
}
