package org.animals;

public abstract class Animal {
	private String color;
	private int weight, age;
	public abstract boolean isVegetarian();
	public abstract boolean canClimb();
	public abstract void sound();
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
