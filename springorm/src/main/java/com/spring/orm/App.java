package com.spring.orm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.entities.Student;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		StudentDao studentDao = context.getBean("studentDao", StudentDao.class);

		/*
		 * Student student =new Student(101,"Venkatesh bhat","Mangalore");
		 * 
		 * 
		 * int r=studentDao.insert(student); System.out.println("done" +r);
		 */

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		boolean go = true;

		while (go) {
			System.out.println("1. Add");
			System.out.println("2. Display");
			System.out.println("3. Detail  of single Student");
			System.out.println("4. Delete");
			System.out.println("5. Update");
			System.out.println("6. Exit");

			try {

				int input = Integer.parseInt(bufferedReader.readLine());

				switch (input) {
				case 1:
					System.out.println("Enter the user ID: ");
					int uid = Integer.parseInt(bufferedReader.readLine());

					System.out.println("Enter the UserName: ");
					String uname = bufferedReader.readLine();

					System.out.println("Enter the User City: ");
					String ucity = bufferedReader.readLine();

					Student s = new Student();
					s.setId(uid);
					s.setStudentName(uname);
					s.setStudentCity(ucity);

					int r = studentDao.insert(s);
					System.out.println(r + "-Student Inserted");

					break;
				case 2:
					System.out.println("***************************************");
					List<Student> allStudents = studentDao.getAllStudents();
					for (Student student : allStudents) {
						System.out.println("Id: " + student.getId());
						System.out.println("Name: " + student.getStudentName());

						System.out.println("City: " + student.getStudentCity());
						System.out.println("************************************");
					}
					break;

				case 3:
					System.out.println("Enter the user ID: ");
					int userid = Integer.parseInt(bufferedReader.readLine());
System.out.println("*****************************************");
					Student stud = studentDao.getStudent(userid);
					System.out.println("Id: " + stud.getId());
					System.out.println("Name: " + stud.getStudentName());
					System.out.println("City: " + stud.getStudentCity());
					System.out.println("**************************************");

					break;

				case 4:
					System.out.println("Enter the Id to be deleted: ");
					int id = Integer.parseInt(bufferedReader.readLine());
					studentDao.deleteStudent(id);

					System.out.println("Student deleted.");
					break;

				case 5:
					System.out.println("Enter the user ID: ");
					int sid = Integer.parseInt(bufferedReader.readLine());
					
					System.out.println("Enter the UserName: ");
					String sname = bufferedReader.readLine();

					System.out.println("Enter the User City: ");
					String scity = bufferedReader.readLine();

					Student sid1=new Student();
					sid1.setId(sid);
					sid1.setStudentName(sname);
					sid1.setStudentCity(scity);
					studentDao.updateStudent(sid1);
					System.out.println("The Student has been updated successfully");
					break;

				case 6:
					go = false;
					break;

				}
			} catch (Exception e) {
				System.out.println("Invalid input");
				System.out.println(e.getMessage());
			}
		}
		System.out.println("You have exited");
	}
}
