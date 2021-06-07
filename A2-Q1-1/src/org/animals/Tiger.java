package org.animals;

public class Tiger extends Animal {
	public boolean isVegetarian(){
		return false;
	}
	public boolean canClimb(){
		return true;
	}
	public void sound(){
		System.out.println("(Tiger)ROAAAR!!");
	}
}
