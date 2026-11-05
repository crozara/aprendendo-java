package modelo.ex03_carrinho_compra;

import java.math.BigDecimal;

public abstract class Produto {
    private final String lojaParceira;
    private final BigDecimal precoVenda;
    
    public Produto(String lojaParceira, BigDecimal precoVenda){
        this.lojaParceira = lojaParceira;
        this.precoVenda = precoVenda;
    }

    public String obterDescricao(){
        return "Produto de informática";
    }
    
    public BigDecimal getPrecoVenda() {
        return precoVenda;
    }

    public String getLojaParceira() {
        return lojaParceira;
    }
}
