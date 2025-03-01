package collectMethods.groupBy4.reducing;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
public class Example1 {
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("Apple");
		list.add("Apple");
		list.add("Papaya");
		list.add("Banana");
		list.add("Orange");
		list.add("Orange");
		list.add("Orange");
		
		BinaryOperator<String> binaryOperator = (a,b) -> a.concat(b);
				
		Optional<String> result = list.stream().collect(Collectors.reducing(binaryOperator));
		
		System.out.println(result.get());
	}

}
