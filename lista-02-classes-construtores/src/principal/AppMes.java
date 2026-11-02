package principal;
import modelo.Mes;

public class AppMes {
    public static void main(String[] args) {
        Mes dezembro = new Mes("dezembro", "dez", 31, 12);
        Mes janeiro = new Mes("janeiro", "jan", 31, 1);
        
        System.out.println(dezembro.totalDias(12));
        System.out.println(janeiro.totalDias(1));
        System.out.println(dezembro.totalDias("Dezembro"));
        System.out.println(janeiro.totalDias("Janeiro"));
    }
}
