package biPredicate;

import java.util.function.BiPredicate;

public class Example1 {

	static BiPredicate<String, Integer> biPredicate = (a, b) -> {
		return a.length() == b;
	};

	public static void main(String[] args) {
		System.out.println(biPredicate.test("hellojava8", 10));
		System.out.println(biPredicate.test("hellojava8", 9));

	}

}
