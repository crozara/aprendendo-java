import java.util.Scanner;
import java.util.Random;

public class Exercicio08 {
    public static void main(String[] args) throws Exception {

        // a) Criar um vetor de tamanho 20 de inteiros  

        int vetor[] = new int[20];

        // b) Preencher os 10 primeiros valores do vetor com números digitados pelo usuário via teclado

        Scanner s = new Scanner(System.in);

        for(int i = 0; i < 10; i++){
            System.out.println("Digite um valor: ");
            vetor[i] = s.nextInt();   
        }


        // c) Preencher os 10 últimos valores do vetor com números aleatórios entre 1 e 100

        Random r = new Random();
        for(int i = vetor.length - 10; i <vetor.length; i++){
            vetor[i] = r.nextInt(1, 100); 
        }

        // d) Mostrar o vetor inteiro na tela

        System.out.println("O vetor atual: ");
        for(int i = 0; i < vetor.length; i++){
            System.out.printf("%d ", vetor[i]);
        }
        System.out.print("\n");

        // e) Mostrar o vetor de trás para frente na tela

        System.out.println("O vetor de trás para frente: ");
        for(int i = vetor.length - 1; i >= 0; i--){
            System.out.printf("%d ", vetor[i]);
        }
        System.out.print("\n");
            
        // f) Calcular e mostrar a média dos valores do vetor

        double soma = 0.0; 
        for(int i = 0; i < vetor.length; i++){
            soma += vetor[i];
        }
        System.out.printf("Média entre os números do vetor: %.2f\n", soma/(vetor.length));
        
        // g) Encontrar e mostrar o maior valor e o menor valor do vetor 

        int maior, menor;
        menor = maior = vetor[0];

        for(int i = 0; i < vetor.length; i++){
            if(vetor[i] > maior){
                maior = vetor[i];
            }
            if(vetor[i] < menor){
                menor = vetor[i];
            }
        }
        System.out.println("Menor valor = " + menor);
        System.out.println("Maior valor = " + maior);

        // h) Mostrar os valores das posições pares do vetor
        
        for (int i = 0; i < vetor.length; i += 2){
            System.out.println("Valores das posições pares: " + vetor[i]);
        }
        // i) Mostrar os valores das posições ímpares do vetor

        for(int i = 1; i < vetor.length; i += 2){
            System.out.println("Valores das posições ímpares: " + vetor[i]);
        }

        // j) Mostrar os valores pares do vetor

        for(int i = 0; i < vetor.length; i++){
            if(vetor[i] % 2 == 0){
                System.out.println("Valores pares do vetor: " + vetor[i]);
            }
        }
        // k) Mostrar os valores ímpares do vetor

        for(int i = 0; i < vetor.length; i++){
            if(vetor[i] % 2 != 0){
                System.out.println("Valores ímpares do vetor: " + vetor[i]);
            }
        }
        // l)Verificar se há elementos repetidos no vetor e exibir uma mensagem em caso afirmativo
        int num = 0, ans = 0;
        for(int i = 0; i < vetor.length; i++){
            num = vetor[i];
            for(int j = i + 1; j < vetor.length; j++)
            {
                if(num == vetor[j]){
                    ans++;
                    break;
                }
            }
        }
        if(ans != 0)
        {
            System.out.println("Existe vetor repetido no vetor!");
        }

        // m) Solicitar um valor ao usuário e verificar se esse valor existe no vetor. Se existir exibir a posição em que ele está, senão exibir uma mensagem de valor não encontrado 
        int valor = 0;
        int encontrado = 0;
        System.out.print("Digite um valor para averiguar sua existência: ");
        valor = s.nextInt();

        for(int i = 0; i < vetor.length; i++){
            if(vetor[i] == valor){
                System.out.println("Valor encontrado na posição: " + i);
                encontrado++;
            }
        }
        if(encontrado == 0){
            System.out.println("Valor não encontrado!");
        }

        // n) Verificar se o vetor está em ordem crescente, ou seja, se a[0] <= a[1] <= a[2] <= ... para todos elementos do vetor 
        int cont = 0;
        for(int i = 1; i < vetor.length; i++){
            if(vetor[i-1] <= vetor[i]){
                cont++;
            }
        }
        if(cont == vetor.length - 1){
            System.out.println("Sim, o vetor está em ordem crescente!");
        }
        else{
            System.out.println("O vetor não está em ordem crescente!");
        }

        s.close();
    }
    
}