package com.multithreading.bridgetoll;

public class tollPassJob implements Runnable{
	private Vehicle[] vehicles;
	private Pass pass;
	
	
	
	public tollPassJob(Pass pass, Vehicle[] vehicles) {
		super();
		this.pass = pass;
		this.vehicles = vehicles;
	}


	public void run() {
		for(Vehicle vehicle:vehicles) {
			pass.tollPass(vehicle);
		}
	}
}
