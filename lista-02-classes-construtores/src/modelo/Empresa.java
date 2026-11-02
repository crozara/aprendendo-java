package modelo;

public class Empresa {
    //9-Crie uma classe Empresa capaz de armazenar os dados de uma empresa (nome, end, cidade, estado, cep e telefone). 
    // Inclua um construtor sem argumentos e um que receba os dados como argumentos e os inicialize. 
    // Escreva dois métodos, um para setar os dados de uma empresa, e outro para mostrar os dados.

    private String nome;
    private String endereco;
    private String cidade;
    private String estado;
    private String cep;
    private int telefone;

    public Empresa(){
        nome = "";
        endereco = "";
        cidade = "";
        estado = "";
        cep = "";
        telefone = 0;
    }

    public Empresa(String nome, String endereco, String cidade, String estado, String cep, int telefone)
    {
        this.nome = nome;
        this.endereco = endereco;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.telefone = telefone;
    }

    public void mostrarDados(){
        System.out.println("\n\n======Dados da Empresa======");
        System.out.println("Empresa: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("Cidade: " + cidade);
        System.out.println("Estado: " + estado);
        System.out.println("Cep: " + cep);
        System.out.println("Telefone: " + telefone);
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    
}
