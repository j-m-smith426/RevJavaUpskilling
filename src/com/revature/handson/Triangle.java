package com.revature.handson;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter the following info for a Right Triangle");
		System.out.print("Base: ");
		int base = in.nextInt();
		System.out.print("Height: ");
		int height = in.nextInt();
		double hypotnuse = Math.sqrt(base * base + height * height);
		double perimiter = base + height + hypotnuse;
		double area = (base * height) / 2;
		System.out.println("The perimiter is " + perimiter);
		System.out.println("The area is " + area);
	}

}
