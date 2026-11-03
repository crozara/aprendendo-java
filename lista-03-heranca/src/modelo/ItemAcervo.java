package modelo;

import java.math.BigDecimal;
import java.time.LocalDate;

public abstract class ItemAcervo {
    private final String codigo;
    private final String titulo;
    private final LocalDate dataRegistro;
    private final BigDecimal multaDiaria;

    public ItemAcervo(String codigo, String titulo, LocalDate dataRegistro, BigDecimal multaDiaria){
        this.codigo = codigo;
        this.titulo = titulo;
        this.dataRegistro = dataRegistro;
        this.multaDiaria = multaDiaria;
    }
    public abstract BigDecimal valorTotalMulta();
    
    public void imprimirDados(){
        System.out.println("Codigo: " + codigo);
        System.out.println("Titulo: " + titulo);
        System.out.println("Data de Registro: " + dataRegistro);
        System.out.println("Valor da multa diária: R$" + multaDiaria);
        System.out.println("Valor total da multa: R$" + valorTotalMulta());
    }

    public void compararItens(String codigo){
        if(this.codigo.equals(codigo)){
            System.out.println("\nSão o mesmo item!");
        } else{
            System.out.println("\nSão itens diferentes.");
        }
    }

    public String getCodigo() {
        return codigo;
    }
    public String getTitulo() {
        return titulo;
    }
    public LocalDate getDataRegistro() {
        return dataRegistro;
    }
    public BigDecimal getMultaDiaria() {
        return multaDiaria;
    }
}
