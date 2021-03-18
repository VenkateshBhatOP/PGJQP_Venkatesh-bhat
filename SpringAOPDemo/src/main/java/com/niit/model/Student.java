package com.niit.model;

import java.io.Serializable;

public class Student implements Serializable {

	private int studentID;
	private String studentName;
	
	
	
	public Student() {
		
	}
	
	
	public int getStudentID() {
		return studentID;
	}


	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}


	public String getStudentName() {
		System.out.println("Inside getStudentName() method");
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
}
