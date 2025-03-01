package streamMethods.reduce19;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BiFunction;
public class Example1 {

	BiFunction<String, String, String> biFunction = (a,b) -> a.concat(b);
	
	public static void main(String[] args) {

		List<String> words = Arrays.asList("AAAAA", "BB", "CC", "DD", "EE");

		Optional<String> longestString = words.stream()
				.reduce((a, b) -> a.length() > b.length() ? a : b);
		
		System.out.println(longestString.get());
	}
}
