package com.revature.handson.polymorphism;

public class Triangle extends Polygon {

	public Triangle(int dem1, int dem2) {
		super(dem1, dem2);
		// TODO Auto-generated constructor stub
	}

	public Triangle() {
		// TODO Auto-generated constructor stub
	}

	@Override
	double getArea() {
		double area;
		area = (double) this.getDem1() * this.getDem2() / 2;
		return area;
	}

}
