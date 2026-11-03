package modelo;

import java.math.BigDecimal;
import java.util.ArrayList;

public class ApoliceApartamento extends Apolice {

    public ApoliceApartamento(Pessoa pessoa, int numRegistro, BigDecimal valorMensal, ArrayList<Pessoa> dependentes) {
        super(pessoa, numRegistro, valorMensal, dependentes);
    }

    @Override
    public void adicionarDependentes(Pessoa pessoa) {
        getDependentes().add(pessoa);
    }

    @Override
    public BigDecimal valorMensalidade() {
        BigDecimal valorTotal = super.getValorMensal();
        BigDecimal taxaPorDependente = super.getValorMensal().multiply(BigDecimal.valueOf(0.15));

        for (int i = 0; i < getDependentes().size(); i++) {
            valorTotal = valorTotal.add(taxaPorDependente);
        }
        return valorTotal;
    }
}
