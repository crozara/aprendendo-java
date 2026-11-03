package modelo.ex06_sanitas;

import java.math.BigDecimal;

public abstract class FuncionarioMensalista extends Funcionario{
    private BigDecimal salarioBase;

    public FuncionarioMensalista(String nome, int INSS, BigDecimal salarioBase) {
        super(nome, INSS);
        this.salarioBase = salarioBase;
    }


    @Override
    public void emitirContracheque() {
        System.out.println(getNome());
        System.out.println("INSS: " + getINSS());
        System.out.println("Salario base: R$" + salarioBase);
    }


    public BigDecimal getSalarioBase() {
        return salarioBase;
    }
}
