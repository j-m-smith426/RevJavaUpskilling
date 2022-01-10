package com.revature.handson.arrays;

import java.util.Scanner;

public class ArrayDemoSingle {

	public static void main(String[] args) {
		int[] arr;
        Scanner input = new Scanner(System.in);
        System.out.print("How many elements will you enter: ");
        int size = input.nextInt();
        arr = new int[size];
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i<arr.length; i++){
            System.out.print("Enter element: ");
            arr[i] = input.nextInt();
            sum += arr[i];
            if(arr[i] > max)
            	max = arr[i];
            if(arr[i] < min)
            	min = arr[i];
            
        }
        System.out.println("Elements entered: ");
        for(int i = 0; i < arr.length; i++) {
        	System.out.print(arr[i]);
        }
        System.out.println();
        System.out.println("The sum of elements: " + sum);
        System.out.println("The maximum value entered: " + max);
        System.out.println("The minimum value entered: " + min);
	}

}
