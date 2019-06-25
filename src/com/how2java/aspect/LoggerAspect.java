package com.how2java.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * 辅助日志功能业务
 */

//注解表示这是一个切面 aop
@Aspect
//表示这是一个bean,由Spring进行管理
@Component
public class LoggerAspect {
    /**
     * 声明日志切面
     * * 返回任意类型
     * com.how2java.service.ProductService.* 包名以 com.how2java.service.ProductService 开头的类的任意方法
     * (..) 参数是任意数量和类型
     */
    @Around(value = "execution(* com.how2java.service.ProductService.*(..))")
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
        //打印出调用的方法名称
        System.out.println("开始执行核心业务:" + joinPoint.getSignature().getName());
        //核心代码
        Object object = joinPoint.proceed();
        //打印出调用的方法名称
        System.out.println("核心业务执行结束:" + joinPoint.getSignature().getName());
        return object;
    }

    /**
     * 指定某种方法
     * @param joinPoint
     * @return
     * @throws Throwable
     */
    @Around(value = "execution(* com.how2java.service.UserService.doPerson())")
    public Object logT(ProceedingJoinPoint joinPoint) throws Throwable {
        //打印出调用的方法名称
        System.out.println("正在统计在线人数:" + joinPoint.getSignature().getName());
        //核心代码
        Object object = joinPoint.proceed();
        //打印出调用的方法名称
        System.out.println("统计在线人数功能结束！:" + joinPoint.getSignature().getName());
        return object;
    }
}