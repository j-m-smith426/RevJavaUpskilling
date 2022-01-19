package com.revature.handson.arrays;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many arrays ?");
		int m = sc.nextInt();
		int[][] arr = new int[m][];
		for(int i = 0; i < m; i++) {
			System.out.println("How many elements in "+i+" array?");
			int n = sc.nextInt();
			arr[i] = new int[n];
			
		}
		
		System.out.println("Enter elements below :");
		for(int i = 0; i < arr.length; i++) {
			
			for(int j = 0; j< arr[i].length; j++) {
				int value = sc.nextInt();
				arr[i][j] = value;
				
				
			}
			
		}
		
		System.out.println("Multidimensional array looks like:");
        for(int i=0; i < arr.length; i++) {
            for(int j=0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        
        System.out.println("The calculated sums are:");
        for(int i = 0; i < arr.length; i++) {
        	int sum = 0;
        	for(int j = 0; j < arr[i].length; j++) {
        		sum += arr[i][j];
        	}
        	System.out.println("Row " +i+ " : " + sum);
        }
        sc.close();
	}

}
