package modelo.ex04_nota_fiscal;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class NotaFiscal {
    private final int numero;
    private final String cliente;
    private final EnderecoFaturamento endereco;
    private final List<ItemNotaFiscal> itens = new ArrayList<>();

    public NotaFiscal(int numero, String cliente, String rua, int numeroCasa, String cidade) {
        this.numero = numero;
        this.cliente = cliente;
        this.endereco = new EnderecoFaturamento(rua, numeroCasa, cidade);
    }

    public void adicionarItem(String descricao, int quantidade, BigDecimal valorUnitario) {
        itens.add(new ItemNotaFiscal(descricao, quantidade, valorUnitario));
    }

    public EnderecoFaturamento getEnderecoFaturamento() {
        return new EnderecoFaturamento(
            this.endereco.getRua(),
            this.endereco.getNumeroCasa(),
            this.endereco.getCidade()
        );
    }

    public BigDecimal calcularTotal() {
        BigDecimal total = BigDecimal.ZERO;
        for (ItemNotaFiscal item : itens) {
            total = total.add(item.calcularSubtotal());
        }
        return total;
    }

    public void emitirNota() {
        System.out.println("========== NOTA FISCAL Nº " + numero + " ==========");
        System.out.println("Cliente: " + cliente);
        System.out.println("Endereço: " + endereco);
        System.out.println("--------------- ITENS ---------------");
        for (ItemNotaFiscal item : itens) {
            System.out.println(item);
        }
        System.out.println("-------------------------------------");
        System.out.println("TOTAL GERAL: R$ " + calcularTotal());
        System.out.println("=====================================\n");
    }

    public int getNumero() {
        return numero;
    }

    public String getCliente() {
        return cliente;
    }
}

/* Entendendo a diferença prática de composição e agregação:
// COMPOSIÇÃO (NotaFiscal cria o endereço)
public NotaFiscal(int numero, String cliente, String rua, int numeroCasa, String cidade) {
    this.endereco = new EnderecoFaturamento(rua, numeroCasa, cidade);
}
get retorna cópia defensiva (new ...) e não tem set.

// AGREGAÇÃO (NotaFiscal recebe o endereço já pronto de fora)
public NotaFiscal(int numero, String cliente, EnderecoFaturamento endereco) {
    this.endereco = endereco;
}
get retorna a referência direta e pode ter set.
*/