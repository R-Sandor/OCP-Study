import java.util.Map;
import java.util.HashMap;
import java.util.function.BiConsumer;

public class Consumers {

	public static void main(String args[]){
		Map<Integer, Integer> mVal = new HashMap<>();
		mVal.put(1, 10);
		mVal.put(2, 20);

		BiConsumer<Integer,Integer> c = (i, j) ->{System.out.print (i + "," + j+ ";");};
		c.accept(1,2);
		mVal.forEach(c);
		System.out.println();
	}
}
