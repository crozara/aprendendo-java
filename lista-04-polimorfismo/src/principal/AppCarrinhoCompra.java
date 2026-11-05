package principal;
import java.math.BigDecimal;

import modelo.ex03_carrinho_compra.*;

public class AppCarrinhoCompra {
    public static void main(String[] args) {
        Carrinho carrinho = new  Carrinho();

        Mouse mouse = new Mouse("Loja 1",BigDecimal.valueOf(150), "Saída USB");
        Mouse mouse2 = new Mouse("Loja 2",BigDecimal.valueOf(250), "1600 dpi");
        Livro livro = new Livro("Loja 1", BigDecimal.valueOf(69.90), "Kauê Crozara");
        Livro livro2 = new Livro("Loja 3", BigDecimal.valueOf(49.90), "Miguel Crozara");

        carrinho.adicionarProduto(mouse);
        carrinho.adicionarProduto(mouse2);
        carrinho.adicionarProduto(livro);
        carrinho.adicionarProduto(livro2);

        carrinho.listarProduto();
    }
}
