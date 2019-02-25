package com.how2java.BaseKnowledge.Exception.train;

/**
 * Created by LuYaoSheng
 * Created time 2019/02/25 21:07
 * Description 透支异常
 */
public class OverdraftException extends Exception {
    public OverdraftException(){
    }
    public OverdraftException(String msg){
        super(msg);//最后打印的异常
    }
}