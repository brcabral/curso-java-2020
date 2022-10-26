import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class ConvertingDateToText {
	public static void main(String[] args) {
		LocalDate dt01 = LocalDate.parse("2022-10-26");
		LocalDateTime dt02 = LocalDateTime.parse("2022-10-26T13:55:20");
		Instant dt03 = Instant.parse("2022-10-26T01:30:44Z");

		DateTimeFormatter fmt01 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt02 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter fmt03 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		DateTimeFormatter fmt04 = DateTimeFormatter.ISO_DATE_TIME;
		DateTimeFormatter fmt05 = DateTimeFormatter.ISO_INSTANT;
		DateTimeFormatter fmt06 = DateTimeFormatter.ISO_INSTANT.withZone(ZoneId.systemDefault());

		System.out.println("Exibindo dt01 no formato padrão(ISO 8601): " + dt01);
		System.out.println("Exibindo dt01 usando o formato dd/MM/yyyy (date.format): " + dt01.format(fmt01));
		System.out.println("Exibindo dt01 usando o formato dd/MM/yyyy (formatter.format): " + fmt01.format(dt01));

		System.out.println();
		System.out.println("Exibindo dt02 no formato padrão(ISO 8601): " + dt02);
		System.out.println("Exibindo dt02 usando o formato dd/MM/yyyy (fmt01): " + dt02.format(fmt01));
		System.out.println("Exibindo dt02 usando o formato dd/MM/yyyy HH:mm (fmt02): " + dt02.format(fmt02));
		System.out.println("Exibindo dt02 usando o formato ISO_DATE_TIME (fmt04): " + dt02.format(fmt04));

		System.out.println();
		System.out.println("Exibindo dt03 no formato padrão(ISO 8601): " + dt03);
		System.out.println("Exibindo dt03 usando o formato dd/MM/yyyy HH:mm (fmt03): " + fmt03.format(dt03));
		System.out.println("Exibindo dt03 usando o formato ISO_INSTANT (fmt05): " + fmt05.format(dt03));
		System.out.println("Exibindo dt03 usando o formato ISO_INSTANT com withZone (fmt06): " + fmt06.format(dt03));
	}
}
