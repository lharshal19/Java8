package collectMethods.groupBy4.groupingBy;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
public class Example3 {
	public static void main(String[] args) {
		
		Function<String, String> function = (a) ->a;
		
		List<String> list = new ArrayList<String>();
		list.add("Apple");
		list.add("Apple");
		list.add("Papaya");
		list.add("Banana");
		list.add("Orange");
		list.add("Orange");
		list.add("Orange");

		Map<String, Long> output = list.stream()
				.collect(Collectors.groupingBy(function, Collectors.counting()));

		System.out.println(output);

	}

}
