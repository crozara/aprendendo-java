package modelo;

import java.math.BigDecimal;

public abstract class FuncionarioHorista extends Funcionario {
    private final double horasTrabalhadas;
    private final BigDecimal remuneracaoHora;

    public FuncionarioHorista(String nome, int INSS, double horasTrabalhadas, BigDecimal remuneracaoHora) {
        super(nome, INSS);
        this.horasTrabalhadas = horasTrabalhadas;
        this.remuneracaoHora = remuneracaoHora;
    }

    @Override
    public void emitirContracheque() {
        System.out.println(super.getNome());
        System.out.println("INSS: " + getINSS());
        System.out.println("Quantidade de horas trabalhadas: " + horasTrabalhadas);
        System.out.println("Remuneração por hora: R$" + remuneracaoHora);
        System.out.println("Valor remuneração: R$" + remuneracaoHora.multiply(BigDecimal.valueOf(horasTrabalhadas)));
    }

    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public BigDecimal getRemuneracaoHora() {
        return remuneracaoHora;
    }
}
