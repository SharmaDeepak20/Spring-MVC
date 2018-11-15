package com.spring.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;

@Aspect
@Order(value=0)
public class EmpAspect1 {

	@Before("execution(* com.spring.aop.EmployeeService.addEmployee(..))")
	public void beforeAdvice(JoinPoint jp)
	{
		System.out.println("Inside EmpAspect1...");
	}
}
