package com.how2java.BaseKnowledge.Exception.train;

/**
 * Created by LuYaoSheng
 * Created time 2019/02/25 20:57
 * Description 银行账户
 */
public class Account {
    //余额
    private double balance;

    //透支额
    private double deficit;


    public  Account() {
    }

    public  Account(double money) {
        this.balance = money;
    }

    //查询余额
    public double getBalance() {
        return balance;
    }

    //存钱
    public void deposit(double money) {
        balance = balance + money;
        if (balance < 0) {
            deficit = balance;
        } else {
            deficit = 0;
        }
    }

    //取钱
    public void withdraw(double money) {
        balance = balance - money;
        if (balance < 0) {
            deficit = balance;
        } else {
            deficit = 0;
        }
    }
}