import java.util.List;
import java.util.stream.IntStream;

public class FPNumberRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = List.of(4,6,8,13,3,15);
		
		// Print squares of first 10 elements
		IntStream.range(1,11).map(e -> e * e).forEach(e -> System.out.println(e));
		
		//Map all of these to lower case and print them
		List.of("Apple", "Ant", "Bat").stream().map(e -> e.toLowerCase()).forEach(e -> System.out.println(e));
		
		//print their length
		List.of("Apple", "Ant", "Bat").stream().map(e -> e.length()).forEach(e -> System.out.println(e));
	}

}
