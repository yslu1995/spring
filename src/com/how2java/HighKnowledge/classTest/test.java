package com.how2java.HighKnowledge.classTest;

/**
 * @Description:
 * @Author: LYS
 * @Date: 2019/3/24 9:46
 */
public class test {
    public static void main(String[] args) {
        String className = "com.how2java.HighKnowledge.classTest.Hero";
        try {
//            Hero hero = new Hero();
            Class pClass1=Class.forName(className);
            Class pClass2=Hero.class;
            Class pClass3=new Hero().getClass();
            System.out.println();
            System.out.println(pClass1==pClass2);
            System.out.println(pClass1==pClass3);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }
    

}
