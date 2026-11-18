package modelo;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private final String nome;
    private final String curso;
    private final List<Professor> professores = new ArrayList<Professor>();

    public Aluno(String nome, String curso) {
        this.nome = nome;
        this.curso = curso;
    }

    public void fichaAluno(){
        System.out.println("==================");
        System.out.println("Ficha Aluno");
        System.out.println("Nome: " + nome + "\tCurso: " + curso);
        System.out.println("Professores: ");
        for (Professor professor : professores) {
            System.out.println(professor);
        }
        System.out.println("==================\n");
    }

    public void adicionarProfessor(Professor professor){
        if(!professores.contains(professor)){
            professores.add(professor);
        }
    }

    @Override
    public String toString() {
        String mensagem = "Nome: " + nome + "\tCurso: " + curso;
        return mensagem;
    }

    public String getNome() {
        return nome;
    }

    public String getCurso() {
        return curso;
    }
}
