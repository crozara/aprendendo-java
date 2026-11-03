package modelo.ex03_frota;

import java.math.BigDecimal;

public abstract class Veiculo {
    //ano, o modelo, a cor, o peso estrutural em quilos, a velocidade máxima em km/h e o preço de venda.
    private final int ano;
    private final Cor cor;
    private final double peso;
    private final double velocidadeMax;
    private BigDecimal precoVenda;

    public Veiculo(int ano, Cor cor, double peso, double velocidadeMax, BigDecimal precoVenda) {
        this.ano = ano;
        this.cor = cor;
        this.peso = peso;
        this.velocidadeMax = velocidadeMax;
        this.precoVenda = precoVenda;
    }

    public abstract void imprimirDados();
    
    public int getAno() {
        return ano;
    }

    public Cor getCor() {
        return cor;
    }

    public double getPeso() {
        return peso;
    }

    public double getVelocidadeMax() {
        return velocidadeMax;
    }

    public BigDecimal getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(BigDecimal precoVenda) {
        this.precoVenda = precoVenda;
    }
}
