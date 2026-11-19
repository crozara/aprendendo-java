package modelo.ex02_auditoria_mec;

import java.util.ArrayList;
import java.util.List;

public class Professor02 {
    private final String nome;
    private final String disciplina;
    private final List<Aluno02> alunos = new ArrayList<Aluno02>();

    public Professor02(String nome, String disciplina) {
        this.nome = nome;
        this.disciplina = disciplina;
    }

    public void inserirAluno(Aluno02 aluno){
        if(!alunos.contains(aluno)){
            alunos.add(aluno);
            aluno.adicionarProfessor(this);
        }
    }

    public void fichaDocente(){
        System.out.println("==================");
        System.out.println("Ficha Docente");
        System.out.println("Nome: " + nome + "\tDisciplina: " + disciplina);
        System.out.println("Alunos: ");
        for (Aluno02 aluno : alunos) {
            System.out.println(aluno);
        }
        System.out.println("==================\n");
    }

    @Override 
    public String toString() {
        String mensagem = "Professor: " + nome + "\tEspecialidade: " + disciplina;
        return mensagem;
    }

    public String getNome() {
        return nome;
    }

    public String getDisciplina() {
        return disciplina;
    }    
}
