import java.util.stream.Stream;

public class Uses {
	public static void main(String args[]){
		Stream<String> stream = Stream.of("This", "Little", "Piggy");
		System.out.println(stream.filter(x -> x.length() > 3).filter(x -> x.length() > 3).count());
	}

}
