package modelo;

import java.math.BigDecimal;

public class Caminhao extends Veiculo {
    private final double capacidadeCarga;
    private final double alturaMaxima;
    private final double comprimento;

    public Caminhao(int ano, Cor cor, double peso, double velocidadeMax, BigDecimal precoVenda, double capacidadeCarga, double alturaMaxima, double comprimento) {
        super(ano, cor, peso, velocidadeMax, precoVenda);
        if(alturaMaxima > 0){
            this.alturaMaxima = alturaMaxima;
        } else {
            System.out.println("Altura inválida, iniciando com zero.");
            this.alturaMaxima = 0.0;
        }

        if(capacidadeCarga > 0){
            this.capacidadeCarga = capacidadeCarga;
        } else {
            System.out.println("Capacidade de carga inválida, iniciando com zero.");
            this.capacidadeCarga = 0.0;
        }

        if(comprimento > 0){
            this.comprimento = comprimento;
        } else {
            System.out.println("Comprimento inválido, iniciando com zero.");
            this.comprimento = 0.0;
        }
    }

    @Override
    public void imprimirDados() {
        System.out.println("\n\n======Caminhão======");
        System.out.println("Ano: " + super.getAno());        
        System.out.println("Cor: " + super.getCor());
        System.out.println("Peso: " + super.getPeso());
        System.out.println("Valocidade máxima: " + super.getVelocidadeMax() + "km/h");
        System.out.println("Preço de venda: " + super.getPrecoVenda());
        System.out.println("Capacidade máxima de carga: " + capacidadeCarga + "kg");
        System.out.println("Altura máxima: " + alturaMaxima + "cm");
        System.out.println("Comprimento: " + comprimento + "cm");
    }
    
}
