package principal;

import java.math.BigDecimal;
import java.util.ArrayList;

import modelo.ex07_vidasegura.ApoliceApartamento;
import modelo.ex07_vidasegura.ApoliceEnfermaria;
import modelo.ex07_vidasegura.Pessoa;

public class AppApolice {
    public static void main(String[] args) {

        Pessoa titularEnfermaria = new Pessoa("Ana Silva", "111.111.111-11");
        Pessoa titularApartamento = new Pessoa("Carlos Eduardo", "222.222.222-22");
        
        Pessoa dep1 = new Pessoa("Filho 1", "333.333.333-33");
        Pessoa dep2 = new Pessoa("Filho 2", "444.444.444-44");
        Pessoa dep3 = new Pessoa("Filho 3", "555.555.555-55");
        Pessoa dep4 = new Pessoa("Filho 4", "666.666.666-66");

        System.out.println("=== TESTE PLANO ENFERMARIA (Max 3 dependentes) ===");
        
        // Inicializa com uma lista vazia
        ApoliceEnfermaria enfermaria = new ApoliceEnfermaria(
            titularEnfermaria, 
            1001, 
            new BigDecimal("500.00"), 
            new ArrayList<Pessoa>()
        );

        enfermaria.adicionarDependentes(dep1);
        enfermaria.adicionarDependentes(dep2);
        enfermaria.adicionarDependentes(dep3);
        enfermaria.adicionarDependentes(dep4); // Não pode

        System.out.println("Titular: " + enfermaria.getPessoa().getNome());
        System.out.println("Quantidade de dependentes cadastrados: " + enfermaria.getDependentes().size());
        System.out.println("Mensalidade (Sempre Fixa): R$ " + enfermaria.valorMensalidade());

        
        System.out.println("\n==================================================");
        System.out.println("\n=== TESTE PLANO APARTAMENTO (+15% por dependente) ===");
        
        ApoliceApartamento apartamento = new ApoliceApartamento(
            titularApartamento, 
            2002, 
            new BigDecimal("800.00"), 
            new ArrayList<Pessoa>()
        );

        // Adicionando 4 dependentes (Não há limite)
        apartamento.adicionarDependentes(dep1);
        apartamento.adicionarDependentes(dep2);
        apartamento.adicionarDependentes(dep3);
        apartamento.adicionarDependentes(dep4);

        System.out.println("Titular: " + apartamento.getPessoa().getNome());
        System.out.println("Quantidade de dependentes cadastrados: " + apartamento.getDependentes().size());
        
        // 800 + (4 * 120) = 800 + 480 = 1280.00
        System.out.println("Mensalidade c/ Acréscimos: R$ " + apartamento.valorMensalidade());
    }
}