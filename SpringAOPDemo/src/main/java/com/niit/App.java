package com.niit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.niit.model.Student;
import com.niit.service.StudentService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
    	Student stud =(Student) applicationContext.getBean("student");
    	
    	StudentService studentservice=(StudentService)applicationContext.getBean("studentService");
    	studentservice.setStudent(stud);
    	System.out.println(studentservice.getStudent().getStudentName());
    }
}
