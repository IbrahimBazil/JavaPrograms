import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.annotations.Test;

public class streams_assignment {

	@Test
	public void stream_test() {
		List<Integer> values = Arrays.asList(3, 2, 3, 6, 8, 2, 8, 5, 8);
		values.stream().distinct().sorted().forEach(s -> System.out.println(s));
	}

	@Test
	public void stream_collect() {
		List<String> ls = Stream.of("Lion", "Dog", "Cat").sorted().map(s -> s.toLowerCase())
				.collect(Collectors.toList());
		System.out.println(ls.get(0));
	}

}
