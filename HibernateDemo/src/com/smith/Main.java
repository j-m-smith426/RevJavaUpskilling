package com.smith;

import java.util.List;

import com.smith.beans.DAO;
import com.smith.beans.User;

public class Main {

	public static void main(String[] args) {
		
		DAO userDAO = new DAO(); 
		
		User user1 = new User("John", "Smith", "HouseHunt", "general");
		User user2 = new User("Rachel", "Summerton", "123456", "general");
		User user3 = new User("Sandy", "Smith", "Sand5467", "general");
		User user4 = new User("Luffy", "Gold", "Name3452", "general");
		
		
		userDAO.saveUser(user1);
		userDAO.saveUser(user2);
		userDAO.saveUser(user3);
		userDAO.saveUser(user4);
		
		List<User> users = userDAO.findAll();
		users.forEach(System.out::println);
		
		List<User> usersLast = userDAO.findByLastName("Smith");
		usersLast.forEach(System.out::println);
		userDAO.close();
		
		

	}

}
