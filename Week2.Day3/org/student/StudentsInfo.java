package org.student;

public class StudentsInfo {

	public void getStudentInfo(int id) {
		// TODO Auto-generated method stub
		System.out.println("Student ID: "+id);
	}
	
	public void getStudentInfo(int id,String name) {
		// TODO Auto-generated method stub
		System.out.println("Student Details"+"\n"+"ID: "+id+" "+"Name: "+name);
	}
	
	public void getStudentInfo(String email,long phonenumber) {
		// TODO Auto-generated method stub
		System.out.println("Email: "+email+"\n"+"PhoneNumber: "+phonenumber);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentsInfo obj = new StudentsInfo();
		obj.getStudentInfo(181);
		obj.getStudentInfo(181, "Preethi M");
		obj.getStudentInfo("abc@gmail.com", 1234567890);
	}

}
