package modelo;

//5-Escreva uma classe chamada BombaDeGasolina para ser usada como modelo para uma bomba em um posto de gasolina.
//Abaixo, há uma lista d­e coisas que se espera que uma bomba de gasolina faça.

public class BombaDeGasolina {
    //a) Apresentação da quantidade fornecida
    private double qtde_fornecida;
    //b) Apresentação do preço relativo à quantidade fornecida­
    private double preco_qtde;
    //c) Apresentação do custo por litro
    private double custo_litro;

    //d) Antes de ser usada, a bomba de gasolina deve zerar a quantidade fornecida e o preço relativo
    private void zerar(){
        qtde_fornecida = 0;
        preco_qtde = 0;
    }
    
    public BombaDeGasolina(){
        zerar();
    }
    
    //e) Crie um método que recebe a quantidade de litros a ser fornecida, “forneça” essa quantidade e mostre o total a pagar
    public void abastecerGasolinaLitro(double qtde_fornecida){
        zerar();
        this.qtde_fornecida = qtde_fornecida;
        this.preco_qtde = this.qtde_fornecida * custo_litro;
        System.out.println("Total a pagar: R$" +  preco_qtde);
    }

    //f) Crie um método que recebe o valor em dinheiro a ser abastecido, “forneça” essa quantidade e mostre a quantidade de litros fornecida
    public void abastecerGasolinaDinheiro(double valor){
        zerar();
        this.qtde_fornecida = valor / this.custo_litro;
        this.preco_qtde = valor;
        System.out.println("Quantidade abastecida: " + qtde_fornecida);
    }

    public void mostrarDados(){
        System.out.println("Quantidade fornecida: " + qtde_fornecida);
        System.out.println("Preço total: R$" + preco_qtde);
        System.out.println("Custo por litro: R$" + custo_litro);
        System.out.println();
    }
    public double getCusto_litro() {
        return custo_litro;
    }

    public void setCusto_litro(double custo_litro) {
        this.custo_litro = custo_litro;
    }
}
