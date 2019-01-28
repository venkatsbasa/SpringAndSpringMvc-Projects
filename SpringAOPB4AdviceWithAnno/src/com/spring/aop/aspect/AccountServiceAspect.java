package com.spring.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
@Aspect
@Component
public class AccountServiceAspect {
	@Pointcut("execution(* com.spring.aop.impl.AccountServiceImpl.*(..))\"")
	public void selectAll() {
		
	}
@Before("selectAll()")
public void beforeAdvice(JoinPoint joinPoint) {
	System.out.println("Before method=="+joinPoint.getSignature().getName()+
			"   class=="+joinPoint.getTarget().getClass().getSimpleName());
}
@After("selectAll()")
public void afterAdvice(JoinPoint joinPoint) {
	System.out.println("After method=="+joinPoint.getSignature().getName()+
			"   class=="+joinPoint.getTarget().getClass().getSimpleName());
}
}
