package streamMethods.isParallel16;

import java.util.stream.Stream;

public class Example2 {

	public static void main(String[] args) {

		Stream<String> stream = Stream.of("10", "20", "5", "40", "23", "34", "57");
		stream.forEach(x -> System.out.println(x));

		System.out.println("---------");
		Stream<String> stream1 = Stream.of("10", "20", "5", "40", "23", "34", "57");
		stream1.parallel().forEach(x -> System.out.println(x));

	}

}
