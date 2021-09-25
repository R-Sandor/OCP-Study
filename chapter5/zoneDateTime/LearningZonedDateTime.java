import java.time.ZonedDateTime;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.time.ZoneId;
import java.time.Month;
public class LearningZonedDateTime {

	public static void main(String args[]){
		LocalDate date = LocalDate.of(2016, Month.NOVEMBER, 6);
		LocalTime time = LocalTime.of(1, 30);
		ZoneId zone = ZoneId.of("US/Eastern");
		ZonedDateTime dateTime1 = ZonedDateTime.of(date, time, zone);
		ZonedDateTime dateTime2 = dateTime1.plus(1, ChronoUnit.HOURS);
		ZonedDateTime dateTime3 = dateTime1.plusHours(1);

		long hours = ChronoUnit.HOURS.between(dateTime1, dateTime2);
		System.out.println(dateTime1);
		System.out.println(dateTime2);
		System.out.println(dateTime3);
		int clock1 = dateTime1.getHour();
		int clock2 = dateTime2.getHour();
		System.out.println(hours + "," + clock1 + "," + clock2);

	}


}
