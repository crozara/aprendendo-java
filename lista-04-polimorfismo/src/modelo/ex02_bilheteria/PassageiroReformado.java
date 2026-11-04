package modelo.ex02_bilheteria;

import java.math.BigDecimal;

public class PassageiroReformado extends Passageiro{
    private final int numeroCidadao;

    public PassageiroReformado(String nome, int numeroCidadao) {
        super(nome);
        this.numeroCidadao = numeroCidadao;
    }

    @Override
    public BigDecimal calcularTarifa(BigDecimal tarifaBase) {
        return BigDecimal.ZERO;
    }

    public int getNumeroCidadao() {
        return numeroCidadao;
    }
}
