import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Exercicio10 {
    public static void main(String[] args) throws Exception {

        //10) ArrayList 
        //a) Criar um ArrayList de inteiros 
        ArrayList<Integer> numeros = new ArrayList<>(10);


        //b) Inserir 10 valores digitados pelo usuário no ArrayList 
        Scanner s = new Scanner(System.in);
        for(int i = 0; i < 10; i++){
            System.out.print("Digite um valor: ");
            numeros.add(s.nextInt());
            System.out.println("Adicionado :" + numeros.get(i));
        }

        //c) Inserir 10 valores aleatórios entre 1 e 100 no ArrayList 
        System.out.println("\nInserindo 10 números aleatórios..");
        Random r = new Random();
        for(int i = 0; i < 10; i++){
                numeros.add(r.nextInt(1, 101));
        }

        //d) Mostrar o ArrayList inteiro na tela
        System.out.println("\nArrayList inteiro: ");
        for(int i = 0; i < numeros.size(); i++){
            System.out.print(" " + numeros.get(i));
        } 

        //e) Mostrar o ArrayList de trás para frente na tela 
        System.out.println("\n\nMostrando o ArrayList de trás para frente:");
        for(int i = (numeros.size() - 1) ; i >= 0; i--){
            System.out.printf("%d ", numeros.get(i));
        }

        //f) Calcular e mostrar a média dos valores do ArrayList 
        double ans = 0.0;
        for(int i = 0; i < numeros.size(); i++){
            ans += numeros.get(i);
        }
        System.out.println("\n\nValor da média entre os vetores: " + ans/numeros.size());

        //g) Encontrar e mostrar o maior e o menor valores do ArrayList 
        int maior, menor;
        maior = menor = numeros.get(0);
        for(int i = 0; i < numeros.size(); i++){
            if(numeros.get(i) > maior){
                maior = numeros.get(i);
            }
            else if(numeros.get(i) < menor){
                menor = numeros.get(i);
            }
        }
        System.out.println("\nO maior número do ArrayList é: " + maior);
        System.out.println("O menor número do ArrayList é: " + menor);
    
        //h) Mostrar os valores das posições pares do ArrayList 
        System.out.println("\nMostrando os valores das posições pares: ");
        for(int i = 0; i < numeros.size(); i+= 2){
            System.out.print(" " + numeros.get(i));
        }
        //i) Mostrar os valores das posições ímpares do ArrayList 
        System.out.println("\n\nMostrando os valores das posições ímpares: ");
        for(int i = 1; i < numeros.size(); i+= 2){
            System.out.print(" " + numeros.get(i));
        }
        //j) Mostrar os valores pares do ArrayList 
        System.out.println("\n\nMostrando os valores pares: ");
        for(int i = 0; i < numeros.size(); i++){
            if(numeros.get(i) % 2 == 0){
                System.out.print(" " + numeros.get(i));
            }
        }
        //k) Mostrar os valores ímpares do ArrayList
        System.out.println("\n\nMostrando os valores ímpares: ");
        for(int i = 0; i < numeros.size(); i++){
            if(numeros.get(i) % 2 != 0){
                System.out.print(" " + numeros.get(i));
            }
        }

        //l)Verificar se há elementos repetidos no ArrayList e exibir uma mensagem em caso afirmativo 
        int repetido = 0;
        for(int i = 0; i < numeros.size(); i++){
            for(int j = i + 1; j < numeros.size(); j++){
                if(numeros.get(i).equals(numeros.get(j))){
                    repetido = 1;
                    break;        
                }
            }    
        }
        if(repetido == 1){
            System.out.println("\n\nExistem elementos repetidos no ArrayList!");
        }

        //m) Solicitar um valor ao usuário e verificar se esse valor existe no ArrayList. Se existir exibir a posição em que ele está, senão exibir uma mensagem de valor não encontrado 
        System.out.println("\nEscolha um número para averiguar sua existência: ");
        boolean resposta = false;
        int escolhido = s.nextInt();
        for(int i = 0; i < numeros.size(); i++){
            if(numeros.get(i).equals(escolhido)){
                System.out.println("O número existe na posição: " + i);
                resposta = true;
            }
        }
        if(!resposta){
            System.out.println("O número não existe no ArrayList!");
        }
        //n) Verificar se o ArrayList está em ordem crescente, ou seja, se a[0] <= a[1] <= a[2] <= ... para todos elementos do ArrayList
        int cont = 0;
        for(int i = 1; i < numeros.size(); i++){
            if(numeros.get(i) >= numeros.get(i - 1)){
                cont++;
            }
        }
        if(cont == numeros.size() - 1){
            System.out.println("O ArrayList está em ordem crescente!");
        }
        else{
            System.out.println("O ArrayList NÃO está em ordem crescente!");
        }




        s.close();
    }
}
