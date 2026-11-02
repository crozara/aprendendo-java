package principal;
import modelo.Ponto2D;

public class AppPonto2D {
    public static void main(String[] args) {
        Ponto2D ponto = new  Ponto2D();
        ponto.setPonto(10, 10);
        ponto.imprimirPonto();
        ponto.moverPonto(5, 5);
        ponto.imprimirPonto();
        ponto.girar90();
        ponto.imprimirPonto();
    }
}
