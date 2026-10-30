import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Exercicio14 {
    public static void main(String[] args) {
        // 14) Seu vôo de Los Angeles para Frankfurt sai as 15:05 e demora 10 horas e 50 minutos.
        // Há que horas ele chegará no destino? Escreva um programa em Java que faça esse 
        // cálculo.
        
        // Definindo os fusos horários
        ZoneId fusoLosAngeles = ZoneId.of("America/Los_Angeles");
        ZoneId fusoFrankfurt = ZoneId.of("Europe/Berlin"); 

        // Criamos a data e hora de partida
        LocalDateTime horaLocalPartida = LocalDateTime.now().withHour(15).withMinute(5).withSecond(0);
        
        // Juntamos a hora com o fuso para criar um ZonedDateTime (Data e hora com fuso)
        ZonedDateTime partidaLA = ZonedDateTime.of(horaLocalPartida, fusoLosAngeles);

        // Definimos o tempo de duração do voo
        Duration tempoDeVoo = Duration.ofHours(10).plusMinutes(50);

        // Adicionamos o tempo de voo a partida
        ZonedDateTime chegadaLA = partidaLA.plus(tempoDeVoo);

        // Convertendo o horário de chegada para o fuso horário de Frankfurt
        ZonedDateTime chegadaFrankfurt = chegadaLA.withZoneSameInstant(fusoFrankfurt);
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("INFORMAÇÕES DO VOO");
        System.out.println("Partida (Horário de LA): " + partidaLA.format(formatador));
        System.out.println("Duração do voo: " + tempoDeVoo.toHours() + "h e " + (tempoDeVoo.toMinutesPart()) + "m");
        System.out.println("Chegada (Horário de Frankfurt): " + chegadaFrankfurt.format(formatador));
    }
}