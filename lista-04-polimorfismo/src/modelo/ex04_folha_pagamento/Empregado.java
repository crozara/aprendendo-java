package modelo.ex04_folha_pagamento;

import java.math.BigDecimal;

public abstract class Empregado {
    private final String nome;
    private final String INSS;

    public Empregado(String nome, String iNSS) {
        this.nome = nome;
        INSS = iNSS;
    }

    public abstract BigDecimal calculoPagamento();

    public String getNome() {
        return nome;
    }

    public String getINSS() {
        return INSS;
    }
}
