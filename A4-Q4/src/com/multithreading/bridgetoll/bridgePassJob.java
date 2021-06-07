package com.multithreading.bridgetoll;

public class bridgePassJob implements Runnable{
	private Vehicle[] vehicles;
	private Pass pass;
	
	
	public bridgePassJob(Pass pass, Vehicle[] vehicles) {
		super();
		this.pass = pass;
		this.vehicles = vehicles;
	}


	public void run() {
		for(Vehicle vehicle: vehicles) {
			pass.bridgePass(vehicle);
		}
	}
}
