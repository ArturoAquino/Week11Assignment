package dao;

import java.util.ArrayList;
import java.util.List;

import sort.model.Animal;

public class SortDao {
	// Static list of objects 
	public List<Animal> animals = new ArrayList<>(List.of(
				new Animal("Dog"),
				new Animal("Cat"),
				new Animal("Pig"),
				new Animal("Horse"),
				new Animal("Lion"),
				new Animal("Eagle")));
		

	public List<Animal> getAnimals() {
		
		return animals;
	}

}
