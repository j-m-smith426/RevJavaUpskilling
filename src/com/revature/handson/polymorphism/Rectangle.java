package com.revature.handson.polymorphism;

public class Rectangle extends Polygon {

	public Rectangle(int dem1, int dem2) {
		super(dem1, dem2);
		
	}

	public Rectangle() {
		
	}

	@Override
	double getArea() {
		double area;
		area = (double) this.getDem1() * this.getDem2();
		return area;
	}

}
