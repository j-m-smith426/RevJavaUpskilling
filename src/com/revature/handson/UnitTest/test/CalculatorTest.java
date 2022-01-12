package com.revature.handson.UnitTest.test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.revature.handson.UnitTest.beans.Calculator;



public class CalculatorTest {

	private int a;
	private int b;
	
	@BeforeEach
	public void setup() {
		a = 5;
		b = 10;
	}
	
	@Test
	public void addTest() {
		int result = Calculator.add(a, b);
		assertEquals(15, result);
	}
	
	@Test
	public void subtractTest() {
		int result = Calculator.subtract(a, b);
		assertEquals(-5, result);
	}
	
	@Test
	public void multiplyTest() {
		int result = Calculator.multiply(a, b);
		assertEquals(50, result);
	}
	
	@Test
	public void divideTest() {
		double result = Calculator.divide(a, b);
		assertEquals(0.5, result, 0.1);
	}
}
