package com.spring.aop.aspect;

import java.util.concurrent.SynchronousQueue;

import org.aspectj.lang.ProceedingJoinPoint;

public class AccountServiceAspect {
	/*
	 * public void beforeAdvice(JoinPoint joinPoint) {
	 * System.out.println("Before method=="+joinPoint.getSignature().getName()+
	 * "   class=="+joinPoint.getTarget().getClass().getSimpleName()); } public void
	 * afterAdvice(JoinPoint joinPoint) {
	 * System.out.println("After method=="+joinPoint.getSignature().getName()+
	 * "   class=="+joinPoint.getTarget().getClass().getSimpleName()); }
	 */
	public Object aroundAdvice(ProceedingJoinPoint joinPoint) {
		System.out.println("Before method==" + joinPoint.getSignature().getName() + "   class=="
				+ joinPoint.getTarget().getClass().getSimpleName());
		Long time1=System.currentTimeMillis();
		Object obj = null;
		try {
			obj = joinPoint.proceed();
		} catch (Throwable e) {
			System.out.println(e.getMessage());
		}
		System.out.println("After method==" + joinPoint.getSignature().getName() + "   class=="
				+ joinPoint.getTarget().getClass().getSimpleName());
		Long time2=System.currentTimeMillis();
		System.out.println("Elapsed time==="+(time2-time1));
		return obj;

	}
}
