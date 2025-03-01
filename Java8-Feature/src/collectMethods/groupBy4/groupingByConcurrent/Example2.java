package collectMethods.groupBy4.groupingByConcurrent;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Example2 {
	public static void main(String[] args) {
		
		Function<Double, Double> function = a -> a;
		
		List<Double> list = new ArrayList<Double>();
		for (int i = 0; i < 10; i++) {
			list.add(Double.valueOf(i));
			list.add(Double.valueOf(i));
		}
		
		Map<Double, Long> output = list.stream().collect(Collectors.groupingByConcurrent(x ->x,Collectors.counting()));
		
		System.out.println(output);
	}

}
