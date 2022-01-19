package com.revature.handson;

import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter the following info for a cricle:");
		Scanner in = new Scanner(System.in);
		
		System.out.print("Radius: ");
		int radius = in.nextInt();
		System.out.println("The perimiter is " + (2*radius) + "pi");
		System.out.println("The area is " + (radius * radius) + "pi");
	}

}
