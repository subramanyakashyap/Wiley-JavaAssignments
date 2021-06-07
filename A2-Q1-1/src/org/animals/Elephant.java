package org.animals;

public class Elephant extends Animal {
	public boolean isVegetarian(){
		return true;
	}
	public boolean canClimb(){
		return false;
	}
	public void sound(){
		System.out.println("Elephant Sound!!");
	}
}
