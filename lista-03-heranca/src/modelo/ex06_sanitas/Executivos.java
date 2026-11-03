package modelo.ex06_sanitas;

import java.math.BigDecimal;

public class Executivos extends FuncionarioMensalista{
    private final String cargo;

    public Executivos(String nome, int INSS, BigDecimal salarioBase, String cargo) {
        super(nome, INSS, salarioBase);
        this.cargo = cargo;
    }
    
    @Override
    public void emitirContracheque() {
    System.out.println(cargo + " " + getNome());
    System.out.println("INSS: " + getINSS());
    System.out.println("Salario base: R$" + getSalarioBase());
}
}
