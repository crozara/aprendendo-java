package principal;
import modelo.BombaDeGasolina;

public class AppBombaDeGasolina {
    public static void main(String[] args) {
        BombaDeGasolina bomba = new BombaDeGasolina();
        bomba.mostrarDados();
        bomba.setCusto_litro(5);
        bomba.abastecerGasolinaDinheiro(100);
        bomba.mostrarDados();
        bomba.abastecerGasolinaLitro(10);
        bomba.mostrarDados();

    }
}
