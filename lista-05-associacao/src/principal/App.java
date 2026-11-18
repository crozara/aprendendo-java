package principal;

import java.util.ArrayList;
import java.util.List;

import modelo.Aluno;
import modelo.Professor;

public class App {
    public static void main(String[] args) throws Exception {
        List<Professor> professores = new ArrayList<Professor>();
        List<Aluno> alunos =  new ArrayList<Aluno>();

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

        p3.matricular(a1);
        p1.matricular(a2);
        p1.matricular(a3);
        p2.matricular(a4);
        p2.matricular(a5);
        p2.matricular(a1);

        p1.fichaDocente();
        p2.fichaDocente();
        p3.fichaDocente();

        System.out.println("Professores que dão aula para o aluno procurado: ");
        int cont = 0;
        for (Professor professor : professores) {
            if(professor.buscaAluno(a1) == true){
                System.out.println(professor);
                cont++;
            };
        }
        if(cont == 0){
            System.out.println("Infelizmente esse aluno não possui professores ainda.");
        }
    }
}
