package modelo.ex04_folha_pagamento;

import java.math.BigDecimal;

public class EmpregadoMensalista extends Empregado{
    private final BigDecimal salarioMensal;

    public EmpregadoMensalista(String nome, int iNSS, BigDecimal salarioMensal) {
        super(nome, iNSS);
        this.salarioMensal = salarioMensal;
    }

    @Override
    public BigDecimal calculoPagamento() {
        return salarioMensal;
    }

    public BigDecimal getSalarioMensal() {
        return salarioMensal;
    }
}
