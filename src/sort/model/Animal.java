package sort.model;

public class Animal {

	private String animalName;
	
	public Animal(String animalName) {
		this.animalName = animalName;
	}

	@Override
	public String toString() {
		return animalName + " Animal";
	}
	
	public String getAnimal() {
		return animalName + " Animal";
	}

	
	public static int compare(Animal a1, Animal a2) {
		if(a1.animalName.compareTo(a2.animalName) < a2.animalName.compareTo(a1.animalName)) {
			return -1;
		} else if (a1.animalName.compareTo(a2.animalName) > a2.animalName.compareTo(a1.animalName)) {
			return 1;
		} else {
			return 0;
		}
	}
	
	
}
