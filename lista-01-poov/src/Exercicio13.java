import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        
        //13) Escreva um programa em Java que mostre a quantos dias você está vivo.

        Scanner s = new Scanner(System.in);
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Digite a sua data de nascimento: ");
        String texto1 = s.nextLine();
        
        LocalDate hoje = LocalDate.now();
        LocalDate nascimento = LocalDate.parse(texto1, formatador);

        // Calculando a quantidade de dias entre o nascimento e hoje
        long diasDeVida = java.time.temporal.ChronoUnit.DAYS.between(nascimento, hoje);
        
        System.out.println("Você está vivo há " + diasDeVida + " dias!");

        s.close();
    }
}
