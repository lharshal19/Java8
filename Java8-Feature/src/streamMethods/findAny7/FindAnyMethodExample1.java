package streamMethods.findAny7;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class FindAnyMethodExample1 {

	public static void main(String[] args) {

		// findAny()

		Predicate<String> predicate = (a) -> a.contains("AA");

		List<String> list = Arrays.asList("AAA", "BB", "CC", "AAA","AA");

		Stream<String> stream = list.stream();

		Stream<String> filter = stream.filter(predicate);

		Optional<String> findAny = filter.findAny();
		
		System.out.println(findAny);

		String output = list.stream().filter(e -> e.startsWith("EE")).findAny().orElse("null");

		System.out.println(output);
	}

}
