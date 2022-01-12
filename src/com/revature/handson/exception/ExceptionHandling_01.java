package com.revature.handson.exception;

import java.util.Scanner;

public class ExceptionHandling_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int a = sc.nextInt();
		System.out.println("Enter second number");
		int b = sc.nextInt();
		try {
			int c = a / b;
			System.out.println("Result is " + c);
			
		}catch(ArithmeticException arithmeticException) {
			System.out.println("Not possible to divide "+ arithmeticException);
//			arithmeticException.printStackTrace();
		}
		
		System.out.println("Thank you!!!");

	}

}
