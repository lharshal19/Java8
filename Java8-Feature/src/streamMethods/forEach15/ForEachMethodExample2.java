package streamMethods.forEach15;

import java.util.ArrayList;
import java.util.List;

public class ForEachMethodExample2 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("DD");
		list.add("CC");
		list.add("ADDDA");
		list.add("AA");
		list.add("");
		list.add("");
		list.add("BB");

		list.stream().parallel().forEach(x -> System.out.println(x));
		System.out.println("----");
		list.stream().parallel().forEachOrdered(x -> System.out.println(x));

	}

}
