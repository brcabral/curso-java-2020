import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class CalculationsWithDate {
	public static void main(String[] args) {
		LocalDate dt01 = LocalDate.parse("2022-10-26");
		LocalDateTime dt02 = LocalDateTime.parse("2022-10-26T13:55:20");
		Instant dt03 = Instant.parse("2022-10-26T01:30:44Z");

		LocalDate pastWeekLocalDate = dt01.minusDays(7);
		System.out.println("pastWeekLocalDate: " + pastWeekLocalDate);

		LocalDate nextWeekLocalDate = dt01.plusDays(7);
		System.out.println("nextWeekLocalDate: " + nextWeekLocalDate);

		LocalDate plusYearsLocalDate = dt01.plusYears(3);
		System.out.println("plusYearsLocalDate: " + plusYearsLocalDate);

		System.out.println();
		LocalDateTime pastWeekLocalDateTime = dt02.minusDays(7);
		System.out.println("pastWeekLocalDateTime: " + pastWeekLocalDateTime);

		LocalDateTime nextWeekLocalDateTime = dt02.plusDays(7);
		System.out.println("nextWeekLocalDateTime: " + nextWeekLocalDateTime);

		LocalDateTime plusYearsLocalDateTime = dt02.plusYears(3);
		System.out.println("plusYearsLocalDateTime: " + plusYearsLocalDateTime);

		LocalDateTime plusHoursLocalDateTime = dt02.plusHours(8);
		System.out.println("plusHoursLocalDateTime: " + plusHoursLocalDateTime);

		LocalDateTime minusMinutesLocalDateTime = dt02.minusMinutes(65);
		System.out.println("minusMinutesLocalDateTime: " + minusMinutesLocalDateTime);

		System.out.println();
		Instant pastWeekInstant = dt03.minus(7, ChronoUnit.DAYS);
		System.out.println("pastWeekInstant: " + pastWeekInstant);

		Instant nextWeekInstant = dt03.plus(7, ChronoUnit.DAYS);
		System.out.println("nextWeekInstant: " + nextWeekInstant);
		
		System.out.println();
		Duration d01 = Duration.between(pastWeekLocalDate.atStartOfDay(), dt01.atStartOfDay());
		System.out.println("d01 em dias: " + d01.toDays());
		
		Duration d02 = Duration.between(pastWeekLocalDateTime, dt02);
		System.out.println("d02 em dias: " + d02.toDays());
		
		Duration d03 = Duration.between(pastWeekInstant, dt03);
		System.out.println("d03 em dias: " + d03.toDays());
		
		Duration d04 = Duration.between(dt03, pastWeekInstant);
		System.out.println("d04 em dias: " + d04.toDays());
	}
}
