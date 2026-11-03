package principal;
import java.math.BigDecimal;

import modelo.ex06_sanitas.Administradores;
import modelo.ex06_sanitas.Executivos;
import modelo.ex06_sanitas.Medicos;


public class AppFuncionario {
    public static void main(String[] args) {
        
        Medicos medico = new Medicos("Dr. José", 123, BigDecimal.valueOf(10000), "Neuro", BigDecimal.valueOf(600));
        Executivos vice = new Executivos("Ricardo", 432, BigDecimal.valueOf(50000), "Vice-Preseidente");
        Administradores auxiliar = new Administradores("Miguel", 567, BigDecimal.valueOf(3000), "Auxiliar", "RH", "Kauê Crozara");

        System.out.println("===MEDICO===\n");
        medico.emitirContracheque();
        System.out.println("\n===EXECUTIVO===\n");
        vice.emitirContracheque();
        System.out.println("\n===ADMINISTRADORES===\n");
        auxiliar.emitirContracheque();
    }
}
