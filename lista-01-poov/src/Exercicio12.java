import java.time.LocalDate;

public class Exercicio12 {
    public static void main(String[] args) {
        
        //12) Escreva um programa em Java equivalente ao programa cal do Unix que mostra 
        // um calendário de um mês escolhido seguindo o seguinte formato (no pdf):
        
        LocalDate data = LocalDate.of(2021, 10, 1); 
        int totalDiasNoMes = data.lengthOfMonth();
        int diaDaSemanaDoPrimeiroDia = data.getDayOfWeek().getValue();

        System.out.println("Calendário:");
        System.out.println("Seg  Ter  Qua  Qui  Sex  Sáb  Dom");

        // Espaços em branco para alinhar o dia 1o com o dia da semana correto (Sexta, que é a coluna 5)
        for (int i = 1; i < diaDaSemanaDoPrimeiroDia; i++) {
            System.out.print("     "); 
        }

        // Imprime os dias do mês
        for (int dia = 1; dia <= totalDiasNoMes; dia++) {
            // Formata a saída para que os números de um e dois dígitos ocupem o mesmo espaço, 
            // mantendo as colunas alinhadas.
            System.out.printf("%3d  ", dia);

            // Se o dia da semana atual mais o dia impresso chegar a 7 (Domingo), salta para a linha de baixo
            if ((dia + diaDaSemanaDoPrimeiroDia - 1) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println(); 
    }
}
