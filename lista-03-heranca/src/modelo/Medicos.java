package modelo;

import java.math.BigDecimal;

public class Medicos extends FuncionarioMensalista {
    private final String especialidade;
    private BigDecimal valorConsultaParticular;

    public Medicos(String nome, int INSS, BigDecimal salarioBase, String especalidade, BigDecimal valorConsultaParticular) {
        super(nome, INSS, salarioBase);
        this.especialidade = especalidade;
        this.valorConsultaParticular = valorConsultaParticular;
    }

    

    public String getEspecialidade() {
        return especialidade;
    }

    public BigDecimal getValorConsultaParticular() {
        return valorConsultaParticular;
    }

    public void setValorConsultaParticular(BigDecimal valorConsultaParticular) {
        this.valorConsultaParticular = valorConsultaParticular;
    }

    
    
}
