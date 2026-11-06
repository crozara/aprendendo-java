package modelo;

public class CargaRefrigerada extends Carga implements Energizavel{
    private final double potenciaEletrica;
    private double temperatura;

    public CargaRefrigerada(String descricaoMercadoria, Double pesoMercadoria, Double valorMercadoria, PrioridadeLogistica prioridade, double potenciaEletrica) {
        super(descricaoMercadoria, pesoMercadoria, valorMercadoria, prioridade);
        this.potenciaEletrica = potenciaEletrica;
        this.temperatura = -18.0;
    }

    public CargaRefrigerada(String descricaoMercadoria, Double pesoMercadoria, Double valorMercadoria, PrioridadeLogistica prioridade, double potenciaEletrica, double temperatura){
        super(descricaoMercadoria, pesoMercadoria, valorMercadoria, prioridade);
        this.potenciaEletrica = potenciaEletrica;
        this.temperatura = temperatura;
    }
    
    @Override
    public void emitirEtiqueta() {
        super.emitirEtiqueta();
        System.out.println("Valor da potencia eletrica: " + potenciaEletrica + "W");
        System.out.println("Valor da temperatura: " + temperatura + "°C");
    }

    @Override
    public double calcularSeguro() {
        double valorTotal = super.getValorMercadoria() * 0.02 * (getPrioridade().getFatorMultiplicador());
        valorTotal = valorTotal + (0.5 * potenciaEletrica);
        return valorTotal;
    } 

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    @Override
    public double getPotenciaWatts() {
        return potenciaEletrica;
    }
}
