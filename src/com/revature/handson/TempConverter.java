package com.revature.handson;

import java.util.Scanner;

public class TempConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Plese select conversion");
		System.out.println("1: F -> C");
		System.out.println("2: C -> F");
		System.out.println("3: quit");
		Scanner in = new Scanner(System.in);
		int selection = in.nextInt();
		while (selection < 1 || selection > 3) {
			System.out.println("Plese enter a valid option");
			selection = in.nextInt();
		}
		switch(selection) {
		case 1:{
			System.out.print("Plese enter the temp in Farenheight: ");
			int input = in.nextInt();
			double output = (double)(input - 32) * 5 / 9;
			System.out.println("The result is " + output + " degrees Celsius");
			break;
		}
		case 2:{
			System.out.print("Plese enter the temp in Celsius: ");
			int input = in.nextInt();
			double output = ((double)input * 9 / 5) + 32;
			System.out.println("The result is " + output + " degrees Farenheight");
			break;
		}
		case 3:{
			break;
		}
		}
	}

}
