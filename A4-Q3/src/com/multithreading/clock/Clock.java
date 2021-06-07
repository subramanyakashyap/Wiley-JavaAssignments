package com.multithreading.clock;

public class Clock {
	
	private int hand = 3;
	
	synchronized void tick(int i){
		while(hand!=1){
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.print("Tick "+i);
		hand=2;
		notify();
	}
	
	synchronized void tack(int i){
		while(hand != 2){
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.print("Tack "+i);
		hand=3;
		notify();
	}
	
	synchronized void tock(int i){
		hand=1;
		notify();
		while(hand != 3){
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Tock "+i);
	}

}
