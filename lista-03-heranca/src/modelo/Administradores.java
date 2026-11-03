package modelo;

import java.math.BigDecimal;

public class Administradores extends Executivos {
   
    private final String departamento;
    private String supervisor;

    public Administradores(String nome, int INSS, BigDecimal salarioBase, String cargo, String departamento,
            String supervisor) {
        super(nome, INSS, salarioBase, cargo);
        this.departamento = departamento;
        this.supervisor = supervisor;
    }

    @Override
    public void emitirContracheque() {
        super.emitirContracheque();
        System.out.println("Departamento: " + departamento);
        System.out.println("Supervisor: " + supervisor);
    }

    public String getDepartamento() {
        return departamento;
    }

    public String getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }
}
