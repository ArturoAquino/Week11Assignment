package stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import dao.SortDao;
import sort.model.Animal;

public class Streaming {
	
	public static void main(String[] args) {
		SortDao sortDao= new SortDao();
		
		// Create the stream of animals
		List<Animal> animal = sortDao.getAnimals();
		
		// Turn stream of object to a stream of String
		Stream<String> stream = animal.stream().map(Object::toString);
		
		// Sort the stream in the natural order
		// collect stream and returns a comma separated list of names as single string.
		// and prints it
		String s = stream.sorted().map(Object::toString).collect(Collectors.joining(", "));
		System.out.println(s);
		
		
        
	}

	

}
