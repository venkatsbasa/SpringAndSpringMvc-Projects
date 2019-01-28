package com.spring.aop.aspect;

import org.aspectj.lang.JoinPoint;

public class AccountServiceAspect {
public void beforeAdvice(JoinPoint joinPoint) {
	System.out.println("Before method=="+joinPoint.getSignature().getName()+
			"   class=="+joinPoint.getTarget().getClass().getSimpleName());
}
public void afterAdvice(JoinPoint joinPoint) {
	System.out.println("After method=="+joinPoint.getSignature().getName()+
			"   class=="+joinPoint.getTarget().getClass().getSimpleName());
}
}
