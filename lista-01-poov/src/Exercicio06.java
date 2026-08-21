import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
    
        System.out.print("Digite uma palavra: ");
        String palavra = s.nextLine();

        //Utilizando o StringBuilder para inverter
        String invertida = new StringBuilder(palavra).reverse().toString();

        if(palavra.equalsIgnoreCase(invertida)){
            System.out.println("A Palavra "+ palavra + " é um palíndromo!");
        } else {
            System.out.println(("A Palavra " + palavra + " NÃO é um palíndromo!"));
        }
        s.close();
    }

}   
