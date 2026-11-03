package modelo;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Livro extends ItemAcervo {
    private final String ISBN;
    private final String autorPrincipal;
    private final boolean temLombada;

    public Livro(String codigo, String titulo, LocalDate dataRegistro, BigDecimal multaDiaria, String ISBN, String autorPrincipal, boolean temLombada) {
        super(codigo, titulo, dataRegistro, multaDiaria);
        this.ISBN = ISBN;
        this.autorPrincipal = autorPrincipal;
        this.temLombada = temLombada;
    }
    
    @Override
    public BigDecimal valorTotalMulta() {
        BigDecimal valorTotal = super.getMultaDiaria();
        long diasAtraso = ChronoUnit.DAYS.between(getDataRegistro(), LocalDate.now());
        valorTotal = valorTotal.multiply(BigDecimal.valueOf(diasAtraso));

        if(temLombada){
            valorTotal = valorTotal.add(valorTotal.multiply(BigDecimal.valueOf(0.10)));
        }

        return valorTotal;
    }   

    @Override
    public void imprimirDados() {
        System.out.println("\n===Livro===");
        super.imprimirDados();
        System.out.println("Codigo ISBN: " + ISBN);
        System.out.println("Autor principal: " + autorPrincipal);
    }

    public String getISBN() {
        return ISBN;
    }

    public String getAutorPrincipal() {
        return autorPrincipal;
    }
}
