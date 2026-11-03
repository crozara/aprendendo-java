package modelo.ex05_biblioteca;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Revista extends ItemAcervo{

    private final int numEdicao;
    private final RecorrenciaPublicacao recorrenciaPublicacao;


    public Revista(String codigo, String titulo, LocalDate dataRegistro, BigDecimal multaDiaria, int numEdicao, RecorrenciaPublicacao recorrenciaPublicacao) {
        super(codigo, titulo, dataRegistro, multaDiaria);
        this.numEdicao = numEdicao;
        this.recorrenciaPublicacao = recorrenciaPublicacao;
    }

    @Override
    public BigDecimal valorTotalMulta() {
        BigDecimal valorTotal = super.getMultaDiaria();
        long diasAtraso = ChronoUnit.DAYS.between(getDataRegistro(), LocalDate.now());
        valorTotal = valorTotal.multiply(BigDecimal.valueOf(diasAtraso));

        if(this.recorrenciaPublicacao == RecorrenciaPublicacao.SEMANAL){
            valorTotal = valorTotal.multiply(BigDecimal.valueOf(2));
        }

        return valorTotal;
    }

    @Override
    public void imprimirDados() {
        System.out.println("\n===Revista===");
        super.imprimirDados();
        System.out.println("Numero da edição: " + numEdicao);
        System.out.println("Recorrencia da publicação: " + recorrenciaPublicacao);
    }

    public int getNumEdicao() {
        return numEdicao;
    }

    public RecorrenciaPublicacao getRecorrenciaPublicacao() {
        return recorrenciaPublicacao;
    }
}
