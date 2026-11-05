package modelo.ex03_carrinho_compra;

import java.math.BigDecimal;

public class Mouse extends Produto{
    
    private final String tipoSensor;
    
    public Mouse(String lojaParceira, BigDecimal precoVenda, String tipoSensor) {
        super(lojaParceira, precoVenda);
        this.tipoSensor = tipoSensor;
    }

    @Override
    public String obterDescricao() {
        return super.obterDescricao() + " - mouse " + tipoSensor;
    }

    public String getTipoSensor() {
        return tipoSensor;
    }
}
