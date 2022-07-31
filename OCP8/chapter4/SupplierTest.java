import java.util.function.Supplier;
public class SupplierTest {
	static public Supplier<String> strMkr = String::new;
	public static void main(String args[]){
		System.out.println("testing!" + strMkr.get());
	}
}
