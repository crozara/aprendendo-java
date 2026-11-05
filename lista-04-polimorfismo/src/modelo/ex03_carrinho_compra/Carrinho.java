package modelo.ex03_carrinho_compra;

import java.util.LinkedList;
import java.util.List;

public class Carrinho {
    List<Produto> carrinho = new LinkedList<Produto>(); 

    public void adicionarProduto(Produto p){
        carrinho.add(p);
    }

    public void listarProduto(){
        System.out.println("Imprimindo produtos do carrinho: ");
        for(Produto produto : carrinho){
            System.out.println("Descrição: " + produto.obterDescricao());
            System.out.println("Preço: R$" + produto.getPrecoVenda());
            System.out.println("Loja: " + produto.getLojaParceira());
            System.out.println();
        }
    }
}
