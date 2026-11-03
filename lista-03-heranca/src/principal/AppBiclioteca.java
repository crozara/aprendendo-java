package principal;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;

import modelo.ex05_biblioteca.Livro;
import modelo.ex05_biblioteca.MidiasDigitais;
import modelo.ex05_biblioteca.RecorrenciaPublicacao;
import modelo.ex05_biblioteca.Revista;

public class AppBiclioteca {
    public static void main(String[] args) {
        ArrayList<Revista> revistas = new ArrayList<Revista>();
        ArrayList<Livro> livros = new ArrayList<Livro>();
        ArrayList<MidiasDigitais> midias = new ArrayList<MidiasDigitais>();

        Revista revista = new Revista("Codigo-10", "Revista atemporal", LocalDate.of(2026, 11, 1), BigDecimal.valueOf(10), 2, RecorrenciaPublicacao.SEMANAL);
        revistas.add(revista);

        Livro livro = new Livro("Codigo-Livro", "Livro qualquer", LocalDate.of(2025, 12, 10), BigDecimal.valueOf(20), "Codigo-ISBN", "Kauê Crozara", false);
        livros.add(livro);

        MidiasDigitais midia = new MidiasDigitais("Codigo-Midia", "Googl", LocalDate.of(2024, 11, 2), BigDecimal.valueOf(0), 256, "googl.com");
        midias.add(midia);

        for (Revista revista1 : revistas) {
            revista1.imprimirDados();   
        }

        for (Livro livro1 : livros) {
            livro1.imprimirDados();
        }

        for (MidiasDigitais midias1 : midias) {
            midias1.imprimirDados();
        }

        midia.compararItens("Codigo-Midia");
        midia.compararItens("Codigo-Diferente");

    }
}
