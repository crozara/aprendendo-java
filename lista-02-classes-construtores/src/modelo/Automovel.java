package modelo;

// 2-Suponha que seu programa contenha a seguinte definição de classe:

public class Automovel  {
	private double preco;
	private double rendimento;
	
    //Não faz parte do exercicio, apenas gerado para retirar o aviso.
	public double getRendimento() {
		return rendimento;
	}

    //Versão original do exercicio:
    //private double getRendimento() {
	//	return rendimento;
	//}
	
	public void setPreco (double novoPreco){
		this.preco = novoPreco;
	}
	
	public void setRendimento (double novoRendimento) {
		this.rendimento = novoRendimento;
	}

	public double getPreco() {
		return preco;
	}
}