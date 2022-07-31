import java.util.Locale;
import java.util.ResourceBundle;
import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class DolphinFinder{

	public static void main(String args[]){

		Locale fr = new Locale("fr", "FR");
		Locale.setDefault(new Locale("en", "US"));
		ResourceBundle rb = ResourceBundle.getBundle("Dolphins", fr);
		String name = rb.getString("name");
		String age = rb.getString("age");
		System.out.println(name + ": " + age);

		String s = Duration.of(75, ChronoUnit.SECONDS).toString();
		System.out.println(s);

	}


}