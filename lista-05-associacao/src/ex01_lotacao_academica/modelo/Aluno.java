package ex01_lotacao_academica.modelo;

public class Aluno {
    private final String nome;
    private final String curso;

    public Aluno(String nome, String curso) {
        this.nome = nome;
        this.curso = curso;
    }

    @Override
    public String toString() {
        String impressao = "Aluno: " + nome + "\tCurso: " + curso;
        return impressao;
    }

    public String getNome() {
        return nome;
    }

    public String getCurso() {
        return curso;
    }

    

    
}
