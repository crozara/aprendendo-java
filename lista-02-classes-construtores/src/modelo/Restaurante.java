package modelo;

public class Restaurante {
    private String nome;
    private String endereco;
    private double precoMedio;
    private String tipoComida;

    //a) crie um construtor para inicializar os dados com zero e outro para inicializar os dados com um valor fixo (passado como argumento)
    public Restaurante(){
        this.nome = "";
        this.endereco = "";
        this.precoMedio = 0.0;
        this.tipoComida = "";
    }

    public Restaurante(String nome, String endereco, double precoMedio, String tipoComida){
        this.nome = nome;
        this.endereco = endereco;
        this.precoMedio = precoMedio;
        this.tipoComida = tipoComida;
    }

    //b) crie um método para setar os dados do restaurante
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setPrecoMedio(double precoMedio) {
        this.precoMedio = precoMedio;
    }

    public void setTipoComida(String tipoComida) {
        this.tipoComida = tipoComida;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public double getPrecoMedio() {
        return precoMedio;
    }

    public String getTipoComida() {
        return tipoComida;
    }

    //c) crie um método para imprimir os dados de um restaurante
    public void imprimirDados(){
        System.out.println("Dados do restaurante: ");
        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("Preço Médio: " + precoMedio);
        System.out.println("Tipo de comida: " + tipoComida);
    }
}
