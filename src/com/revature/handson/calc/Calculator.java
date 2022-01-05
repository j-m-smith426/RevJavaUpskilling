package com.revature.handson.calc;

public class Calculator {
	private int num1;
	private int num2;
	public int sum() {
		int sum;
		sum = num1 + num2;
		return sum;
	}
	
	public int difference() {
		int diff;
		diff = num1 - num2;
		return diff;
	}

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}
}
