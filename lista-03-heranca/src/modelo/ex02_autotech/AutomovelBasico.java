package modelo.ex02_autotech;

import java.math.BigDecimal;

public class AutomovelBasico extends Automovel{

    private static final BigDecimal VALOR_RETROVISOR = new BigDecimal("300.00");
    private static final BigDecimal VALOR_LIMPADOR = new BigDecimal("450.00");
    private static final BigDecimal VALOR_RADIO = new BigDecimal("500.00");

    private Boolean retrovisor;
    private Boolean limpador;
    private Boolean radio;   

    public AutomovelBasico(String modelo, String cor, TipoMotor tipoMotor, Boolean retrovisor, Boolean limpador, Boolean radio) {
        super(modelo, cor, tipoMotor);
        this.retrovisor = retrovisor;
        this.limpador = limpador;
        this.radio = radio;
    }

    public AutomovelBasico(String modelo, String cor, TipoMotor tipoMotor) {
        super(modelo, cor, tipoMotor);
        this.retrovisor = false;
        this.limpador = false;
        this.radio = false;
    }

    @Override
    BigDecimal calcularPrecoFinal() {
        BigDecimal precoFinal = getTipoMotor().getPreco();
        if(retrovisor){
            precoFinal = precoFinal.add(VALOR_RETROVISOR);
        }
        if(limpador){
            precoFinal = precoFinal.add(VALOR_LIMPADOR);
        }
        if(radio){
            precoFinal= precoFinal.add(VALOR_RADIO);
        }
        return precoFinal;
    }

    @Override
    public void imprimirDados() {
        super.imprimirDados();
        System.out.println("Preço final: " + calcularPrecoFinal());
    }

    public static BigDecimal getValorRetrovisor() {
        return VALOR_RETROVISOR;
    }

    public static BigDecimal getValorLimpador() {
        return VALOR_LIMPADOR;
    }

    public static BigDecimal getValorRadio() {
        return VALOR_RADIO;
    }

    public Boolean getRetrovisor() {
        return retrovisor;
    }

    public Boolean getLimpador() {
        return limpador;
    }

    public Boolean getRadio() {
        return radio;
    }

    public void setRetrovisor(Boolean retrovisor) {
        this.retrovisor = retrovisor;
    }

    public void setLimpador(Boolean limpador) {
        this.limpador = limpador;
    }

    public void setRadio(Boolean radio) {
        this.radio = radio;
    }
}
