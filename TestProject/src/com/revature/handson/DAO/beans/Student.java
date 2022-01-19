package com.revature.handson.DAO.beans;

public class Student {
	int id;
	String fname;
	String lname;
	int dept_id;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int id, String fname, String lname, int dept_id) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.dept_id = dept_id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public int getDept_id() {
		return dept_id;
	}
	public void setDept_id(int dept_id) {
		this.dept_id = dept_id;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", fname=" + fname + ", lname=" + lname + ", dept_id=" + dept_id + "]";
	}
	
	
}
