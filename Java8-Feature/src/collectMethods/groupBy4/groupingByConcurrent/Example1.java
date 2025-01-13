package collectMethods.groupBy4.groupingByConcurrent;

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

		// java.util.stream.Collectors;
		Map<Object, List<String>> output1 = list.stream().collect(Collectors.groupingByConcurrent(x->x));

		System.out.println(output1);

		Map<Object, List<String>> output2 = list.stream().collect(Collectors.groupingByConcurrent(x -> x.contains("O")));

		System.out.println(output2);
	}

}
