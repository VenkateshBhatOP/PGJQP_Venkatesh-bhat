package com.niit.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class StudentAspect {

	@Before("execution(public String getStudentName())")
	public void getNameAdvice()
	{
		System.out.println("we are executing advice before getstudentname() method");
	}
	
	@After("execution(public String getStudentName())")
	public void getNameAfterAdvice()
	{
		System.out.println("we are executing advice after getstudentname() method");
	}
}
