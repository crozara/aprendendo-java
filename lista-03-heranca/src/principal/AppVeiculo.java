package principal;

import java.math.BigDecimal;
import java.util.ArrayList;

import modelo.Caminhao;
import modelo.Carro;
import modelo.Cor;

public class AppVeiculo {
    public static void main(String[] args) {
        
        ArrayList<Carro> carros = new ArrayList<Carro>();
        ArrayList<Caminhao> caminhoes = new ArrayList<Caminhao>();

        Carro carro = new Carro(2011, Cor.BRANCO, 200, 130, BigDecimal.valueOf(20000), 4, 30);
        Caminhao caminhao = new Caminhao(2026, Cor.PRETO, 10000, 140, BigDecimal.valueOf(360000),   16000, 232, 60);

        carros.add(carro);
        caminhoes.add(caminhao);

        for (Carro veiculo : carros) {
            veiculo.imprimirDados();
        }

        for (Caminhao veiculo : caminhoes) {
            veiculo.imprimirDados();
        }
    }
}
