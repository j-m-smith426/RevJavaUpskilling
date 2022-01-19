package com.smith.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
	
	Long id;
	
	String firstName;
	String lastName;
	String password;
	String type;
	public User(String firstName, String lastName, String password, String type) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.type = type;
	}
	@Override
	public String toString() {
		return "id:" + id + ", firstName:" + firstName + ", lastName:" + lastName + ", password:" + password
				+ ", type:" + type;
	}
	
	
}
