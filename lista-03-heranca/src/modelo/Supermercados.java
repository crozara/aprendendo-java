package modelo;

import java.math.BigDecimal;

public class Supermercados extends EstabelecimentoComercial{
    private static final BigDecimal TAXA_PADRAO = new BigDecimal(15.00);
    private static final BigDecimal TAXA_GRANDE_PORTE = new BigDecimal(8.00);

    private final int quantidadeCaixasAtendimento;

    public Supermercados(String nome, String CNPJ, String cidade, String estado, String cep, int telefone, int quantidadeCaixasAtendimento) {
        super(nome, CNPJ, cidade, estado, cep, telefone);
        this.quantidadeCaixasAtendimento = quantidadeCaixasAtendimento;
    }

    @Override
    public BigDecimal calcularTaxaBase() {
        if(this.quantidadeCaixasAtendimento > 10){
            return TAXA_GRANDE_PORTE;
        } else return TAXA_PADRAO;
    }
    
    @Override
    public void imprimirDados() {
        System.out.println("\n===Supermercado===");
        super.imprimirDados();
        System.out.println("Quantidade de caixas: " + quantidadeCaixasAtendimento);
        System.out.println("Taxa base de entrega: R$" + calcularTaxaBase());
    }
}
