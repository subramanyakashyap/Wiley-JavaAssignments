package com.multithreading.heneggs;


public class GainJob implements Runnable {
	HenEggs heneggs = new HenEggs();
	public GainJob(HenEggs heneggs) {
		super();
		this.heneggs = heneggs;
	}
	
	@Override
	public void run() {
		
		while(heneggs.getRupees()<100){
			heneggs.gainMoney();
		}
		
	}

}
