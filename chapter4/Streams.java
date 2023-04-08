import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.function.Predicate;
import java.util.Optional;
import java.util.Arrays;
import java.util.List;

public class Streams {
    public static void main(String args[]) {
        Stream<Integer> s = Stream.of(1, 2, 3);
        System.out.println(s.count());
        System.out.println();
        Stream<Integer> s2 = Stream.iterate(1, n -> n + 10);
        //s2.skip(1).limit(4).forEach(System.out::println);
        s2.limit(4).forEach(System.out::println);
        System.out.println("Range 1-5:");
        IntStream range = IntStream.range(1, 5);
        range.forEach(System.out::println);
        System.out.println("Closed Range:");
        IntStream rangeClosed = IntStream.rangeClosed(1, 5);
        rangeClosed.forEach(System.out::println);


		Predicate<? super String> predicate = x -> x.length() > 3;
		Stream<String> stream = Stream.iterate("-", (x) -> x + x);
		boolean b2 = stream.anyMatch(predicate);
		System.out.println(b2);

		System.out.println(Stream.iterate(1, x -> ++x).limit(5).map(x -> "" + x).collect(Collectors.joining()));
		// This line will throw a null pointer exception. 
		// magic(Stream.of(5,10));
		magic(Stream.of(3,0));

    }

	private static void magic(Stream<Integer> s) {
		Optional o = s.filter(x -> x < 5).limit(3).max((x, y) -> x-y);
		System.out.println(o.get());

	}

}

	


