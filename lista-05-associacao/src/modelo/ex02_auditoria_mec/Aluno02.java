package modelo.ex02_auditoria_mec;

import java.util.ArrayList;
import java.util.List;

public class Aluno02 {
    private final String nome;
    private final String curso;
    private final List<Professor02> professores = new ArrayList<Professor02>();

    public Aluno02(String nome, String curso) {
        this.nome = nome;
        this.curso = curso;
    }

    public void fichaAluno(){
        System.out.println("==================");
        System.out.println("Ficha Aluno");
        System.out.println("Nome: " + nome + "\tCurso: " + curso);
        System.out.println("Professores: ");
        for (Professor02 professor : professores) {
            System.out.println(professor);
        }
        System.out.println("==================\n");
    }

    public void adicionarProfessor(Professor02 professor){
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
