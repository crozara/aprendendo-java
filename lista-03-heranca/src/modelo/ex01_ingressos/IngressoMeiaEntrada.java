package modelo.ex01_ingressos;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class IngressoMeiaEntrada extends IngressoNormal{
    final String numeroCarteirinha;

    public IngressoMeiaEntrada(String nome, String setor, BigDecimal valorBase, String numeroCarteirinha) {
        super(nome, setor, valorBase);
        this.numeroCarteirinha = numeroCarteirinha;
    }

    @Override
    public BigDecimal calcularPrecoFinal() {
        return super.valorBase.divide(BigDecimal.valueOf(2), 2, RoundingMode.HALF_EVEN);
    }

    @Override
    public void impressaoTickect() {
        super.impressaoTickect();
        System.out.println("Número da carteirinha: " + numeroCarteirinha);
    }

    public String getNumeroCarteirinha() {
        return numeroCarteirinha;
    }

}
