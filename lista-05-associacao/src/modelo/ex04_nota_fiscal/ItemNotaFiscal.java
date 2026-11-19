package modelo.ex04_nota_fiscal;

import java.math.BigDecimal;

public class ItemNotaFiscal {
    private final String descricao;
    private final int quantidade;
    private final BigDecimal valorUnitario;

    public ItemNotaFiscal(String descricao, int quantidade, BigDecimal valorUnitario) {
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.valorUnitario = valorUnitario;
    }

    public BigDecimal calcularSubtotal() {
        return valorUnitario.multiply(BigDecimal.valueOf(quantidade));
    }

    @Override
    public String toString() {
        return descricao + " | Qtd: " + quantidade + " | Unit: R$ " + valorUnitario + " | Subtotal: R$ " + calcularSubtotal();
    }

    public String getDescricao() {
        return descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public BigDecimal getValorUnitario() {
        return valorUnitario;
    }
}