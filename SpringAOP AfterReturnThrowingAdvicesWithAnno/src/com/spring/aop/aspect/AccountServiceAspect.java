package com.spring.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import com.spring.aop.Account;

@Aspect
@Component
public class AccountServiceAspect {
	@AfterReturning(value="execution(* com.spring.aop.impl.AccountServiceImpl.*(..))",returning="account")
	public void afterReturningAdvice(JoinPoint joinPoint, Account account) {
		System.out.println("afterReturning method==" + joinPoint.getSignature().getName() + "   class=="
				+ joinPoint.getTarget().getClass().getSimpleName());
		System.out.println(account);
	}
     @AfterThrowing(value="execution(* com.spring.aop.impl.AccountServiceImpl.*(..))",throwing="e")
	public void AfterThrowingAdvice(JoinPoint joinPoint, Exception e) {
		System.out.println("afterThrowingAdvice method==" + joinPoint.getSignature().getName() + "   class=="
				+ joinPoint.getTarget().getClass().getSimpleName());
		System.out.println("exception=====>" + e.getMessage());
		e.printStackTrace();
	}

}
