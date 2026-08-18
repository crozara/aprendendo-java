import java.util.Scanner;

public class Exercicio05{
    public static void main(String[] args) {
    
        Scanner s = new Scanner(System.in);
        String correctPassword = "devjava123";
        int cont = 0;
        boolean acesso = false;
        System.out.println("----- Sistem de Login -----");
        
        while(cont < 3){
            System.out.print("Digite a sua senha: ");
            String password = s.nextLine();

            if(password.equals(correctPassword)){
                System.out.println("Senha correta! Acesso liberado.");
                acesso = true;  
                break;
            } else {
                cont++;
                System.out.println("Senha incorreta!");
                if(cont < 3){
                    System.out.println("Você tem mais "  + (3-cont) + " tentativa(s)!\n");
                }
            }
        }

        if(!acesso){
            System.out.println("Você errou as 3 tentativas. Programa encerrado!");
        }

        s.close();
    }
}