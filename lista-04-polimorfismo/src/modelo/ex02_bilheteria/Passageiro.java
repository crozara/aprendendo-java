package modelo.ex02_bilheteria;

import java.math.BigDecimal;

public abstract class Passageiro {
    private final String nome;
    
    public Passageiro(String nome){
        this.nome = nome;
    }

    public abstract BigDecimal calcularTarifa(BigDecimal tarifaBase);

    public String getNome() {
        return nome;
    }

}
