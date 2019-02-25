package com.how2java.BaseKnowledge.Exception.train;

/**
 * Created by LuYaoSheng
 * Created time 2019/02/25 21:21
 * Description 支票账户
 */
public class CheckingAccount extends Account {
    private double overdraftProtection;

    public CheckingAccount() {
    }

    public CheckingAccount(double money) {
        super(money);
    }

    public void setOverdraftProtection(double money) {
        this.overdraftProtection = money;
    }

    public double getOverdraftProtection() {
        return overdraftProtection;
    }
}