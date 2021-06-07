package org.zoo;

import java.util.ArrayList;

import org.animals.Animal;

public class VandalurZooMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VandalurZoo zoo = new VandalurZoo();
		zoo.setValues();
		ArrayList<Animal> animals = zoo.getArrayOfAnimals();
		zoo.display(animals);
	}
}