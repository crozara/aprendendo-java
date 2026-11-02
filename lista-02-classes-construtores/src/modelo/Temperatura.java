package modelo;

//1-Dada a seguinte definição de classe, escreva uma definição para o método  setTemperatura.

public class Temperatura {
    private double graus;
    private int escala;  // 0 – Celsius, 1 – Fahrenheit, 2 - Kelvin

    //Fixa os atributos com os valores passados como argumento.
    public void setTemperatura (double novosGraus, int novaEscala) {
        this.graus = novosGraus;
        this.escala = novaEscala;
    }

    //Apenas retirando o aviso de never used (não fazia parte do exercicio):
    public double getGraus() {
        return graus;
    }
    public void setGraus(double graus) {
        this.graus = graus;
    }
    public int getEscala() {
        return escala;
    }
    public void setEscala(int escala) {
        this.escala = escala;
    }
}