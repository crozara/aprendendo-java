package modelo.ex01_frota;

import java.math.BigDecimal;

public class OnibusGNV extends Onibus implements ContratoControleFluidos{

    public OnibusGNV(int capacidadePassageiros, BigDecimal custoFinanceiro) {
        super(capacidadePassageiros, custoFinanceiro, 3.0);
    }

    @Override
    public void emitirFichaTecnica() {
        System.out.println("---- Ficha Técnica: Ônibus GNV ----");
        System.out.println("ID: " + getNumeroIdentificador());
        System.out.println("Capacidade: " + getCapacidadePassageiros() + " passageiros");
        System.out.println("Custo: R$ " + getCustoFinanceiro());
        System.out.println("Taxa de Aceleração: " + getTaxaAceleração());
        
        System.out.println("Autonomia: " + informarAlcance() + " km");
        System.out.println("Nível de Emissões: " + nivelEmissao() + "%");
    }

    @Override
    public double informarAlcance() {
        return 450;
    }

    @Override
    public double nivelEmissao() {
        return 1.2;
    }
    
}
