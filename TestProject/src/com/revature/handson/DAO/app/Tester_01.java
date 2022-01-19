package com.revature.handson.DAO.app;

import java.util.List;

import com.revature.handson.DAO.beans.Student;
import com.revature.handson.DAO.beans.StudentDAO;

public class Tester_01 {

	public static void main(String[] args) {
		try{
			StudentDAO studentDAO = new StudentDAO();
			System.out.println(studentDAO.findAll());
			List<Student> students = studentDAO.findAll();
			System.out.println(students.get(0).getId());
		}
		catch(Exception e){
			e.printStackTrace();
		}

	}

}
