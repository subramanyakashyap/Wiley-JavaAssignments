package com.google.worker;

public class WorkerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DailyWorker dworker = new DailyWorker();
		SalariedWorker sworker = new SalariedWorker();
		dworker.setName("Raam");
		dworker.setSalaryRate(100);
		sworker.setName("Raaju");
		sworker.setSalaryRate(100);
		System.out.println(dworker.pay(35));
		System.out.println(sworker.pay(35));

	}

}
