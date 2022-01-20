package com.smith;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.smith.beans.Person;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		context.getBean("bean");
		
		Person p1 = (Person)context.getBean("bean");
		
		System.out.println(p1.getFName() + " " + p1.getLName());
	}

}
