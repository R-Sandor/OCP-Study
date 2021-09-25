import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.Optional;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;


class Product {

	int id; int price;
	public Product(int id, int price)
	{
		this.id = id;
		this.price = price;
	}
	public String toString() {
	return id + ":" + price;
	}
}

public class Streams2 {
    public static void main(String args[]) {
		List<Product> products = new ArrayList<>();
		products.add(new Product(1, 10));
		products.add(new Product(2, 30));
		products.add(new Product(2, 30));
		Product p = products.stream().reduce(new Product(4, 0), (p1, p2) -> {
		p1.price+=p2.price;
		return new Product(p1.id, p1.price);});
		System.out.println(p);
		System.out.println(products);
		products.add(p);
		products.stream().parallel()
		.reduce((p1, p2) -> p1.price > p2.price ? p1 : p2)
		.ifPresent(System.out::println);

		//-----------------------------------------
		/*

			This does not work becacuse Java knows at
			compile time that it is list of integers 
			rather than doubles.

		System.out.println("Testing UnaryOperator");
		List<Integer> codes = Arrays.asList (10, 20);
		UnaryOperator<Double> uo = s -> s +10.0;
		codes.replaceAll(uo);
		codes.forEach(c -> System.out.println(c));
		
		*/
	}
}

	


