import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Exercicio15 {
    public static void main(String[] args) {
        //15) Seu voo de retorno sai de Frankfurt as 14:05 e chega em Los Angeles as 16:40. 
        // Quanto tempo o voo demorou? Escreva um programa em Java que faça esse cálculo.

        ZoneId fusoFrankfurt = ZoneId.of("Europe/Berlin");
        ZoneId fusoLosAngeles = ZoneId.of("America/Los_Angeles");

        LocalDate dataVoo = LocalDate.now();

        ZonedDateTime partidaFrankfurt = ZonedDateTime.of(dataVoo, LocalTime.of(14, 5), fusoFrankfurt);
        ZonedDateTime chegadaLA = ZonedDateTime.of(dataVoo, LocalTime.of(16, 40), fusoLosAngeles);

        if (chegadaLA.toInstant().isBefore(partidaFrankfurt.toInstant())) {
            chegadaLA = chegadaLA.plusDays(1);
        }

        Duration duracaoVoo = Duration.between(partidaFrankfurt, chegadaLA);
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("DURAÇÃO DO VOO DE RETORNO");
        System.out.println("Partida (Frankfurt): " + partidaFrankfurt.format(formatador));
        System.out.println("Chegada (Los Angeles): " + chegadaLA.format(formatador));
        System.out.println("O voo demorou: " + duracaoVoo.toHours() + " horas e " + duracaoVoo.toMinutesPart() + " minutos.");
    }
}

