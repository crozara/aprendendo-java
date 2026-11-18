package ex01_lotacao_academica.modelo;

import java.util.ArrayList;
import java.util.List;

public class Professor {
    private final String nome;
    private final String disciplina;
    private List<Aluno> alunos = new ArrayList<Aluno>();

    public Professor(String nome, String disciplina) {
        this.nome = nome;
        this.disciplina = disciplina;
    }

    public void matricular(Aluno aluno){
        alunos.add(aluno);
    }

    public void fichaDocente(){
        System.out.println("================");
        System.out.println("Professor: " + nome);
        System.out.println("Disciplina: " + disciplina);
        System.out.println("Alunos: ");
        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }
        System.out.println("================\n");
    }

    public boolean buscaAluno(Aluno busca){
        for (Aluno aluno : alunos) {
            if(aluno.equals(busca)){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        String impressao = "Nome: " + nome + "\nDisciplina: " + disciplina;
        return impressao;
    }

    public String getNome() {
        return nome;
    }

    public String getDisciplina() {
        return disciplina;
    }
}
