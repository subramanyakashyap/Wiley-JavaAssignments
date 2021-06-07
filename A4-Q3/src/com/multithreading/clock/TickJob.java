package com.multithreading.clock;


public class TickJob implements Runnable {
	private Clock clock;
	
	public TickJob(Clock clock) {
		super();
		this.clock = clock;
	}

	@Override
	public void run() {
		for(int i=1;i<=60;i++) {
			clock.tick(i);
		}
		
	}
}
