package com.multithreading.heneggs;

public class HenEggs {
	
private boolean flag=true;
private int rupees = 0;

	public int getRupees(){
		return this.rupees;
	}
	
	synchronized void layEgg(int i) {
		if(flag==false) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Hen Laid the Egg - "+i);
		flag=false;
		notify();
	}
	
	synchronized void gainMoney() {
		if(flag==true) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Owner gained Rs "+(rupees+=2));
		flag=true;
		notify();
	}

}
