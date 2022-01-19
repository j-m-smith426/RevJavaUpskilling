package com.revature.handson.DAO.beans;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.revature.handson.DAO.util.ConnectionManager;


public class StudentDAO extends DAO {

	public StudentDAO() throws ClassNotFoundException, SQLException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Student save(Student student) throws SQLException, ClassNotFoundException{
		String sql = "insert into student values(?,?,?,?)";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		int id = getNextID();
		pstmt.setInt(1, id);
		pstmt.setString(2, student.getFname());
		pstmt.setString(3, student.getLname());
		pstmt.setInt(4, student.getDept_id());
		if(1 == pstmt.executeUpdate()){
			student.setId(id);
			return student;
		}
		else{
			return null;
		}
	}
	
	public List<Student> findAll() throws SQLException, ClassNotFoundException{
		ArrayList<Student> students = new ArrayList<>();
		String sql = "select * from student";
		Connection con = ConnectionManager.getConnection();
		con.commit();
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		while(rs.next()){
			int id = rs.getInt("id");
			String fname = rs.getString("fname");
			String lname = rs.getString("lname");
			int dept_id = rs.getInt("dept_id");
			Student student = new Student(id, fname, lname, dept_id);
			students.add(student);
		}
		System.out.println(con+" is closing within findAll()");
		con.close();
		return students;
	}
	
	public int getNextID() throws SQLException, ClassNotFoundException{
		int id = 100;
		Connection con = ConnectionManager.getConnection();
		con.commit();
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("select max(id) from student");
		if(rs.next()){
			if(rs.getInt(1) > 0){
				id = rs.getInt(1);
			}
			id++;
		}
		System.out.println(con+" is closing within getNextId()");
		con.close();
		return id;
	}

}
