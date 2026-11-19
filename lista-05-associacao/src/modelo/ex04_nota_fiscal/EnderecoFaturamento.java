package modelo.ex04_nota_fiscal;

public class EnderecoFaturamento {
    private String rua;
    private int numeroCasa;
    private String cidade;

    public EnderecoFaturamento(String rua, int numeroCasa, String cidade) {
        this.rua = rua;
        this.numeroCasa = numeroCasa;
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        return rua + ", nº " + numeroCasa + " - " + cidade;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumeroCasa() {
        return numeroCasa;
    }

    public void setNumeroCasa(int numeroCasa) {
        this.numeroCasa = numeroCasa;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
}