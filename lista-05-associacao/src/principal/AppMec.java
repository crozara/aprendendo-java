package principal;

import java.util.ArrayList;
import java.util.List;

import modelo.ex02_auditoria_mec.Aluno02;
import modelo.ex02_auditoria_mec.Professor02;


public class AppMec {
    public static void main(String[] args) throws Exception {
        List<Aluno02> alunos = new ArrayList<Aluno02>();
        List<Professor02> professores = new ArrayList<Professor02>();

        Professor02 p1 = new Professor02("João", "Física I");
        Professor02 p2 = new Professor02("Kauê", "Calculo IV");
        Professor02 p3 = new Professor02("Grosbilda", "Peixaria");

        professores.add(p1);
        professores.add(p2);
        professores.add(p3);

        Aluno02 a1 = new Aluno02("Gabriel", "Pescaria");
        Aluno02 a2 = new Aluno02("Julia", "Eng comp");
        Aluno02 a3 = new Aluno02("Douglas", "Eng comp");
        Aluno02 a4 = new Aluno02("José", "Eng comp");
        Aluno02 a5 = new Aluno02("Renant", "Eng comp");

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

        for (Professor02 professor : professores) {
            professor.fichaDocente();
        }

        for (Aluno02 aluno : alunos) {
            aluno.fichaAluno();
        }
    }
}
