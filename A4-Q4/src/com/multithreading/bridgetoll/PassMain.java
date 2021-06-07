package com.multithreading.bridgetoll;

public class PassMain {

	public static void main(String[] args) {
		
		Vehicle[] vehicles = new Vehicle[5];
		vehicles[0] = new Vehicle(5452);
		vehicles[1] = new Vehicle(5555);
		vehicles[2] = new Vehicle(8787);
		vehicles[3] = new Vehicle(3266);
		vehicles[4] = new Vehicle(8521);
		
		Pass pass=new Pass();
		
		Thread bridge=new Thread(new bridgePassJob(pass, vehicles));
		Thread toll=new Thread(new tollPassJob(pass, vehicles));
		
		bridge.start();
		toll.start();

	}

}
