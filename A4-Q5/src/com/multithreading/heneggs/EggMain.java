package com.multithreading.heneggs;

public class EggMain {

	public static void main(String args[]) {
		HenEggs heneggs=new HenEggs();
		
		Thread lay=new Thread(new LayJob(heneggs));
		Thread gain=new Thread(new GainJob(heneggs));
		
		lay.start();
		gain.start();
	}
}
