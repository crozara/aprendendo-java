package modelo.ex03_carrinho_compra;

import java.math.BigDecimal;

public class Livro extends Produto{
    private final String autor;

    public Livro(String lojaParceira, BigDecimal precoVenda, String autor) {
        super(lojaParceira, precoVenda);
        this.autor = autor;
    }    

    @Override
    public String obterDescricao() {
        return super.obterDescricao() + " - Livro\n" + "autor: " + autor;
    }

    public String getAutor() {
        return autor;
    }
}
