package com.revature.handson;

import java.util.Scanner;

public class DisplayRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a range");
		int range = in.nextInt();
		
		for(int i = 1; i <= range; i++) {
			String type = i%2 == 0? "even":"odd";
			System.out.println(i + " " + type);
		}
	}

}
