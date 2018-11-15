package com.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class EmployeeAspect {

	@Pointcut("execution(* *.*(..))")
	public void all(){
	}
	
	@Around("all()")
	public void logAround(ProceedingJoinPoint pjp) throws Throwable
	{
		System.out.println("Before execution of joinpoint method...");
		pjp.proceed();
		System.out.println("After execution of joinpoint method... ");;
		
	}
	
	@AfterThrowing("execution(* com.spring.aop.EmployeeService.getEmployeebyName(String))")
	public void afterThrowing()
	{
		System.out.println("Name can't be null.....");
	}
}
