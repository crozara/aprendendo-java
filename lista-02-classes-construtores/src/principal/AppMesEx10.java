package principal;
import modelo.MesEx10;

public class AppMesEx10 {
    public static void main(String[] args) {
        MesEx10 mDefault = new MesEx10();
        System.out.println("--- Construtor Padrão ---");
        System.out.println("Mês: " + mDefault.getMes() + " -> " + mDefault.getNomeMes());

        MesEx10 mInt = new MesEx10(5);
        System.out.println("\n--- Construtor com Inteiro (5) ---");
        System.out.println("Mês: " + mInt.getMes() + " -> " + mInt.getNomeMes());

        MesEx10 mStr = new MesEx10("dez");
        System.out.println("\n--- Construtor com Abreviação ('dez') ---");
        System.out.println("Mês: " + mStr.getMes() + " -> " + mStr.getNomeMes());

        System.out.println("\n--- Testando os Métodos Set ---");
        mDefault.setMes(8); 
        System.out.println("Setando por inteiro (8): " + mDefault.getNomeMes());

        mDefault.setMes("abr"); 
        System.out.println("Setando por abreviação ('abr'): " + mDefault.getNomeMes());

        System.out.println("\n--- Testando o Método proximoMes() ---");
        MesEx10 m1 = new MesEx10(1); 
        System.out.println("Mês atual: " + m1.getNomeMes());
        
        MesEx10 proximo = m1.proximoMes();
        System.out.println("Próximo mês: " + proximo.getNomeMes());

        MesEx10 dezembro = new MesEx10(12);
        System.out.println("\nMês atual: " + dezembro.getNomeMes());
        System.out.println("Próximo mês (virada de ano): " + dezembro.proximoMes().getNomeMes());
    }    
}
