package modelo;

import java.math.BigDecimal;
import java.util.ArrayList;

public class ApoliceEnfermaria extends Apolice{
    
    public ApoliceEnfermaria(Pessoa pessoa, int numRegistro, BigDecimal valorMensal, ArrayList<Pessoa> dependentes) {
        super(pessoa, numRegistro, valorMensal, dependentes);
    }

    @Override
    public void adicionarDependentes(Pessoa pessoa) {
        if(getDependentes().size() >= 3){
            System.out.println("Não é possível adicionar, limite atingido!");
        } else {
            super.getDependentes().add(pessoa);
        }
    }

    @Override
    public BigDecimal valorMensalidade() {
        return super.getValorMensal();
    }
    
}
