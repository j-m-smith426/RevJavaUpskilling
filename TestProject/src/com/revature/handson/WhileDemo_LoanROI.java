package com.revature.handson;

import java.util.Scanner;

public class WhileDemo_LoanROI {

	public static void main(String[] args) {
		int loan = 10000;
		int payment = 1000;
		int noPayment = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter intrest rate ");
		double intrestRate = in.nextDouble();
		intrestRate = intrestRate /100;
		while(loan > 0) {
			loan = (int) (loan * (intrestRate + 1));
			loan -= payment;
			noPayment ++;
			System.out.println("Paying " + payment + " of the installment " + noPayment);
		}
		
		System.out.println("You are free from the loan after " + noPayment + " installments are payed");

	}

}
