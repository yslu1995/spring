package com.how2java.aspect;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * 辅助日志功能业务
 */
public class LoggerAspect {

    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
        //打印出调用的方法名称
        System.out.println("start log:" + joinPoint.getSignature().getName());
        Object object = joinPoint.proceed();
        //打印出调用的方法名称
        System.out.println("end log:" + joinPoint.getSignature().getName());
        return object;
    }
}