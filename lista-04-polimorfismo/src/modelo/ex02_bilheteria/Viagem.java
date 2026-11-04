package modelo.ex02_bilheteria;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Viagem {
    private final String motorista;
    private final BigDecimal tarifaBase;

    List<Passageiro> passageiros = new ArrayList<Passageiro>();

    public Viagem(String motorista, BigDecimal tarifaBase){
        this.motorista = motorista;
        this.tarifaBase = tarifaBase;
    }

    public void adicionarPassageiro(Passageiro p){
        passageiros.add(p);
    }

    public BigDecimal calcularFaturamento(){
        BigDecimal faturamento = BigDecimal.ZERO;
        for(Passageiro passageiro : passageiros){
            faturamento = faturamento.add(passageiro.calcularTarifa(tarifaBase));
        }

        return faturamento;
    }

    public void listarPassageiros(){
        for (Passageiro passageiro : passageiros) {
            System.out.println(passageiro.getNome());
        }
    }


    public String getMotorista() {
        return motorista;
    }

    public BigDecimal getTarifaBase() {
        return tarifaBase;
    }
}
