package modelo;

public class Livro {
    private final String titulo;
    private final String codigo;

    public Livro(String titulo, String codigo) {
        this.titulo = titulo;
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        String msg = "Titulo: "  + titulo + "\tCodigo ISBN: " + codigo;
        return msg;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getCodigo() {
        return codigo;
    }
}
