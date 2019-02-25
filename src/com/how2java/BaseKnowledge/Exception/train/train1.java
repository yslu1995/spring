package com.how2java.BaseKnowledge.Exception.train;

/**
 * Created by LuYaoSheng
 * Created time 2019/02/25 21:08
 * Description 账户透支演示
 */
public class train1 {
    public static void main(String[] args) {
        Account paybuy = new Account(Double.valueOf("256"));
        try {
            for (int i = 0; i < 20; i++) {
                paybuy.withdraw(20);
                if (paybuy.getBalance() < 0) {
                    throw new OverdraftException("余额不足！请立即充值" + i);
                }
            }
        } catch (OverdraftException e) {
            e.printStackTrace();
        }
    }
}