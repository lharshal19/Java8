package collectMethods.groupBy4.groupingBy;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
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


		
		Map<Object, List<String>> output1 = list.stream() // Stream<STring>
				.collect(Collectors.groupingBy(x ->x.length()));

		System.out.println(output1);
		
		
		Map<Object, List<String>> output2 = list.stream()
				.collect(Collectors.groupingBy(x ->x.contains("O")));

		System.out.println(output2);
	}

}
//Output
// {5=[Apple, Apple], 6=[Papaya, Banana, Orange, Orange, Orange]}
// {false=[Apple, Apple, Papaya, Banana], true=[Orange, Orange, Orange]}
