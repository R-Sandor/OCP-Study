//import java.util.List;
import static java.util.List.of;
import static java.lang.Math.sqrt;

public class Immutable {
	final String name;

	Immutable(String name){
		this.name = name;
	}
	public static void main(String[] args){
		System.out.println(new Immutable("Jon"));
	}
	
	// remember to String must be public.
	public String toString() {
		return this.name;
	}
}
