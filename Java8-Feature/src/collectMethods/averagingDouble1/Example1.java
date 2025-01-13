package collectMethods.averagingDouble1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class Example1 {
	public static void main(String[] args) {
		
		List<Double> list = new ArrayList<Double>();
		for (int i = 0; i < 10; i++) {
			list.add(Double.valueOf(i));
		}
		
		Double output = list.stream().collect(Collectors.averagingDouble(x ->x));
		
		System.out.println(output);
	}

}
