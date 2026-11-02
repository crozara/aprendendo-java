package principal;
import java.util.ArrayList;
import java.util.Scanner;
import modelo.Restaurante;

//d) escreva um programa que crie um ArrayList de objetos restaurante e solicite a entrada dos dados pelo usuário. Em seguida, 
// o programa pergunta o tipo de comida ao usuário e lista todos os restaurantes que o oferecem. 

public class AppRestaurante {
    public static void main(String[] args) {
        ArrayList<Restaurante> restaurantes = new ArrayList<Restaurante>();
        Scanner s = new Scanner(System.in);
        Restaurante r = new Restaurante();

        System.out.print("Digite o nome do restaurante: ");
        r.setNome(s.nextLine());
        System.out.print("\nDigite o endereço do restaurante: ");
        r.setEndereco(s.nextLine());
        System.out.print("\nDigite o tipo de comida do restaurante: ");
        r.setTipoComida(s.nextLine());
        System.out.print("\nDigite o Preço Médio do restaurante: ");
        r.setPrecoMedio(s.nextDouble());

        s.nextLine();

        restaurantes.add(r);
        System.out.println("\n------Imprimindo o Restaurante------");
        r.imprimirDados();

        System.out.print("Qual tipo de comida você gostaria: ");
        String tipo = s.nextLine();

        boolean encontrado = false;

        for (Restaurante restaurante : restaurantes) {
            if(restaurante.getTipoComida().equalsIgnoreCase(tipo)){
                restaurante.imprimirDados();
                encontrado = true;
            }
        }

        if(!encontrado){
            System.out.println("Não foi possível encontrar restaurantes com esse tipo de comida!");
        }

        s.close();
    }
}
