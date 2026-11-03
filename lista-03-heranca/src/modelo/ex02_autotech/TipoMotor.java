package modelo.ex02_autotech;

import java.math.BigDecimal;

public enum TipoMotor {
    ALCOOL(new BigDecimal("78000.00")),
    GASOLINA(new BigDecimal("80000.00")),
    FLEX(new BigDecimal("82000.00")),
    GAS(new BigDecimal("85000.00")),
    DIESEL(new BigDecimal("120000.00")),
    HIBRIDO(new BigDecimal("150000.00")),
    ELETRICO(new BigDecimal("180000.00"));

    private final BigDecimal preco;

    TipoMotor(BigDecimal preco) {
        this.preco = preco;
    }

    public BigDecimal getPreco() {
        return preco;
    }
    
}
