package com.how2java.BaseKnowledge.Exception.train;

/**
 * Created by LuYaoSheng
 * Created time 2019/02/25 21:22
 * Description
 */
public class train2 {
    public static void main(String[] args) {
        CheckingAccount paybuy = new CheckingAccount(Double.valueOf("256"));
        paybuy.setOverdraftProtection(Double.valueOf("200"));
        try {
            for (int i = 0; i < 20; i++) {
                paybuy.withdraw(50);
                if ((paybuy.getBalance() + paybuy.getOverdraftProtection()) < 0) {
                    throw new OverdraftException("余额不足！请立即充值  当前欠费：" + paybuy.getBalance() + " 额度为：" + paybuy.getOverdraftProtection());
                }
            }
        } catch (OverdraftException e) {
            e.printStackTrace();
        }
    }
}