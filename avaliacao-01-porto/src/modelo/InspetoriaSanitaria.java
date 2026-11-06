package modelo;

public class InspetoriaSanitaria {
    public void auditarCargaCritica(ControlavelVigilancia c){
        System.out.println("[AUDITORIA DE VIGILÂNCIA]");
        System.out.println(c.emitirProtocoloContencao());
    }
}
