import java.time.LocalDate;
import java.time.LocalTime;

public class LocalTimes {

	public static void main(String... time){
		LocalTime midnight = LocalTime.of(0,0);
		//LocalTime midnight2 = LocalTime.of(24,0); // Hour time is from 0-23 in Java.
		// ^ compiles but will throw a runtime exception.
		System.out.println(midnight);
		//System.out.println(midnight2);
		//System.out.println("Are they the same " + midnight.equals(midnight2));

	}

}
