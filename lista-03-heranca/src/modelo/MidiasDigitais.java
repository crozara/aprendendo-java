package modelo;

import java.math.BigDecimal;
import java.time.LocalDate;

public class MidiasDigitais extends ItemAcervo{
    private final int tamanhoArquivo;
    private String url;

    public MidiasDigitais(String codigo, String titulo, LocalDate dataRegistro, BigDecimal multaDiaria, int tamanhoArquivo, String url) {
        super(codigo, titulo, dataRegistro, multaDiaria);
        this.tamanhoArquivo = tamanhoArquivo;
        this.url = url;
    }

    @Override
    public BigDecimal valorTotalMulta() {
        return BigDecimal.ZERO;
    }

    @Override
    public void imprimirDados() {
        System.out.println("\n===Midias===");
        super.imprimirDados();
        System.out.println("Tamanho do arquivo: " + tamanhoArquivo + "mb");
        System.out.println("URL: " + url);
    }

    public int getTamanhoArquivo() {
        return tamanhoArquivo;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    
    
}
