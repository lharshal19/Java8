package operator;

import java.util.function.BinaryOperator;
import java.util.function.Function;

public class BinaryOperatorExample1 {

	static BinaryOperator<Integer> binaryOperator = (a, b) -> a * b;

	static Function<Integer, Integer> function = a -> a + 2;

	public static void main(String[] args) {
		//System.out.println(binaryOperator.apply(3, 4));
		
		System.out.println(binaryOperator.andThen(function).apply(3, 4));
	}

}
