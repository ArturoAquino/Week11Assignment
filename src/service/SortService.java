package service;

import java.util.Comparator;
import java.util.List;

import dao.SortDao;
import sort.model.Animal;

public class SortService {
	private SortDao sortDao= new SortDao();
	
	public List<Animal> getAnimal(SortType type) {
		List<Animal> animal = sortDao.getAnimals();
		Comparator<Animal> comp = null;
		
		switch(type) {
		case LAMBDA:
			comp = new MySort();
			comp = (Animal a1, Animal a2) -> {
				return Animal.compare(a1, a2);
			};
			break;
		case METHOD_REFERENCE:
			comp = Animal::compare;
			break;
		default:
			throw new RuntimeException("Unhandled sort type: " + type);
		
		}
		
		animal.sort(comp);
		return animal;
	}
	
	static class MySort implements Comparator<Animal> {

		@Override
		public int compare(Animal a1, Animal a2) {
			return Animal.compare(a1, a2);
		}
		
	}
	
}
