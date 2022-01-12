package com.revature.handson.exception;

import java.util.Scanner;

public class Uncaught_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int a = sc.nextInt();
		System.out.println("Enter second number");
		int b = sc.nextInt();
		int c = calc(a,b);
		System.out.println("Result is " + c);
		
	}

	private static int calc(int a, int b) {
		int result = a / b;
		System.out.println("Calculation finished");
		return result;
	}

}
