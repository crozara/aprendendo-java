import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
    
        Scanner s = new Scanner(System.in);

        System.out.println("Digite 03 Strings: ");
        String s1 = s.nextLine();
        String s2 = s.nextLine();
        String s3 = s.nextLine();

        //a) contar as ocorrências da 2a String na 1a String
        int contador = 0;
        int busca = s1.indexOf(s2, 0);

        while(busca != -1){
            contador++;
            busca = s1.indexOf(s2, busca + s2.length());
        }

        System.out.println("Existe " + contador + " ocorrências da 2° String na 1° String!");


        //b) substituir na 1a String todas as ocorrências da 2a String pela 3a String

        s1 = s1.replace(s2, s3);
        System.out.println("String modificada: " + s1);


        s.close();
    }
}
