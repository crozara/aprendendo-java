import java.util.ArrayList;
import java.util.List;

import modelo.*;

public class App {
    public static void main(String[] args) throws Exception {

        CargaRefrigerada cargaRefrigerada = new CargaRefrigerada("Uma carga refrigerada qlqr", 100.0, 10.0, PrioridadeLogistica.CRITICA, 5.0);
        CargaFarmaceutica farmaceutica = new CargaFarmaceutica("Farmaceutica", 4.0, 100.0, PrioridadeLogistica.EXPRESSA, 2.0, "123");
        CargaQuimicaPerigosa quimica = new CargaQuimicaPerigosa("Quimica", 15.0, 200.0, PrioridadeLogistica.EXPRESSA, 123);

        cargaRefrigerada.carimbarPassagemPorto("Porto 1");
        cargaRefrigerada.carimbarPassagemPorto("Porta 2");

        farmaceutica.carimbarPassagemPorto("Porto 3");
        farmaceutica.carimbarPassagemPorto("Porto 4");

        quimica.carimbarPassagemPorto("Porto 5");
        quimica.carimbarPassagemPorto("Porto 6");

        quimica.inserirEpi("Luva");
        quimica.inserirEpi("Capacete");

        cargaRefrigerada.setTemperatura(20);

        List<Carga> agrupacao = new ArrayList<Carga>();
        agrupacao.add(cargaRefrigerada);
        agrupacao.add(farmaceutica);
        agrupacao.add(quimica);

        double total = 0;
        for (Carga carga : agrupacao) {
            System.out.println("\n==================================");
            carga.emitirEtiqueta();
            total += carga.calcularSeguro();
        }
        System.out.println("\n==================================");
        System.out.println("Custo total acumulado: R$" + total);

        TerminalEletrico terminal = new TerminalEletrico();
        InspetoriaSanitaria inspetoria = new InspetoriaSanitaria();

        terminal.ernergizar(farmaceutica);
        terminal.ernergizar(cargaRefrigerada);

        inspetoria.auditarCargaCritica(quimica);
        inspetoria.auditarCargaCritica(farmaceutica);
    }
}
