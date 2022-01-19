package com.revature.handson.DAO.beans;

import java.sql.Connection;
import java.sql.SQLException;

import com.revature.handson.DAO.util.ConnectionManager;

public class DAO {
	Connection conn = null;
	
	public DAO() throws ClassNotFoundException, SQLException{
		conn = ConnectionManager.getConnection();
	}
	
	public void save() throws SQLException{
		if(conn != null){
			this.conn.commit();
			System.out.println(conn+" is closing with commit");
			this.conn.close();
		}
	}
	
	public void discard() throws SQLException{
		if(conn != null){
			this.conn.rollback();
			System.out.println(conn+" is closing with rollback");
			this.conn.close();
		}
	}

}
