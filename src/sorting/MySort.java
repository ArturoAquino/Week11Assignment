package sorting;

import java.util.List;

import service.SortService;
import service.SortType;
import sort.model.Animal;

public class MySort {
	
	private SortService sortService = new SortService();
	
	public static void main(String[] args) {
		 
		// Calling sort method
		System.out.println("Sorted Objects using Lambda expression: ");
		new MySort().sortLambda();
		
		System.out.println();
		
		System.out.println("Sorted Objects using Method Reference: ");
		new MySort().methodReference();
		
	}
	
	// Method that uses our 'compare' method and lambda to sort our 
	// list of objects
	private void sortLambda() {
		List<Animal> animal = sortService.getAnimal(SortType.LAMBDA);
		print(animal, SortType.LAMBDA);
	}
	
	// Method Reference
	private void methodReference() {
		List<Animal> animal = sortService.getAnimal(SortType.METHOD_REFERENCE);
		print(animal, SortType.METHOD_REFERENCE);
	}
	
	private void print(List<Animal> animal, SortType type) {
		switch(type) {
		case LAMBDA:
			animal.forEach(animals -> System.out.println(animals.getAnimal()));
			break;
		case METHOD_REFERENCE:
			animal.forEach(System.out::println);
			break;
		default:
			break;
		
		}
	}
	
	
}