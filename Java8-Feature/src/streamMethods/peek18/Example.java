package streamMethods.peek18;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class Example {
	
	public static void main(String[] args) {
		
		Stream<String> stream = Stream.of("one", "two", "three", "four");
		
		Stream<String> peekData = stream.filter(x -> x.contains("o")).peek(y -> System.out.println(y));
		
		List<String> newList = peekData.collect(Collectors.toList());
		System.out.println(newList);
		
		//stream.filter(x -> x.contains("o")).forEach(y -> System.out.println(y));
		
	}

}
