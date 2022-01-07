package com.revature.handson.interfaces;

public class Vehicle implements Gas, Movement {
	
	private int tank = 0;
	private int fuelCap = 100;

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("The vehicle is moving");
		if(tank > 0) {
			consumeFuel();
		}else {
			stop();
		}
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("The vehicle is stopped");
	}

	@Override
	public void getFuelLevel() {
		// TODO Auto-generated method stub
		System.out.println("Fuel level is " + tank);
	}

	@Override
	public void fillTank() {
		// TODO Auto-generated method stub
		System.out.println("Fuel is added");
		tank = tank + 10;
		if(tank > fuelCap) {
			tank = fuelCap;
			System.out.println("Tank is full");
		}
	}

	@Override
	public void consumeFuel() {
		// TODO Auto-generated method stub
		System.out.println("Fuel is consumed");
		tank = tank - 5;
		if (tank < 0) {
			tank = 0;
			System.out.println("The tank is empty");
		}
	}

	public int getTank() {
		return tank;
	}

	public void setTank(int tank) {
		this.tank = tank;
	}

	public int getFuelCap() {
		return fuelCap;
	}

	public void setFuelCap(int fuelCap) {
		this.fuelCap = fuelCap;
	}

	public Vehicle(int tank, int fuelCap) {
		super();
		this.tank = tank;
		this.fuelCap = fuelCap;
	}

	public Vehicle() {
		super();
	}
	
	

}
