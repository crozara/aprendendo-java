package principal;
import modelo.Empresa;

public class AppEmpresa {
    public static void main(String[] args) {
        Empresa empresa1 = new Empresa();
        Empresa empresa2 = new Empresa("Lívia Dias - MKT", "Online" , "Uberaba", "MG", "123-123", 99999999);

        empresa1.setNome("Kauê Cr - Engenharia");
        empresa1.setEndereco("Online");
        empresa1.setCidade("Uberaba");
        empresa1.setEstado("MG");
        empresa1.setCep("123-123");
        empresa1.setTelefone(111111);

        empresa1.mostrarDados();
        empresa2.mostrarDados();
    }
}
