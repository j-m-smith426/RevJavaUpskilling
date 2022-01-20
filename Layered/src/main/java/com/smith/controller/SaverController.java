package com.smith.controller;

import com.smith.beans.Employee;
import com.smith.service.Saver;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SaverController {
	Saver saver;

	public void save(Employee employee) {
		saver.save(employee);
		
	}
}
