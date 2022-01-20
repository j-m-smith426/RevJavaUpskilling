package com.smith.service;

import com.smith.beans.Employee;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DBSaverService implements Saver {

	String driver;
    String url;
    String username;
    String password;
	
	@Override
	public void save(Employee employee) {
		System.out.println("Saving employee object into DB");
        System.out.println("Driver: "+driver);
        System.out.println("URL: "+url);
        System.out.println("Username: "+username);
        System.out.println("Saved employee: "+employee);

	}

}
