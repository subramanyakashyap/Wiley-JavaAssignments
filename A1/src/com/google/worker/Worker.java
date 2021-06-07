package com.google.worker;

public class Worker {
	private String name;
	private int salaryRate;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalaryRate() {
		return salaryRate;
	}
	public void setSalaryRate(int salaryRate) {
		this.salaryRate = salaryRate;
	}
}
class DailyWorker extends Worker{
	public int pay(int hours){
		return hours*getSalaryRate();
	}
}
class SalariedWorker extends Worker{
	public int pay(int hours){
		return 40*getSalaryRate();
	}
	
}
