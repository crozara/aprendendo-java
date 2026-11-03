package modelo.ex01_ingressos;

import java.math.BigDecimal;

public class IngressoVip extends IngressoNormal {
    static final BigDecimal AUMENTO_PULSEIRA_VIP = new BigDecimal("75.00");
    private String codigoPulseira;


    public IngressoVip(String nome, String setor, BigDecimal valorBase, String codigoPulseira) {
        super(nome, setor, valorBase);
        this.codigoPulseira = codigoPulseira;
    }

    @Override
    public BigDecimal calcularPrecoFinal() {
        return super.valorBase.add(AUMENTO_PULSEIRA_VIP);
    }

    @Override
    public void impressaoTickect() {
        super.impressaoTickect();
        System.out.println("[VIP] " + codigoPulseira);
    }

    public String getCodigoPulseira() {
        return codigoPulseira;
    }

}
