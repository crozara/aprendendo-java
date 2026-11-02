package modelo;

//3-Defina uma classe para um tipo chamado TipoContador. Um objeto desse tipo é utilizado para contar coisas, 
// registrando uma contagem que é um número inteiro não negativo. Inclua um método set que fixe o contador a uma contagem dada como argumento. 
// Inclua métodos para aumentar a contagem em um e para diminuir a contagem em um. 
// Assegure-se de que nenhum método permita que o valor do contador se torne negativo. Inclua também um método que retorne o valor atual 
// da contagem e um que apresente a contagem como saída na tela. Teste sua classe em um programa.

public class TipoContador {
    private int cont;

    public TipoContador(int cont){
        this.cont = cont;
    };

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        if(cont > 0){
            this.cont = cont;
        } else{
            System.out.println("Não é possivel adicionar numero negativo!");
        }
    }

    public void aumentarContagem(){
        System.out.println("Valor aumentado com sucesso!");
        this.cont++;
    }

    public void diminuirContagem(){
        if(cont - 1 >= 0){
            System.out.println("O valor foi diminuido com sucesso!");
            this.cont--;
        } else{
            System.out.println("O contador ja está no menor valor possivel.");
        }
    }

    public void mostrarContagem(){
        System.out.println("O valor atual da contagem é: " + cont);
    }
}
