package com.revature.handson.DAO.app;

import com.revature.handson.DAO.beans.Student;
import com.revature.handson.DAO.beans.StudentDAO;

public class Tester_02 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Student s1 = new Student(0, "Jaob", "Smith", 1);
		Student s2 = new Student(0, "Bob", "Ruddy", 1);
		Student s3 = new Student(0, "Manny", "Sander", 3);
		Student[] students = {s1,s2,s3};
		StudentDAO studentDAO ;
		
		for(Student s:students) {
			
			studentDAO = new StudentDAO();
		if(studentDAO.save(s) != null){
			studentDAO.save();
		}else {
			studentDAO.discard();
			
		}
		}
		
		
		studentDAO = new StudentDAO();
		System.out.println(studentDAO.findAll());
		
	}

}
