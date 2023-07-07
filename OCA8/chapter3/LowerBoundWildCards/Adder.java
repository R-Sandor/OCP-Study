import java.util.Arrays;
import java.util.List;

public class Adder {

	public void add(List<? super Number> list){
		list.add(4);	
	}

	public static void main(String args[]){
		//List<Integer> intList = new ArrayList(Arrays.asList(1, 2, 3));
		//new Adder().add(intList);
		//System.out.println(intList);
	}
}
