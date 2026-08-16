import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Digite um número e descubra todos os primos até ele: ");
        int cont = 0;
        int limite = s.nextInt();
        boolean flag = false;

        for(int i = 2; i <= limite; i++){
            cont = 0;

            for(int j = 1; j <= i; j++){
                if(i % j == 0){
                    cont++;
                    if(cont > 2){
                        break;
                    }
                }
            }
            if(cont == 2){
                System.out.print(i + " ");
                flag = true;
            }
        }

        if(!flag){
            System.out.println("Nenhum primo foi encontrado neste intervalo.");
        }
        
        System.out.println();
        s.close();
    }
}
