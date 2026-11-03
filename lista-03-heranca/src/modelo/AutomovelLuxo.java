package modelo;

import java.math.BigDecimal;

public class AutomovelLuxo extends AutomovelBasico{
    private final static BigDecimal VALOR_DIRECAO = new BigDecimal("3500");
    private final static BigDecimal VALOR_CAMBIO = new BigDecimal("9000");
    private final static BigDecimal VALOR_VIDROS = new BigDecimal("2500");

    private Boolean direcao;
    private Boolean cambio;
    private Boolean vidros;

    public AutomovelLuxo(String modelo, String cor, TipoMotor tipoMotor) {
        super(modelo, cor, tipoMotor);
        this.direcao = false;
        this.cambio = false;
        this.vidros = false;
    }

    public AutomovelLuxo(String modelo, String cor, TipoMotor tipoMotor, Boolean retrovisor, Boolean limpador, Boolean radio, Boolean direcao, Boolean cambio, Boolean vidros) {
        super(modelo, cor, tipoMotor, retrovisor, limpador, radio);
        this.direcao = direcao;
        this.cambio = cambio;
        this.vidros = vidros;
    }

    @Override
    BigDecimal calcularPrecoFinal() {
        BigDecimal precoFinalBasico = super.calcularPrecoFinal();
        BigDecimal custoTotal = BigDecimal.ZERO;

        if(direcao){
            custoTotal = custoTotal.add(VALOR_DIRECAO);
        }
        if(cambio){
            custoTotal = custoTotal.add(VALOR_CAMBIO);
        }
        if(vidros){
            custoTotal = custoTotal.add(VALOR_VIDROS);
        }
        
        return custoTotal.add(precoFinalBasico);
    }

    public static BigDecimal getValorDirecao() {
        return VALOR_DIRECAO;
    }

    public static BigDecimal getValorCambio() {
        return VALOR_CAMBIO;
    }

    public static BigDecimal getValorVidros() {
        return VALOR_VIDROS;
    }

    public Boolean getDirecao() {
        return direcao;
    }

    public Boolean getCambio() {
        return cambio;
    }

    public Boolean getVidros() {
        return vidros;
    }

    public void setDirecao(Boolean direcao) {
        this.direcao = direcao;
    }

    public void setCambio(Boolean cambio) {
        this.cambio = cambio;
    }

    public void setVidros(Boolean vidros) {
        this.vidros = vidros;
    }
}
