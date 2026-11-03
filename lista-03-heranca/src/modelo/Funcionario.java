package modelo;

public abstract class Funcionario {
    private final String nome;
    private final int INSS;

    public Funcionario(String nome, int INSS) {
        this.nome = nome;
        this.INSS = INSS;
    }

    public abstract void emitirContracheque();

    public String getNome() {
        return nome;
    }

    public int getINSS() {
        return INSS;
    }
}
