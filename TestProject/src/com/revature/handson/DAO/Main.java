package com.revature.handson.DAO;

import java.sql.Connection;
import java.sql.SQLException;

import com.revature.handson.DAO.util.ConnectionManager;

public class Main {

	public static void main(String[] args) {
		try {
			Connection conn = ConnectionManager.getConnection();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

	}

}
