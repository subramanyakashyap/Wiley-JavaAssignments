package org.zoo;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

import org.animals.Animal;
import org.animals.Deer;
import org.animals.Elephant;
import org.animals.Giraffe;
import org.animals.Lion;
import org.animals.Monkey;
import org.animals.Tiger;

public class VandalurZoo {
	Animal deer = new Deer();
	Animal elephant = new Elephant();
	Animal lion = new Lion();
	Animal tiger = new Tiger();
	Animal monkey = new Monkey();
	Animal giraffe = new Giraffe();
	public void setValues() {
		deer.setColor("Deer Orange");
		deer.setWeight(50);
		deer.setAge(15);
		elephant.setColor("Elephant Grey");
		elephant.setWeight(500);
		elephant.setAge(60);
		lion.setColor("Lion Orange");
		lion.setWeight(75);
		lion.setAge(50);
		tiger.setColor("Tiger Orange black");
		tiger.setWeight(85);
		tiger.setAge(35);
		monkey.setColor("Monkey Brown");
		monkey.setWeight(25);
		monkey.setAge(10);
		giraffe.setColor("Giraffe Yellow");
		giraffe.setWeight(75);
		giraffe.setAge(25);
		addToArrayList();
	}
	public void addToArrayList(){
		
	}
	public ArrayList<Animal> getArrayOfAnimals(){
		ArrayList<Animal> animals = new ArrayList<Animal>();
		animals.add(deer);
		animals.add(elephant);
		animals.add(lion);
		animals.add(tiger);
		animals.add(monkey);
		animals.add(giraffe);
		return animals;
	}
	public void display(ArrayList<Animal> animals) {
		Iterator<Animal> itr = animals.iterator();
		while(itr.hasNext()){
			Animal animal = itr.next();
			System.out.println("===========================");
			System.out.println(animal.getColor());
			System.out.println("Age: "+animal.getAge());
			System.out.println("Weight: "+animal.getWeight());
			System.out.println("Climbs?, "+animal.canClimb());
			System.out.println("Vegetarian?, "+animal.isVegetarian());
			animal.sound();
			System.out.println("===========================");
		}
	}
}
