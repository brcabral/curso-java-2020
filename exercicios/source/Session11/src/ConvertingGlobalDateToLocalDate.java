import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class ConvertingGlobalDateToLocalDate {
	public static void main(String[] args) {
		LocalDate dt01 = LocalDate.parse("2022-10-26");
		LocalDateTime dt02 = LocalDateTime.parse("2022-10-26T13:55:20");
		Instant dt03 = Instant.parse("2022-10-26T01:30:44Z");

		// ZoneId.getAvailableZoneIds() -> Retorna os ZoneIds disponíveis
		// for (String zone : ZoneId.getAvailableZoneIds()) {
		// System.out.println(zone);
		// }

		// Converter o Instant em uma data considerando o fuso horário do computador
		LocalDate result01 = LocalDate.ofInstant(dt03, ZoneId.systemDefault());
		System.out.println("result01: " + result01);

		// Converter o Instant em uma data considerando o fuso horário de Portugal
		LocalDate result02 = LocalDate.ofInstant(dt03, ZoneId.of("Portugal"));
		System.out.println("result02: " + result02);

		// Converter o Instant em uma data considerando o fuso horário do computador
		LocalDateTime result03 = LocalDateTime.ofInstant(dt03, ZoneId.systemDefault());
		System.out.println("result03: " + result03);

		// Converter o Instant em uma data considerando o fuso horário de Portugal
		LocalDateTime result04 = LocalDateTime.ofInstant(dt03, ZoneId.of("Portugal"));
		System.out.println("result04: " + result04);

		System.out.println();
		System.out.println("Obter parte de um LocalDate/LocalDateTime");
		System.out.println("d01 -> dia: " + dt01.getDayOfMonth());
		System.out.println("d01 -> mês: " + dt01.getMonthValue());
		System.out.println("d01 -> ano: " + dt01.getYear());
		System.out.println("d01 -> dia da semana: " + dt01.getDayOfWeek());

		System.out.println();
		System.out.println("d02 -> hora: " + dt02.getHour());
		System.out.println("d02 -> minuto: " + dt02.getMinute());
		System.out.println("d02 -> segundos: " + dt02.getSecond());
	}
}
