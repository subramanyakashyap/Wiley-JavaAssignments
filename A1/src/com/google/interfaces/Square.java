package com.google.interfaces;

public class Square implements Fillable{

	public void fillingColor() {

		System.out.println("Square Fills:Blue");
		
	}

	public void size() {
		
		System.out.println("Square size:45");
		
	}

	public static void main(String[] args){
		Square square = new Square();
		square.fillingColor();
		square.size();
	}
}
