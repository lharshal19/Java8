package streamMethods.peek18;

import java.util.stream.Stream;
public class Example2 {

	public static void main(String[] args) {
		
		Stream<User> userStream = Stream.of(new User("AA"), new User("BB"), new User("CC"));
		
		userStream.peek(u -> u.setName(u.getName().toLowerCase())).forEach(System.out::println);
	}

}
