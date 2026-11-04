package modelo.ex02_bilheteria;

import java.math.BigDecimal;

public class PassageiroEstudante extends Passageiro {
    private final int numeroAluno;

    public PassageiroEstudante(String nome, int numeroAluno) {
        super(nome);
        this.numeroAluno = numeroAluno;
    }

    @Override
    public BigDecimal calcularTarifa(BigDecimal tarifaBase) {
        return tarifaBase.multiply(BigDecimal.valueOf(0.5));
    }

    public int getNumeroAluno() {
        return numeroAluno;
    }
    
}
