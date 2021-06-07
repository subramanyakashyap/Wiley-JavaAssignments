package com.multithreading.heneggs;


public class LayJob implements Runnable {
	HenEggs heneggs = new HenEggs();
	public LayJob(HenEggs heneggs) {
		super();
		this.heneggs = heneggs;
	}
	
	@Override
	public void run() {
		
		int i = 1;
		while(heneggs.getRupees()<98){
			heneggs.layEgg(i);
		}
		
	}

}
