package modelo.ex01_frota;

import java.math.BigDecimal;

public class OnibusHidrogenio extends Onibus implements ContratoControleFluidos {

    public OnibusHidrogenio(int capacidadePassageiros, BigDecimal custoFinanceiro) {
        super(capacidadePassageiros, custoFinanceiro, 4.5); 
    }

    @Override
    public double informarAlcance() {
        return 700.0; 
    }

    @Override
    public double nivelEmissao() {
        return 0.0; 
    }

    @Override
    public void emitirFichaTecnica() {
        System.out.println("---- Ficha Técnica: Ônibus Hidrogênio ----");
        System.out.println("ID: " + getNumeroIdentificador());
        System.out.println("Capacidade: " + getCapacidadePassageiros() + " passageiros");
        System.out.println("Custo: R$ " + getCustoFinanceiro());
        System.out.println("Taxa de Aceleração: " + getTaxaAceleração());
        
        System.out.println("Autonomia: " + informarAlcance() + " km");
        System.out.println("Nível de Emissões: " + nivelEmissao() + "%");
    }
}