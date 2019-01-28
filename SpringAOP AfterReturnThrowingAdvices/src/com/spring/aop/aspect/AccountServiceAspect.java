package com.spring.aop.aspect;

import org.aspectj.lang.JoinPoint;

import com.spring.aop.Account;

public class AccountServiceAspect {
public void afterReturningAdvice(JoinPoint joinPoint,Account account) {
	System.out.println("afterReturning method=="+joinPoint.getSignature().getName()+
			"   class=="+joinPoint.getTarget().getClass().getSimpleName());
	System.out.println(account);
}
public void AfterThrowingAdvice(JoinPoint joinPoint,Exception e) {
	System.out.println("afterThrowingAdvice method=="+joinPoint.getSignature().getName()+
			"   class=="+joinPoint.getTarget().getClass().getSimpleName());
	System.out.println("exception===>"+e.getMessage());
	e.printStackTrace();
}

}
