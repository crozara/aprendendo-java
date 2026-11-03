package principal;
import java.math.BigDecimal;
import java.util.ArrayList;

import modelo.IngressoMeiaEntrada;
import modelo.IngressoNormal;
import modelo.IngressoVip;

public class AppIngresso {
    public static void main(String[] args) {

        ArrayList<IngressoNormal> normais = new ArrayList<IngressoNormal>();
        ArrayList<IngressoMeiaEntrada> meias = new ArrayList<IngressoMeiaEntrada>();
        ArrayList<IngressoVip> vips = new ArrayList<IngressoVip>();

        IngressoNormal normal = new IngressoNormal("Show", "pista", BigDecimal.valueOf(100.00));
        normais.add(normal);

        IngressoMeiaEntrada meia = new IngressoMeiaEntrada("Show", "Front", BigDecimal.valueOf(100.00), "1234");
        meias.add(meia);

        IngressoVip vip = new IngressoVip("Show", "Camarote", BigDecimal.valueOf(250), "VIP-123");
        vips.add(vip);

        System.out.println("\n==========Ingressos Comuns==========");
        for (IngressoNormal ingresso : normais) {
            ingresso.impressaoTickect();
        }
        
        System.out.println("\n==========Ingressos Meia Entrada==========");
        for (IngressoMeiaEntrada ingresso : meias) {
            ingresso.impressaoTickect();
        }

        System.out.println("\n==========Ingressos VIP==========");
        for (IngressoVip ingresso : vips) {
            ingresso.impressaoTickect();
        }
    }
}
