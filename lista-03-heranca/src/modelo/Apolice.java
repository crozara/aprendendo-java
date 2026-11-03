package modelo;

import java.math.BigDecimal;
import java.util.ArrayList;

public abstract class Apolice {
    private final Pessoa pessoa;
    private final int numRegistro;
    private final BigDecimal valorMensal;
    private ArrayList<Pessoa> dependentes;

    public Apolice(Pessoa pessoa, int numRegistro, BigDecimal valorMensal, ArrayList<Pessoa> dependentes) {
        this.pessoa = pessoa;
        this.numRegistro = numRegistro;
        this.valorMensal = valorMensal;
        this.dependentes = dependentes;
    }

    public abstract void adicionarDependentes(Pessoa pessoa);
    public abstract BigDecimal valorMensalidade();

    public Pessoa getPessoa() {
        return pessoa;
    }
    public int getNumRegistro() {
        return numRegistro;
    }
    public BigDecimal getValorMensal() {
        return valorMensal;
    }
    public ArrayList<Pessoa> getDependentes() {
        return dependentes;
    }

    

}
