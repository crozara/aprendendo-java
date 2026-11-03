package modelo.ex01_frota;

import java.math.BigDecimal;

public class OnibusHibrido extends Onibus implements ContratoCompatibilidadeEletrica, ContratoControleFluidos{

    public OnibusHibrido(int capacidadePassageiros, BigDecimal custoFinanceiro) {
        super(capacidadePassageiros, custoFinanceiro, 4.0);
    }
    
    @Override
    public void emitirFichaTecnica() {
    System.out.println("---- Ficha Técnica: Ônibus Híbrido ----");
    System.out.println("ID: " + getNumeroIdentificador());
    System.out.println("Capacidade: " + getCapacidadePassageiros() + " passageiros");
    System.out.println("Custo: R$ " + getCustoFinanceiro());
    System.out.println("Taxa de Aceleração: " + getTaxaAceleração());

    // Chamadas aos métodos das interfaces que a classe assinou
    System.out.println("Tensão Elétrica: " + informarTensao());
    System.out.println("Autonomia: " + informarAlcance() + " km");
    System.out.println("Nível de Emissões: " + nivelEmissao() + "%");
    }

    @Override
    public double informarAlcance() {
        return 320;
    }

    @Override
    public double nivelEmissao() {
        return 1.6;
    }

    @Override
    public TensaoOperacao informarTensao() {
        return TensaoOperacao.BAIXA_VOLTAGEM_480V;
    }
}
