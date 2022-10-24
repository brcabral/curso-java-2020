import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class WorkingWithDateTime {
	public static void main(String[] args) {
		// Intanciar data local
		LocalDate dt01 = LocalDate.now();
		System.out.println("Intanciar data local: " + dt01);
		
		// Intanciar data e hora local
		LocalDateTime dt02 = LocalDateTime.now();
		System.out.println("Intanciar data e hora local: " + dt02);
		
		// Intanciar data e hora com time zone (GMT)
		Instant dt03 = Instant.now();
		System.out.println("Intanciar data e hora com time zone (GMT): " + dt03);
		
		// Instanciar data a partir de um texto (padrão ISO 8601)
		LocalDate dt04 = LocalDate.parse("2022-10-21");
		System.out.println("Instanciar data a partir de um texto (padrão ISO 8601): " + dt04);
		
		// Instanciar data e hora a partir de um texto (padrão ISO 8601)
		LocalDateTime dt05 = LocalDateTime.parse("2022-10-21T15:32:44");
		System.out.println("Instanciar data e hora a partir de um texto (padrão ISO 8601): " + dt05);
		
		// Instanciar data e hora a partir de um texto (padrão ISO 8601) com time zone
		Instant dt06 = Instant.parse("2022-10-21T15:32:44Z");
		System.out.println("Instanciar data e hora a partir de um texto (padrão ISO 8601) com time zone: " + dt06);
		
		// Instanciar data e hora a partir de um texto (padrão ISO 8601) especificando o time zone (-3)
		Instant dt07 = Instant.parse("2022-10-21T15:32:44-03:00");
		System.out.println("Instanciar data e hora a partir de um texto (padrão ISO 8601) especificando o time zone (-3): " + dt07);
		
		// Instanciar data a partir de um texto customizado
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate dt08 = LocalDate.parse("21/10/2022", fmt1);
		System.out.println("Instanciar data a partir de um texto customizado: " + dt08);
		
		// Instanciar data e hora a partir de um texto customizado
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		LocalDateTime dt09 = LocalDateTime.parse("21/10/2022 15:44", fmt2);
		System.out.println("Instanciar data e hora a partir de um texto customizado: " + dt09);
		
		// Instanciar data a partir de dados isolados
		LocalDate dt10 = LocalDate.of(2022, 10, 21);
		System.out.println("Instanciar data a partir de dados isolados: " + dt10);
		
		// Instanciar data e hora a partir de dados isolados
		LocalDateTime dt11 = LocalDateTime.of(2022, 10, 21, 15, 47);
		System.out.println("Instanciar data e hora a partir de dados isolados: " + dt11);
	}
}
