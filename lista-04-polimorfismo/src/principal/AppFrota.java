package principal;

import java.math.BigDecimal;
import modelo.ex01_frota.AuditorAmbiental;
import modelo.ex01_frota.Onibus;
import modelo.ex01_frota.OnibusEletrico;
import modelo.ex01_frota.OnibusGNV;
import modelo.ex01_frota.OnibusHibrido;
import modelo.ex01_frota.OnibusHidrogenio;
import modelo.ex01_frota.RoboRecarga;

public class AppFrota {
    public static void main(String[] args) {
        
        RoboRecarga robo = new RoboRecarga();
        AuditorAmbiental auditor = new AuditorAmbiental();

        OnibusEletrico onibusEletrico = new OnibusEletrico(45, BigDecimal.valueOf(850000));
        OnibusGNV onibusGnv = new OnibusGNV(50, BigDecimal.valueOf(600000));
        OnibusHibrido onibusHibrido = new OnibusHibrido(40, BigDecimal.valueOf(950000));

        System.out.println("=== Teste do Robô de Recarga ===");
        robo.conectarCabo(onibusEletrico);
        
        robo.conectarCabo(onibusHibrido);
        

        System.out.println("\n=== Teste do Auditor Ambiental ===");
        auditor.calcularImposto(onibusHibrido);
        auditor.calcularImposto(onibusGnv);

        OnibusHidrogenio onibusHidrogenio = new OnibusHidrogenio(60, BigDecimal.valueOf(1200000));
        auditor.calcularImposto(onibusHidrogenio);

        // Coleção Geral (Relatório de Frota)
        java.util.List<Onibus> frota = new java.util.ArrayList<>();
        frota.add(onibusEletrico);
        frota.add(onibusGnv);
        frota.add(onibusHibrido);
        frota.add(onibusHidrogenio);

        System.out.println("\n=== Relatório de Frota ===");
        for (Onibus onibus : frota) {
            onibus.emitirFichaTecnica(); // O Polimorfismo resolve o tipo dinamicamente
        }
    }
}