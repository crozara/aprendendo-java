package principal;
import java.util.ArrayList;

import modelo.ex02_autotech.AutomovelBasico;
import modelo.ex02_autotech.AutomovelLuxo;
import modelo.ex02_autotech.TipoMotor;

public class AppAutomovel {
    public static void main(String[] args) {
        ArrayList<AutomovelBasico> basicos = new ArrayList<AutomovelBasico>();
        ArrayList<AutomovelLuxo> luxos = new ArrayList<AutomovelLuxo>();

        AutomovelBasico basico = new AutomovelBasico("Palio", "Branco", TipoMotor.FLEX, true, true, true);
        basicos.add(basico);
        AutomovelLuxo luxo = new AutomovelLuxo("HB20 1.6 flex", "Prata", TipoMotor.FLEX);
        luxos.add(luxo);

        System.out.println("\n===Basicos===");
        for (AutomovelBasico automovel : basicos) {
            automovel.imprimirDados();
        }

        System.out.println("\n===Luxo===");
        for (AutomovelLuxo automovel : luxos) {
            automovel.imprimirDados();
        }
    }
}
