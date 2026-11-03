package modelo.ex01_frota;

public class AuditorAmbiental {
    public void calcularImposto(ContratoControleFluidos alvo){
        double auto = alvo.informarAlcance();
        double emissao = alvo.nivelEmissao();
        System.out.println("Auditoria Ambiental - Autonomia: " + auto + " | Emissões: " + emissao);
    }
}
