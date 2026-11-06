package modelo;

public class CargaFarmaceutica extends CargaRefrigerada implements ControlavelVigilancia{
    private final String codigoRegistro;

    public CargaFarmaceutica(String descricaoMercadoria, Double pesoMercadoria, Double valorMercadoria, PrioridadeLogistica prioridade, double potenciaEletrica, String codigoRegistro) {
        super(descricaoMercadoria, pesoMercadoria, valorMercadoria, prioridade, potenciaEletrica);
        this.codigoRegistro = codigoRegistro;
    }

    @Override
    public double calcularSeguro() {
        double valorTotal = super.calcularSeguro();
        valorTotal += 1200;
        return valorTotal;
    }

    @Override
    public void emitirEtiqueta() {
        super.emitirEtiqueta();
        System.out.println("Número da Anvisa: " + codigoRegistro);
    }

    public String getCodigoRegistro() {
        return codigoRegistro;
    }

    @Override
    public String emitirProtocoloContencao() {
        return String.format("Isolamento em câmera fria do lote: " + codigoRegistro);
    }
}
