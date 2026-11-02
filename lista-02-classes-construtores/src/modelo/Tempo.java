package modelo;

//6-Escreva uma classe para conter três atributos do tipo int chamados hora, mins e segs e chame-a de Tempo.

public class Tempo {
    private int hora;
    private int mins;
    private int segs;

    // /a) crie um construtor que inicialize os dados com zero e outro construtor que 
    // inicialize os dados com um valor fixo (passado como argumento)

    public Tempo(){
        hora = 0;
        mins = 0;
        segs =0;
    }

    public Tempo(int hora, int mins, int segs){
        this.hora = hora;
        this.mins = mins;
        this.segs = segs;
    }
    
    //b) crie um método para setar a hora, os minutos e os segundos
    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMins() {
        return mins;
    }

    public void setMins(int mins) {
        this.mins = mins;
    }

    public int getSegs() {
        return segs;
    }

    public void setSegs(int segs) {
        this.segs = segs;
    }
    
    //c) crie um método para imprimir a hora no formato hh:mm:ss.
    public void mostrarHora(){
        System.out.format("\nHora atual: %d:%d:%d\n", this.hora, this.mins, this.segs);
    }

    //d) crie um método para adicionar dois objetos da classe Tempo. Um é o objeto atual e o outro é passado como argumento.
    public void adicionar(Tempo outro){
        this.segs += outro.segs;
        if (this.segs >= 60) {
            this.mins += this.segs / 60;
            this.segs %= 60;
        }

        this.mins += outro.mins;
        if (this.mins >= 60) {
            this.hora += this.mins / 60;
            this.mins %= 60;
        }

        this.hora += outro.hora;
    }

    //e) crie um método que subtraia dois Tempos e retorne o número de segundos entre eles. 
    // A função recebe um objeto da classe Tempo passado como argumento (o outro é o objeto atual).
    public int quantidadeSegundos(Tempo tempo){
        int result1 = (this.hora * 3600) + (this.mins * 60) + (this.segs);
        int result2 = (tempo.hora * 3600) + (tempo.mins * 60) + (tempo.segs);

        if(result1 > result2){
            return result1 - result2;
        } else{
            return result2 - result1;
        }
    }
}
