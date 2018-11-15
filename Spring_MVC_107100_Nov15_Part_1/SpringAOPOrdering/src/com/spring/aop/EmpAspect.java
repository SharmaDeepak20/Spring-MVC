package com.spring.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;

@Aspect
@Order(value=1)
public class EmpAspect {

	@Before("execution(* com.spring.aop.EmployeeService.addEmployee(..))")
	public void beforeAdvice(JoinPoint jp)
	{
		System.out.println("Before advice to applied second");
	}
}
