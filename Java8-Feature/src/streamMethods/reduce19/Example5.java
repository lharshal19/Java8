package streamMethods.reduce19;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Example5 {

	public static void main(String[] args) {
		
		int[] array = { 3, 4, 5, 9, 30 };
		
		IntStream arr = Arrays.stream(array);
		
		Arrays.stream(array).reduce((x, y) -> x + y).ifPresent(s -> System.out.println(s));
		
		Arrays.stream(array).reduce(Integer::sum).ifPresent(s -> System.out.println(s));
	}

}
