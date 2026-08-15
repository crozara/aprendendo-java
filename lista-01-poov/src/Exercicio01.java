import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        double num1 = 0.0, num2 = 0.0;
        int opcao = 0;
        
        
        do {
            System.out.println("\n\tMENU");
            System.out.println("\n1) Soma +");
            System.out.println("2) Subtração -");
            System.out.println("3) Multiplicação *");
            System.out.println("4) Divisão /");
            System.out.println("5) Módulo %");
            System.out.println("6) Sair");
            System.out.print("\nDigite a opção: ");

            opcao = s.nextInt();
            
            if (opcao > 0 && opcao < 6) {
                System.out.println("\nOpção " + opcao + ") escolhida!");
                System.out.println("\nDigite o primeiro número: ");
                num1 = s.nextDouble();
                System.out.println("Digite o segundo número: ");
                num2 = s.nextDouble();
            }

            switch (opcao) {
                case 1:
                    System.out.println("A soma de " + num1 + " com " + num2 + ": " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("A subtração de " + num1 + " com " + num2 + ": " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("A multiplicação de " + num1 + " com " + num2 + ": " + (num1 * num2));
                    break;
                case 4:
                    System.out.println("A divisão de " + num1 + " com " + num2 + ": " + (num1 / num2));
                    break;
                case 5:
                    System.out.println("O módulo de " + num1 + " com " + num2 + ": " + (num1 % num2));
                    break;
                case 6:
                    System.out.println("Finalizando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }

        } while (opcao != 6);

        s.close();

    }
}
