package com.revature.handson.calc;

class CalcMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c1 = new Calculator();
		c1.setNum1(10);
		c1.setNum2(7);
		
		Calculator c2 = new Calculator();
		c2.setNum1(10);
		c2.setNum2(7);
		
		System.out.println("The sum is " + c1.sum());
		System.out.println("The sum is " + c2.sum());
	}

}
