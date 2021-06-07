package com.google.interfaces;

public class Circle implements Fillable{

	public void fillingColor() {
		
		System.out.println("Circle FillColor:Red");
		
	}

	public void size() {
		
		System.out.println("Circle Size:100");
		
	}
	
	public static void main(String[] args){
		Circle circle = new Circle();
		circle.fillingColor();
		circle.size();
	}

}
