package collectMethods.averagingInt2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Example1 {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}
		
		Double output = list.stream().collect(Collectors.averagingInt(x ->x));
		
		System.out.println(output);
	}

}
