package principal;

import java.util.ArrayList;
import java.util.List;

import modelo.Professor;
import modelo.Aluno;


public class App {
    public static void main(String[] args) throws Exception {
        List<Aluno> alunos = new ArrayList<Aluno>();
        List<Professor> professores = new ArrayList<Professor>();

        Professor p1 = new Professor("João", "Física I");
        Professor p2 = new Professor("Kauê", "Calculo IV");
        Professor p3 = new Professor("Grosbilda", "Peixaria");

        professores.add(p1);
        professores.add(p2);
        professores.add(p3);

        Aluno a1 = new Aluno("Gabriel", "Pescaria");
        Aluno a2 = new Aluno("Julia", "Eng comp");
        Aluno a3 = new Aluno("Douglas", "Eng comp");
        Aluno a4 = new Aluno("José", "Eng comp");
        Aluno a5 = new Aluno("Renant", "Eng comp");

        alunos.add(a1);
        alunos.add(a2); 
        alunos.add(a3);
        alunos.add(a4);
        alunos.add(a5);

        p1.inserirAluno(a5);
        p1.inserirAluno(a4);
        p2.inserirAluno(a3);
        p3.inserirAluno(a5);
        p3.inserirAluno(a2);
        p3.inserirAluno(a1);

        for (Professor professor : professores) {
            professor.fichaDocente();
        }

        for (Aluno aluno : alunos) {
            aluno.fichaAluno();
        }
    }
}
