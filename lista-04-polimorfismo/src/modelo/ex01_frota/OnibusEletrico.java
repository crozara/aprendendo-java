package modelo.ex01_frota;

import java.math.BigDecimal;

public class OnibusEletrico extends Onibus implements ContratoCompatibilidadeEletrica{

    public OnibusEletrico(int capacidadePassageiros, BigDecimal custoFinanceiro) {
        super(capacidadePassageiros, custoFinanceiro, 5.0);
    }
    
    @Override
    public void emitirFichaTecnica() {
        System.out.println("---- Ficha Técnica: Ônibus Elétrico ----");
        System.out.println("ID: " + getNumeroIdentificador());
        System.out.println("Capacidade: " + getCapacidadePassageiros() + " passageiros");
        System.out.println("Custo: R$ " + getCustoFinanceiro());
        System.out.println("Taxa de Aceleração: " + getTaxaAceleração());
        
        System.out.println("Tensão Elétrica: " + informarTensao());
    }

    @Override
    public TensaoOperacao informarTensao() {
        return TensaoOperacao.BAIXA_VOLTAGEM_480V;
    }
    
}
