package com.google.interfaces;

public class Line implements Drawable {

	public void drawingColor() {
		
		System.out.println("Line Color:Black");
		
	}

	public void thickness() {
		
		System.out.println("Line Thickness:1pt");
		
	}
	
	public static void main(String[] args){
		Line line = new Line();
		line.drawingColor();
		line.thickness();
	}

}
