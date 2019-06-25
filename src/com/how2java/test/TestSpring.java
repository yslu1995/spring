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

import com.alibaba.fastjson.JSON;
import com.how2java.pojo.Category;
import com.how2java.pojo.Product;
import com.how2java.service.ProductService;
import com.how2java.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

/**
 * 注解方式测试！！
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestSpring {
    @Resource
    private Category c;
    @Resource
    private Product product;

    @Resource
    private ProductService productService;

    @Resource
    private UserService userService;
    @Test
    public void test() {
        System.out.println("正在输出："+ JSON.toJSONString(c));
        System.out.println("正在输出："+ JSON.toJSONString(product));
        System.out.println("正在输出："+product.getName());
        System.out.println("正在输出："+product.getId());
        System.out.println("正在输出："+product.getId());



//        Scanner s = new Scanner(System.in);
//        int a = s.nextInt();
//        System.out.println("第一个整数：" + a);
//        int b = s.nextInt();
//        System.out.println("第二个整数：" + b);
    }

    /**
     * aop单元测试
     */
    @Test
    public void aopTest(){
        productService.doSomeService();
        productService.doSomethingBad();
        userService.doPerson();
    }

    @Test
    public void test2() {
        List<String> d = new ArrayList<>();
        d.add("dwd");
        System.out.println("-----------------");
        d.add("1234");
        System.out.println(d.get(0) + ":" + d.get(1));
        d.remove(0);
        System.out.println("-----------------");
        System.out.println(d.get(0));
        System.out.println("-----------------");
        d.add("lys");
        System.out.println(d.get(0) + ":" + d.get(1));
    }

    @Test
    public void test3() {
        String[] arr = {"A", "B", "C", "D", "E", "F", "G",
                "H", "I", "J", "K", "L", "M", "N",
                "O", "P", "Q", "R", "S", "T", "U",
                "V", "W", "X", "Y", "Z", "q", "w", "e", "r", "t", "y", "u", "i", "o", "p", "a", "s", "d", "f", "g",
                "h", "j", "k", "l", "z", "x", "c", "v", "b", "n", "m", "`", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0"};
        System.out.println("枚举的字符个数：" + String.valueOf(arr.length));
        List<String> f = new ArrayList<>();
        StringBuffer d = new StringBuffer();
        Random random = new Random();//默认构造方法
        for (int count = 3; count > 0; count--) {
            int i = random.nextInt(arr.length);
            d.append(arr[i]);
        }
        f.add(d.toString());
        System.out.println("--------------mima");
        System.out.println(d);
        System.out.println("--------------list");
        System.out.println(f.get(0));
    }
    @Test
    public void test4() {
        StringBuffer d = new StringBuffer();
        d.append("d");
        d.append("c");
        d.append("e");

        System.out.println("--------------");
        System.out.println(d.toString());
        d.delete(0,1);
        System.out.println("--------------list");
        System.out.println(d.toString());
    }

    @Test
    public void test5(){
        long a = 502625466264L;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        Date date = new Date(a);
        String dateString =  sdf.format(date);
        System.out.println("----------------------");
        System.out.println(dateString);
    }
}