package org.student;

import org.department.Department;

public class Student extends Department{

	public void studentName() {
		// TODO Auto-generated method stub
		System.out.println("Student Name: ABC");
	}
	
	public void studentDept() {
		// TODO Auto-generated method stub
		System.out.println("Student Dept: IT");
	}
	
	public void studentId() {
		// TODO Auto-generated method stub
		System.out.println("Student ID: 101");
	}
	
	public static void main(String[] args) {
		
		Student obj = new Student();
		obj.collegeCode();
		obj.collegeName();
		obj.collegeRank();
		obj.deptName();
		obj.studentId();
		obj.studentName();
		obj.studentDept();
		
	}
	
}
