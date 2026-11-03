package modelo;

import java.math.BigDecimal;

public abstract class Automovel {
    private final String modelo;
    private final String cor;
    private final TipoMotor tipoMotor;

    public Automovel(String modelo, String cor, TipoMotor tipoMotor) {
        this.modelo = modelo;
        this.cor = cor;
        this.tipoMotor = tipoMotor;
    }

    public void imprimirDados(){
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor: " + cor);
        System.out.println("Tipo do motor: " + tipoMotor);
    }

    abstract BigDecimal calcularPrecoFinal();

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public TipoMotor getTipoMotor() {
        return tipoMotor;
    }
}
