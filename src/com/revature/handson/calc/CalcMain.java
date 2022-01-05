package com.revature.handson.calc;

class CalcMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c1 = new Calculator();
		c1.num1 = 25;
		c1.num2 = 4;
		
		Calculator c2 = new Calculator();
		c2.num1 = 5;
		c2.num2 = 10;
		
		System.out.println("The sum is " + c1.sum());
		System.out.println("The sum is " + c2.sum());
	}

}
