package com.smith.service;

import com.smith.beans.Employee;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FileSaverService implements Saver {
	
	String filename;

	@Override
	public void save(Employee employee) {
		System.out.println("Saving employee object in the file");
        System.out.println("The file name: "+filename);
        System.out.println("Employee is: "+employee);

	}

}
