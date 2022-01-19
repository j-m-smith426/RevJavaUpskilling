package com.revature.handson.calc;

public class Rectangle {
	private int length;
	private int width;
	
	public Rectangle() {
		// TODO Auto-generated constructor stub
	}
	
	public Rectangle(int length) {
		this.length = this.width = length;
	}
	
	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}
	
	public int getArea() {
		return length *width;
	}
	
	public int getPerimiter() {
		return 2 * length + 2 * width;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}
	
	
	
}
