package principal;
import modelo.TipoContador;

public class AppContador {
    public static void main(String[] args) {
        TipoContador contador = new TipoContador(10);
        contador.mostrarContagem();
        contador.aumentarContagem();
        contador.mostrarContagem();
        contador.diminuirContagem();
        contador.mostrarContagem();
        contador.setCont(-1);
    }
}