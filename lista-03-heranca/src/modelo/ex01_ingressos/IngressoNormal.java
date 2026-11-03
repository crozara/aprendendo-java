package modelo.ex01_ingressos;

import java.math.BigDecimal;

public class IngressoNormal {
    final String nome;
    final String setor;
    final BigDecimal valorBase;

    public IngressoNormal(String nome, String setor, BigDecimal valorBase){
        this.nome = nome;
        this.setor = setor;
        this.valorBase = valorBase;
    }
    
    public BigDecimal calcularPrecoFinal(){
        return valorBase;
    }

    public void impressaoTickect(){
        System.out.println("Nome do evento: " + nome);
        System.out.println("Setor do evento: " + setor);
        System.out.println("Valor final: " + calcularPrecoFinal());
    }

    public String getNome() {
        return nome;
    }

    public String getSetor() {
        return setor;
    }

    public BigDecimal getValorBase() {
        return valorBase;
    }
}
