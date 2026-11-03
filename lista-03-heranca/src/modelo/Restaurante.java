package modelo;

import java.math.BigDecimal;

public class Restaurante extends EstabelecimentoComercial{
    private static final BigDecimal VALOR_FIXO = new BigDecimal(5.00);

    private final CategoriaCulinaria categoria;
    private final BigDecimal precoMedio;

    public Restaurante(String nome, String CNPJ, String cidade, String estado, String cep, int telefone, CategoriaCulinaria categoria, BigDecimal precoMedio) {
        super(nome, CNPJ, cidade, estado, cep, telefone);
        this.categoria = categoria;
        this.precoMedio = precoMedio;
    }

    @Override
    public BigDecimal calcularTaxaBase() {
        return VALOR_FIXO.add((precoMedio.multiply(BigDecimal.valueOf(0.10))));
    }

    @Override
    public  void imprimirDados() {
        System.out.println("\n===Restaurante===");
        super.imprimirDados();
        System.out.println("Categoria: " + categoria);
        System.out.println("Preço Médio: R$" + precoMedio);
        System.out.println("Taxa base de entrega: R$" + calcularTaxaBase());
    }

    public static BigDecimal getValorFixo() {
        return VALOR_FIXO;
    }

    public CategoriaCulinaria getCategoria() {
        return categoria;
    }

    public BigDecimal getPrecoMedio() {
        return precoMedio;
    }
}
