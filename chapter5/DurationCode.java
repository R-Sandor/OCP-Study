import java.time.Period;
import java.time.Instant;
import java.time.temporal.ChronoUnit;



public class DurationCode {
	public static void main(String argsp[]) {
		System.out.println(Period.ofWeeks(2));
		System.out.println(Period.ofMonths(2));
		try{
		Instant loginTime = Instant.now();
		System.out.println(loginTime);
		Thread.sleep(1000);

		Instant logoutTime = Instant.now();

		System.out.println(logoutTime);
		loginTime = loginTime.truncatedTo(ChronoUnit.MINUTES);
		logoutTime = logoutTime.truncatedTo(ChronoUnit.MINUTES);

		if (logoutTime.isAfter(loginTime))
			System.out.println("Logged out at:" + logoutTime);
		else
			System.out.println("Can't loggout");
		} catch(Exception e){

		}
	}
}
