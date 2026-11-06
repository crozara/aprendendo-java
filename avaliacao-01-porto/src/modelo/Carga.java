package modelo;

import java.util.ArrayList;
import java.util.List;

public abstract class Carga {

    private static int contador = 1001;
    private final int numeroSequencial;
    private final String descricaoMercadoria;
    private final double pesoMercadoria;
    private final double valorMercadoria;
    private final PrioridadeLogistica prioridade;
    private List<String> historicoRastreamento = new ArrayList<String>();

    public Carga(String descricaoMercadoria, double pesoMercadoria, double valorMercadoria, PrioridadeLogistica prioridade) {
        this.descricaoMercadoria = descricaoMercadoria;
        this.pesoMercadoria = pesoMercadoria;
        this.valorMercadoria = valorMercadoria;
        this.prioridade = prioridade;
        this.numeroSequencial = contador;
        contador++;
    }

    public void carimbarPassagemPorto(String porto){
        historicoRastreamento.add(porto);
    }

    public void emitirEtiqueta(){
        System.out.println("\nEmitindo etiqueta da carga de numero: " + numeroSequencial);
        System.out.println("Descrição da mercadoria: " + descricaoMercadoria);
        System.out.println("Peso da mercadoria: " + pesoMercadoria + "kg");
        System.out.println("Valor da mercadoria: R$" + valorMercadoria);
        System.out.println("Prioridade Logistica: " + prioridade);
        System.out.println("Historico de rastreamento: ");
        for (String porto : historicoRastreamento) {
            System.out.println(porto);
        }
        System.out.println("Valor do seguro: R$" + calcularSeguro());
    }
    public abstract double calcularSeguro();

    public int getNumeroSequencial() {
        return numeroSequencial;
    }
    public String getDescricaoMercadoria() {
        return descricaoMercadoria;
    }
    public double getPesoMercadoria() {
        return pesoMercadoria;
    }
    public double getValorMercadoria() {
        return valorMercadoria;
    }
    public PrioridadeLogistica getPrioridade() {
        return prioridade;
    } 
}
