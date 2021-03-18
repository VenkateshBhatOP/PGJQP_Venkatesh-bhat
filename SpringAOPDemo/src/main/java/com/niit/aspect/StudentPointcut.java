package com.niit.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class StudentPointcut {

	@Before("getStudentNamePointcut()")
	public void secondAdvice()
	{
		System.out.println("we are executing second advice on getStudentName() method");
	}
	
	@Pointcut("execution(public String getStudentName())")
	public void getStudentNamePointcut()
	{
		System.out.println("this is get getStudentNamePointcut() method");
	}
	
	@Before("allMethodPointcut()")
	public void thirdAdvice()
	{
		System.out.println("we are executing third advice on getStudentName() method");
	}
	
	@Pointcut("within(com.niit.service.*)")
	public void allMethodPointcut()
	{
		
	}
}
