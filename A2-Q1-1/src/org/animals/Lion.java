package org.animals;

public class Lion extends Animal {
	public boolean isVegetarian(){
		return false;
	}
	public boolean canClimb(){
		return true;
	}
	public void sound(){
		System.out.println("(Lion)ROAAAR!!");
	}
}
