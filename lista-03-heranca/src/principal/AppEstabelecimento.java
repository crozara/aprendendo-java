package principal;
import java.math.BigDecimal;
import java.util.ArrayList;

import modelo.CategoriaCulinaria;
import modelo.Restaurante;
import modelo.Supermercados;

public class AppEstabelecimento {
    public static void main(String[] args) {
        
        ArrayList<Restaurante> restaurantes = new ArrayList<Restaurante>();
        ArrayList<Supermercados> supermercados = new ArrayList<Supermercados>();

        Restaurante r = new Restaurante("Rafa's", "23.456.789/0001-95", "Uberaba", "MG", "83501-260", 
        1231231, CategoriaCulinaria.BRASILEIRA, BigDecimal.valueOf(20.00));
        Supermercados s = new Supermercados("Zebu", "23.456.789/0001-95", "Uberlandia", "MG", "111111-111", 222222, 11);

        restaurantes.add(r);
        supermercados.add(s);

        for (Restaurante restaurante : restaurantes) {
            restaurante.imprimirDados();
        }

        for (Supermercados supermercado : supermercados) {
            supermercado.imprimirDados();
        }

    }
}
