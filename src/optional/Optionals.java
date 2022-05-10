package optional;

import java.util.NoSuchElementException;
import java.util.Optional;

import sort.model.Animal;

public class Optionals {
	
	public static Animal a(Optional <Animal> animal) {
		return animal.orElseThrow(() -> new NoSuchElementException("It appears that the object does not exist"));
	}	

	public void b(Optional <Animal> animal) {
		animal = Optional.empty();
		
		try {
			Optionals.a(animal);
			System.out.println(animal);
			
			
		} catch(NoSuchElementException e) {
			
			System.out.println(e.getMessage());
			
		}
		
	}
	
	public static void main(String[] args) {
		Optional <Animal> animal = Optional.empty();
		Optionals option = new Optionals();
		
		option.b(animal);
		
		

	}
	

	
	
	
}
