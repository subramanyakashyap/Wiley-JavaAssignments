package com.multithreading.clock;


public class ClockMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Clock clock=new Clock();
		Thread tick=new Thread(new TickJob(clock));
		Thread tack=new Thread(new TackJob(clock));
		Thread tock=new Thread(new TockJob(clock));
		
		tick.start();
		tack.start();
		tock.start();

	}

}
