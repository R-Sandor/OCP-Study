import java.util.ArrayList;
import java.util.List;

// A good thing to note is all public interfaces need to have their own Java class.
interface Shippable<T> {
	void ship(T t);
}

					// If we do not declare the type here then 
public class GenericInterface implements Shippable {
					// Object must declared here.		
	public void ship(Object s) {}

	public static void main(String args[]){
	
		List<Integer> numbers = new ArrayList<>();
		numbers.add(42);
		List list = numbers;
		//List<Object> list = numbers; // However this fails... because numbers and objects are references to the same object.
		list.add("TEST, SHOULD Pass due to type erasure");
		System.out.println(list.get(1));
	}

}
