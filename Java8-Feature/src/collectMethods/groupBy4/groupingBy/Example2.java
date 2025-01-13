package collectMethods.groupBy4.groupingBy;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
public class Example2 {
	public static void main(String[] args) {
		List<Double> list = new ArrayList<Double>();
		for (int i = 0; i < 10; i++) {
			list.add(Double.valueOf(i));
			list.add(Double.valueOf(i));
		}
		
		Map<Double, Long> output = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		System.out.println(output);
	}

}
