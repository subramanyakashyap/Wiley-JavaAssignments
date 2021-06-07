package com.google.eggs;

public class CalculateEggs {
	
	private int eggs, gross, dozen;
	public CalculateEggs(int eggs){
		this.eggs = eggs;
	}
	public void setEggs(int eggs) {
		this.eggs = eggs;
	}
	public int getGross(){
		return this.gross;
	}
	public int getDozen(){
		return this.dozen;
	}
	public int getLeftOut(){
		return this.eggs;
	}
	
	public CalculateEggs eggUnit(){
		calculateEggs();
		return this;
	}
	
	public void calculateEggs(){
		while(this.eggs/144>0){
			this.gross++;
			this.eggs-=144;
		}
		while(this.eggs/12>0){
			this.dozen++;
			this.eggs-=12;
		}
	
			
	}

}
