package collectMethods.groupBy4.reducing;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example4 {
	public static void main(String[] args) {

		Stream<Integer> s = Stream.of(5, 10, 20, 50);
		
		Integer i = s.collect(Collectors.reducing(1, (a, b) -> a * b));
		System.out.println(i);

	}

}
