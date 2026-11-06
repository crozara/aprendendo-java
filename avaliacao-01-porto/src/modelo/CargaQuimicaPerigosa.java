package modelo;

import java.util.ArrayList;
import java.util.List;

public class CargaQuimicaPerigosa extends Carga implements ControlavelVigilancia{
    
    private final int codigoRisco;
    private List<String> epi = new ArrayList<String>();
    
    public CargaQuimicaPerigosa(String descricaoMercadoria, double pesoMercadoria, double valorMercadoria, PrioridadeLogistica prioridade, int codigoRisco) {
        super(descricaoMercadoria, pesoMercadoria, valorMercadoria, prioridade);
        this.codigoRisco = codigoRisco;
    }
 
    public void inserirEpi(String equipamento){
        epi.add(equipamento);
    }

    public int getCodigoRisco() {
        return codigoRisco;
    }

    public List<String> getEpi() {
        return epi;
    }

    @Override
    public double calcularSeguro() {
        double valorTotal;
        valorTotal = getValorMercadoria() * 0.05 * getPrioridade().getFatorMultiplicador();
        valorTotal = valorTotal + (150 * epi.size());
        return valorTotal;
    }

    @Override
    public void emitirEtiqueta() {
        super.emitirEtiqueta();
        System.out.println("Código de risco da ONU: " + codigoRisco);
        System.out.println("Lista de EPI: ");
        for (String equipamento : epi) {
            System.out.println(equipamento);
        }
    }

    @Override
    public String emitirProtocoloContencao() {
        String a = String.format("Isolamento da área devido ao " + codigoRisco + "\n");
        String b = String.format("Listagem: " + epi.toString());
        return a + b;
    }

}
