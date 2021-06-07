package com.multithreading.bridgetoll;

public class Pass {
	
private boolean flag=true;
	
	synchronized void bridgePass(Vehicle vehicle) {
		if(flag==false) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Vehicle with number "+vehicle.getNumber()+" passed the bridge");
		flag=false;
		notify();
	}
	
	synchronized void tollPass(Vehicle vehicle) {
		if(flag==true) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Vehicle with number "+vehicle.getNumber()+" passed the toll");
		flag=true;
		notify();
	}

}
