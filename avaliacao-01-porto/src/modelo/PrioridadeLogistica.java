package modelo;

public enum PrioridadeLogistica {
    ECONOMICA(1.0), 
    EXPRESSA(1.5), 
    CRITICA(2.5);

    private final double fatorMultiplicador;

    PrioridadeLogistica(double fatorMultiplicador){
        this.fatorMultiplicador = fatorMultiplicador;
    }

    public double getFatorMultiplicador(){
        return fatorMultiplicador;
    }
}
