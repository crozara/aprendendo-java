package modelo.ex04_folha_pagamento;

import java.math.BigDecimal;

public class EmpregadoHorista extends Empregado {

    private final BigDecimal taxaRemuneracao;
    private double horasTrabalhadas;

    public EmpregadoHorista(String nome, int iNSS, BigDecimal taxaRemuneracao, double horasTrabalhadas) {
        super(nome, iNSS);
        this.taxaRemuneracao = taxaRemuneracao;
        this.horasTrabalhadas = horasTrabalhadas;
    }
    
    @Override
    public BigDecimal calculoPagamento() {
        return taxaRemuneracao.multiply(BigDecimal.valueOf(horasTrabalhadas));
    }

    public BigDecimal getTaxaRemuneracao() {
        return taxaRemuneracao;
    }

    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

}
