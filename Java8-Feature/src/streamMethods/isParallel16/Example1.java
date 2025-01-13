package streamMethods.isParallel16;

import java.util.stream.Stream;

public class Example1 {

	public static void main(String[] args) {


		Stream<String> stream = Stream.of("one", "two", "three", "four");
		
		Stream<String> stre = stream.parallel();
		
		System.out.println(stream.isParallel());
	}

}
