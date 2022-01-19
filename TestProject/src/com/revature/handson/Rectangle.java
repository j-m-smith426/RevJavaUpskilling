package com.revature.handson;

import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter the following info for a Rectangle");
		System.out.print("Length: ");
		int length = in.nextInt();
		System.out.print("Width: ");
		int width = in.nextInt();
		int perimiter = 2 * length + 2 * width;
		int area = length * width;
		System.out.println("The perimiter is " + perimiter);
		System.out.println("The area is " + area);
	}

}
