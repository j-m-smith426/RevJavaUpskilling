package com.revature.handson.polymorphism;

public abstract class Polygon {
	private int dem1;
	private int dem2;
	
	public Polygon(int dem1, int dem2) {
		super();
		this.dem1 = dem1;
		this.dem2 = dem2;
	}

	public Polygon() {
		
	}

	public int getDem1() {
		return dem1;
	}

	public void setDem1(int dem1) {
		this.dem1 = dem1;
	}

	public int getDem2() {
		return dem2;
	}

	public void setDem2(int dem2) {
		this.dem2 = dem2;
	}
	
	abstract double getArea();
	
}
