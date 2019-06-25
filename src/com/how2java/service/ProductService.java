package com.how2java.service;

import org.springframework.stereotype.Component;

/**
 * 业务类 默认productService
 */
@Component
public class ProductService {
    public void doSomeService() {
        System.out.println("doSomeService");
    }

  public void doSomethingBad() {
            System.out.println("开车！");
    }
}