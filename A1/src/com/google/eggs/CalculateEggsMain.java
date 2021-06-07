package com.google.eggs;

public class CalculateEggsMain {
	public static void main(String args[]){
		CalculateEggs egg = new CalculateEggs(200).eggUnit();
	
		System.out.println(egg.getGross());
		System.out.println(egg.getDozen());
		System.out.println(egg.getLeftOut());
	}
}