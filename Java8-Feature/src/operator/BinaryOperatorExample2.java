package operator;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample2 {

	static Comparator<Integer> comparator = (o1, o2) -> o1.compareTo(o2);
	
	static Comparator<Integer> comparator1 = (o1, o2) -> o1.compareTo(o2);
	
	public static void main(String[] args) {
		BinaryOperator<Integer> maxBy = BinaryOperator.maxBy(comparator);
		
		BinaryOperator<Integer> minBy = BinaryOperator.minBy(comparator);
		
		System.out.println(maxBy.apply(80, 30));
		
		System.out.println(minBy.apply(80, 30));
	}

}
