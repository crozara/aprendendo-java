package principal;
import modelo.Tempo;

public class AppTempo {
    public static void main(String[] args) {
        Tempo t1 = new  Tempo(1, 50, 3);
        Tempo t2 = new Tempo();

        t2.setHora(2);
        t2.setMins(50);
        t2.setSegs(30);

        t1.mostrarHora();
        t2.mostrarHora();

        t2.adicionar(t1);
        t1.mostrarHora();
        t2.mostrarHora();

        t2.setHora(3);
        t2.setMins(50);
        t2.setSegs(30);

        t1.mostrarHora();
        t2.mostrarHora();
        System.out.println(t1.quantidadeSegundos(t2));
    }
}
