package modelo.ex01_frota;

import java.math.BigDecimal;

public abstract class Onibus {
    private static int contadorIdentificador = 1;

    private final int numeroIdentificador;
    private final int capacidadePassageiros;
    private final BigDecimal custoFinanceiro;
    private final double taxaAceleração;

    public Onibus(int capacidadePassageiros, BigDecimal custoFinanceiro, double taxaAceleração) {
        this.numeroIdentificador = contadorIdentificador;
        this.capacidadePassageiros = capacidadePassageiros;
        this.custoFinanceiro = custoFinanceiro;
        this.taxaAceleração = taxaAceleração;

        contadorIdentificador++;
    }

    public abstract void emitirFichaTecnica();

    public static int getContadorIdentificador() {
        return contadorIdentificador;
    }
    public int getNumeroIdentificador() {
        return numeroIdentificador;
    }
    public int getCapacidadePassageiros() {
        return capacidadePassageiros;
    }
    public BigDecimal getCustoFinanceiro() {
        return custoFinanceiro;
    }
    public double getTaxaAceleração() {
        return taxaAceleração;
    }
}
