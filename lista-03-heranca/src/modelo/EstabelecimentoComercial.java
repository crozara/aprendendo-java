package modelo;
import java.math.BigDecimal;

public abstract class EstabelecimentoComercial {
    private final String nome;
    private final String CNPJ;
    private final String cidade;
    private final String estado;
    private final String cep;
    private final int telefone;

    public EstabelecimentoComercial(String nome, String CNPJ, String cidade, String estado, String cep, int telefone){
        this.nome = nome;
        this.CNPJ = CNPJ;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.telefone = telefone;
    }

    public abstract BigDecimal calcularTaxaBase();

    public void imprimirDados(){
        System.out.println("Nome: " + nome);
        System.out.println("CNPJ: " + CNPJ);
        System.out.println("Cidade: " + cidade);
        System.out.println("Estado: " + estado);
        System.out.println("CEP: " + cep);
        System.out.println("Telefone: " + telefone);
    };

    public String getNome() {
        return nome;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }

    public String getCep() {
        return cep;
    }

    public int getTelefone() {
        return telefone;
    }
}
