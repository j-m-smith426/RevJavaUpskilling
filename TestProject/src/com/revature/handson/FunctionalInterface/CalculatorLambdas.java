package com.revature.handson.FunctionalInterface;

import com.revature.handson.FunctionalInterface.beans.CalculatorInterface;

public class CalculatorLambdas {

	public static void main(String[] args) {
		CalculatorInterface add = (a,b) -> a + b;
		CalculatorInterface subtract = (a,b) -> a-b;
		CalculatorInterface multiply = (a,b) -> a*b;
		CalculatorInterface divide = (a,b)-> (double)a/b;
		
		System.out.println(add.process(2,6));
		System.out.println(subtract.process(24, 7));
		System.out.println(multiply.process(42, 6));
		System.out.println(divide.process(254, 12));
		
	}

}
