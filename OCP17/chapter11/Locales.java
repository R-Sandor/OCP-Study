import java.util.Locale;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Locales {
	public static void main(String[] args){
	  	var dt = LocalDateTime.now();
		var g1 = DateTimeFormatter.ofPattern("MMMM dd', Party''s at' hh:mm");
		System.out.println(g1.format(dt));

		Locale locale = Locale.getDefault();
		System.out.println(locale);

	}

}
