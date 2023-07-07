import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;

public class ListSort {

	public static void main(String args[]){
		List<String> items = new ArrayList<>(Arrays
			.asList("?", "+", "1", "a", "B", "9", "10", "_", "2", "11", "z", "Z"));

		Collections.sort(items);
		System.out.println(items);
	}

}
