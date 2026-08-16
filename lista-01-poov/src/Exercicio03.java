import java.util.Scanner;

public class Exercicio03{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int cont = 0;
        System.out.print("Digite um número e descubra se ele é primo: ");
        int numero = s.nextInt();

        for(int i = 1; i <= numero; i++){
            if(numero % i == 0){
                cont++;
                if(cont > 2){
                    break;
                }
            }
        }
        if(cont == 2){
            System.out.println("O número é primo!");
        } else {
            System.out.println("O número não é primo!");
        }

        s.close();
    }
}