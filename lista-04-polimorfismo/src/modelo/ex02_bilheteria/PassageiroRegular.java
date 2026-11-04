package modelo.ex02_bilheteria;

import java.math.BigDecimal;

public class PassageiroRegular extends Passageiro {

    public PassageiroRegular(String nome) {
        super(nome);
    }

    @Override
    public BigDecimal calcularTarifa(BigDecimal tarifaBase) {
        return tarifaBase;
    }
}
