package com.revature.handson;

import java.util.Scanner;

public class MeasurementConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Plese select conversion");
		System.out.println("1: in -> cm");
		System.out.println("2: cm -> in");
		System.out.println("3: quit");
		Scanner in = new Scanner(System.in);
		int selection = in.nextInt();
		System.out.println("You have selected " + selection);
		while (selection < 1 || selection > 3) {
			System.out.println("Plese enter a valid option");
			selection = in.nextInt();
		}
		switch(selection) {
		case 1:{
			System.out.print("Plese enter the distance in Inches: ");
			int input = in.nextInt();
			double output = (double) input * 2.54;
			System.out.println("The result is " + output + " centimeters");
			break;
		}
		case 2:{
			System.out.print("Plese enter the distance in Centimeters: ");
			int input = in.nextInt();
			double output = (double) input / 2.54;
			System.out.println("The result is " + output + " inches");
			break;
		}
		case 3:{
			break;
		}
		}
	}

}
