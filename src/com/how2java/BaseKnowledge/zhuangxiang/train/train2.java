package com.how2java.BaseKnowledge.zhuangxiang.train;

/**
 * Created by LuYaoSheng
 * Created time 2019/02/19 22:33
 * Description
 */
public class train2 {
    public static void main(String[] args) {

        //int的最大值
        System.out.println(Integer.MAX_VALUE);
        //int的最小值
        System.out.println(Integer.MIN_VALUE);

//        把浮点数 3.14 转换为 字符串 "3.14"
        Double pai = 3.14;
        String a = String.valueOf(pai);
        System.out.println("1.  " + a);

//        再把字符串 “3.14” 转换为 浮点数 3.14
        pai = Double.valueOf(a);
        System.out.println("2.  " + pai);
//        如果字符串是 3.1a4，转换为浮点数会得到什么？
        String asd = "3.1a4";
        Double aa = Double.valueOf(asd);
//        System.out.println("3.  " + aa);  抛出异常

    }
}