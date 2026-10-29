import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        // a) Criar um programa em Java que solicite duas datas via teclado (String), 
        // mostre qual data é a mais antiga e quantos dias de diferença existem entre as duas.

        Scanner s = new Scanner(System.in);
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Digite a primeira data: ");
        String texto1 = s.nextLine();
        
        System.out.print("Digite a segunda data: ");
        String texto2 = s.nextLine();

        LocalDate data1 = LocalDate.parse(texto1, formatador);
        LocalDate data2 = LocalDate.parse(texto2, formatador);

        //Calculando qual veio antes
        if(data1.isBefore(data2)){
            System.out.println("A data mais antiga é a primeira: " + texto1);
        }
        else if(data2.isBefore(data1)){
            System.out.println("A data mais antiga é a segunda: " + texto2);
        } else{
            System.out.println("As duas datas são exatamente iguais!");
        }

        //Calculando a diferença existente
        long diferencaDias = Math.abs(ChronoUnit.DAYS.between(data1, data2));
        System.out.println("A diferença entre as duas datas é de " + diferencaDias + " dias.");

        // b) Criar um programa em Java que solicite a data do seu nascimento (String), 
        // mostre na tela se você já fez aniversário esse ano e mostre na tela a sua idade.

        System.out.println("\n\nExercicio B");
        System.out.print("Digite a data de nascimento: ");
        String nas = s.nextLine();

        LocalDate nascimento = LocalDate.parse(nas, formatador);
        LocalDate hoje = LocalDate.now();

        // Calculando a idade exata 
        long idade = ChronoUnit.YEARS.between(nascimento, hoje);
        System.out.println("Sua idade é: " + idade + " anos.");

        // Para saber se já fez aniversário, puxamos a data de nascimento para o ano atual
        LocalDate aniversarioEsseAno = nascimento.withYear(hoje.getYear());

        // Se o aniversário desse ano for ANTES de hoje, ou IGUAL a hoje, a pessoa já fez aniversário.
        if (!aniversarioEsseAno.isAfter(hoje)) {
            System.out.println("Você já fez aniversário este ano!");
        } else {
            System.out.println("Você ainda não fez aniversário este ano. Prepare o bolo!");
        }
        
        //c) Criar e mostrar um LocalDate exatamente 6 semanas a partir da data de hoje. 
        System.out.println("\n\nExercicio C");

        // Adiciona exatamente 6 semanas à data de hoje
        LocalDate daquiA6Semanas = hoje.plusWeeks(6);

        // Imprime o resultado já formatado
        System.out.println("Daqui a 6 semanas será dia: " + daquiA6Semanas.format(formatador));

        // d)  Mostrar na tela o nome do dia da semana, em Francês, 
        // do dia da Tomada da Bastilha (14 de julho) no ano atual. 
        System.out.println("\n\nExercicio D");

        int anoAtual = LocalDate.now().getYear();
        LocalDate bastilha = LocalDate.of(anoAtual, 7, 14);

        //Nome do dia da semana traduzido para o Francês
        String diaEmFrances = bastilha.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.FRENCH);
        System.out.println("No ano de " + anoAtual + ", o dia da Tomada da Bastilha (14/07) cai em: " + diaEmFrances);
        
        // e) Mostrar o dia do mês da quarta quinta-feira de novembro do ano atual
        System.out.println("\n\nExercicio E");

        LocalDate inicioNovembro = LocalDate.of(anoAtual, Month.NOVEMBER, 1);
        LocalDate acaoDeGracas = inicioNovembro.with(TemporalAdjusters.dayOfWeekInMonth(4, DayOfWeek.THURSDAY));
        int diaDoMes = acaoDeGracas.getDayOfMonth();
        System.out.println("A quarta quinta-feira de novembro de " + anoAtual + " cai no dia: " + diaDoMes);

        s.close();
    }
}