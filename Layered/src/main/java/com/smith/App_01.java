package com.smith;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.smith.beans.Employee;
import com.smith.controller.SaverController;

public class App_01 {

	public static void main(String[] args) {
		Employee employee = new Employee(101, "Joab", "Smith", 99);
        ApplicationContext ctxt = new ClassPathXmlApplicationContext("spring.xml");
        SaverController controller = ctxt.getBean(SaverController.class);
        controller.save(employee);

	}

}
