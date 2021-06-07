package com.multithreading.threadinfo;

public class ThreadInfo {
	
	public static void main(String[] args) throws InterruptedException {
		
		Thread1 thread1 = new Thread1();
		Thread2 thread2 = new Thread2();
		Thread3 thread3 = new Thread3();
		FourThreads thread4 = new FourThreads();
		
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		
		Thread.sleep(100);
		System.out.println("ID\tName\t\tAlive?\tStatus\t\tPriority");
		System.out.println(thread1.getId()+"\t"+thread1.getName()+"\t"+thread1.isAlive()+"\t"+thread1.getState()+"\t"+thread1.getPriority());
		System.out.println(thread2.getId()+"\t"+thread2.getName()+"\t"+thread2.isAlive()+"\t"+thread2.getState()+"\t"+thread2.getPriority());
		System.out.println(thread3.getId()+"\t"+thread3.getName()+"\t"+thread3.isAlive()+"\t"+thread3.getState()+"\t"+thread3.getPriority());
		System.out.println(thread4.getId()+"\t"+thread4.getName()+"\t"+thread4.isAlive()+"\t"+thread4.getState()+"\t"+thread4.getPriority());
//		System.out.println(Thread.currentThread().isAlive());
		
		
	}

}
