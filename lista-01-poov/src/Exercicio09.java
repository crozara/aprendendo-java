//Resolução feita usando apenas o conteúdo visto POOV até aqui (tudo direto no main, sem funções).
// As matrizes foram tratadas com tamanho fixo 3x3 como solicitado no exercício.
// A operação mais pesada aqui é a multiplicação de matrizes, que daria O(n^3).

import java.util.Random;

public class Exercicio09 {
    public static void main(String[] args) {

        //a) Criação de 5 matrizes [3][3];
        int[][] matriz1 = new int[3][3];
        int[][] matriz2 = new int[3][3];
        int[][] matriz3 = new int[3][3];
        int[][] matriz4 = new int[3][3];
        int[][] matriz5 = new int[3][3];

        //b) Preencher as 02 primeiras matrizes com valores aleátorios entre 1 e 10.

        Random random = new Random();

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                matriz1[i][j] = random.nextInt(1,11);
                matriz2[i][j] = random.nextInt(1,11 );
            }
        }

        //c) mostrar a 1° matriz.
        System.out.println("Mostrando a matriz 1 gerada com números randômicos:\n");

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.printf("%5d", matriz1[i][j]);
            }
            System.out.println();
        }

        System.out.println("\nMostrando a matriz 2 gerada com números ramdomicos:\n");

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.printf("%5d",matriz2[i][j]);
            }
            System.out.println();
        }

        //d) Criar a matriz transposta da 1ª matriz na 3ª matriz e mostrá-la

        //Na matriz transposta as linhas viram colunas, e as colunas viram as linhas.

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                matriz3[j][i] = matriz1[i][j];
            }
        }
        
        System.out.println("\nMostrando a matriz 3 que foi gerada sendo a transposta da matriz 1:\n");

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.printf("%5d",matriz3[i][j]);
            }
            System.out.println();
        }

        //e) Achar e mostrar o maior e o menor elementos da 1ª matriz mostrando também suas posições
        int maior = matriz1[0][0];
        int menor = matriz1[0][0];
        int linhaMaior = 1; //Para salvar o indice da linha do maior
        int colunaMaior = 1; //Para salvar o indice da coluna do maior
        int linhaMenor = 1; //Para salvar o indice da linha do menor
        int colunaMenor = 1; //Para salvar o indice da coluna do menor

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(matriz1[i][j] > maior){
                    maior = matriz1[i][j];
                    linhaMaior = i + 1;
                    colunaMaior = j + 1; 
                }
                if(matriz1[i][j] < menor){
                    menor = matriz1[i][j];
                    linhaMenor = i + 1;
                    colunaMenor = j + 1;
                }
            }
        }

        System.out.println("\nNa matriz 1, o maior número é: " + maior + " na posição [" + linhaMaior + "][" + colunaMaior +"]");
        System.out.println("Na matriz 1, o menor número é: " + menor + " na posição [" + linhaMenor + "][" + colunaMenor +"]");

       //f) Calcular e mostrar o determinante da 1ª matriz
        int[][] matrizaux = new int[3][5];
        int somaPrincipal = 0;
        int somaSecundaria = 0;

        //Laço para transportar a matriz
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                matrizaux[i][j] = matriz1[i][j];
            }
        }
        
        //Laço para duplicas as duas primeiras colunas
        for(int i = 0; i < 3; i++){
            for(int j = 3; j < 5; j++){
                matrizaux[i][j] = matriz1[i][j-3];
            }
        }

        //Os passos acima poderia ser feito com apenas um for, utilizando o operador de resto (coluna seria %3)
        for(int i = 0; i < 3; i++){
            somaPrincipal += matrizaux[0][i] * matrizaux[1][i+1] * matrizaux[2][i+2];
            somaSecundaria += matrizaux[0][i + 2] * matrizaux[1][i + 1] * matrizaux[2][i];
        }

        System.out.println("\nDeterminante da matriz 1: " + (somaPrincipal-somaSecundaria));

        //g) Somar as 2 primeiras matrizes na 4ª matriz e mostrá-la

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                matriz4[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
        
        System.out.println("\nMostrando a matriz 4 (soma da matriz 1 com a matriz 2) : \n");

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.printf("%5d",matriz4[i][j]);
            }
            System.out.println();
        }

        //h) Multiplicar as 2 primeiras matrizes na 5ª matriz e mostrá-la

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                for(int k = 0; k < 3; k++){
                    matriz5[i][j] += matriz1[i][k] * matriz2[k][j];
                }
            }
        }

        System.out.println("\nMatriz 5 (Matriz 1 x Matriz 2):\n");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("%5d", matriz5[i][j]);
            }
            System.out.println();
        }

    }
}
