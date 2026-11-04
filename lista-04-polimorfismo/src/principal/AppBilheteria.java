package principal;
import java.math.BigDecimal;
import java.util.Scanner;

import modelo.ex02_bilheteria.*;

public class AppBilheteria {
    public static void main(String[] args) {

        int opcao = 0;
        Scanner s = new Scanner(System.in);
        Viagem v = null;

        do{
            System.out.println("\n\n===MENU===");
            System.out.println("1 - Abrir uma viagem");
            System.out.println("2 - Registar entrada de Passageiro");
            System.out.println("3 - Listas passageiros");
            System.out.println("4 - Valor total arrecadado");
            System.out.println("5 - Finalizar o programa");
            
            System.out.print("\nEscolha uma opção: ");
            opcao = s.nextInt();
            s.nextLine();

                switch (opcao) {
                    case 1:
                        System.out.println("\nOpção 01 - escolhida!");

                        System.out.print("Digite o nome do motorista: ");
                        String motorista = s.nextLine();
                    
                        System.out.print("Digite o valor da tarifa: ");
                        BigDecimal tarifa = s.nextBigDecimal();

                        v = new Viagem(motorista, tarifa);
                        System.out.println("Viagem criada!");

                        break;
                    
                    case 2:
                        
                        int opcao2 = 0;
                        System.out.println("\nOpção 02 - escolhida!");
                        System.out.println("Qual o tipo de passageiro: ");

                        do{
                            System.out.println("1 - Estudante");
                            System.out.println("2 - Regular");
                            System.out.println("3 - Reformardo");
                            System.out.print("Digite a opcção: ");
                            opcao2 = s.nextInt();
                            s.nextLine();

                    
                            switch (opcao2) {
                                case 1:
                                    if(v != null){
                                        System.out.print("\nDigite o nome do passageiro: ");
                                        String nome = s.nextLine();
                                        System.out.print("\nDigite o numero do aluno: ");
                                        int num = s.nextInt();
    
                                        Passageiro estudante = new PassageiroEstudante(nome, num);
                                        v.adicionarPassageiro(estudante);
                                    } else{
                                        System.out.println("Primeiro crie uma viagem");
                                    }

                                    break;
                                case 2:
                                    if(v != null){
                                        System.out.print("\nDigite o nome do passageiro: ");
                                        String nome2 = s.nextLine();

                                        Passageiro regular = new  PassageiroRegular(nome2);
                                        v.adicionarPassageiro(regular);
                                    }else {
                                        System.out.println("Primeiro crie uma viagem");
                                    }
                                    break;
                                case 3:
                                    if(v != null){
                                        System.out.print("\nDigite o nome do passageiro: ");
                                        String nome3 = s.nextLine();

                                        System.out.println("\nDigite o numero do cidadão: ");
                                        int num2 = s.nextInt();

                                        Passageiro reformado = new PassageiroReformado(nome3, num2);
                                        v.adicionarPassageiro(reformado);
                                    } else {
                                        System.out.println("\nPrimeiro crie uma viagem");
                                    }
                                    break;
                                default:
                                    System.out.println("Opção inválida!");
                                    break;
                            }

                        }while(opcao2 > 3 || opcao < 1);

                        break;
                    case 3:
                        System.out.println("\nOpção 03 - escolhida!");
                        v.listarPassageiros();
                        break;
                    case 4:
                        System.out.println("\nOpção 04 - escolhida!");
                        BigDecimal faturamento = v.calcularFaturamento();
                        System.out.println("Faturamento da viagem: " + faturamento);
                        break;
                    case 5:
                        System.out.println("Ok, finalizando programa!");
                    default:
                        System.out.println("\n\nOpção inválida!");
                        break;
                }
        }while(opcao != 5);
        s.close();
    }
}
