package com.multithreading.clock;


public class TackJob implements Runnable {
	private Clock clock;
	
	public TackJob(Clock clock) {
		super();
		this.clock = clock;
	}

	@Override
	public void run() {
		for(int i=1;i<=60;i++) {
			clock.tack(i);
		}
		
	}
}
