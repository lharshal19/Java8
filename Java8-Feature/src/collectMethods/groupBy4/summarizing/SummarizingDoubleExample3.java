package collectMethods.groupBy4.summarizing;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
public class SummarizingDoubleExample3 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Apple");
		list.add("Apple");
		list.add("Papaya");
		list.add("Banana");
		list.add("Orange");
		list.add("Orange");
		list.add("Orange");

		DoubleSummaryStatistics output1 = list.stream().collect(Collectors.summarizingDouble((x -> x.length())));

		System.out.println(output1);
		
		System.out.println(output1.getAverage());
		System.out.println(output1.getMax());
		System.out.println(output1.getSum());
		System.out.println(output1.getMin());
	}
}
