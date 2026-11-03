package modelo.ex03_frota;

import java.math.BigDecimal;

public class Carro extends Veiculo{
    private final int quantidadePortas;
    private final double capacidadePortaMalas;

    public Carro(int ano, Cor cor, double peso, double velocidadeMax, BigDecimal precoVenda, int quantidadePortas, int capacidadePortaMalas) {
        super(ano, cor, peso, velocidadeMax, precoVenda);
        this.quantidadePortas = quantidadePortas;
        this.capacidadePortaMalas = capacidadePortaMalas;
    }
    
    @Override
    public void imprimirDados() {
        System.out.println("\n\n======Carro de Passeio======");
        System.out.println("Ano: " + super.getAno());        
        System.out.println("Cor: " + super.getCor());
        System.out.println("Peso: " + super.getPeso());
        System.out.println("Valocidade máxima: " + super.getVelocidadeMax() + "km/h");
        System.out.println("Preço de venda: " + super.getPrecoVenda());
        System.out.println("Quantidade de portas: " + quantidadePortas);
        System.out.println("Capacidade do Porta-Malas: " + capacidadePortaMalas + "l");
    }

}
