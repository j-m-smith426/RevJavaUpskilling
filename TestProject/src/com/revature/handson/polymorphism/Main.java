package com.revature.handson.polymorphism;

public class Main {

	public static void main(String[] args) {
		Polygon a = new Triangle(3,5);
		Polygon b = new Rectangle(3, 5);
		
		System.out.println("The area of a triangle with dem 3,5 is " + a.getArea());
		System.out.println("The area of a rectangle with dem 3,5 is " + b.getArea());
	}

}
