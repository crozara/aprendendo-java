package modelo;

import java.util.ArrayList;
import java.util.List;

public class Autor {
    private final String cpf;
    private final String nome;
    private final String email;
    private List<Livro> livros = new ArrayList<Livro>();

    public Autor(String cpf, String nome, String email) {
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
    }

    public void publicarLivro(Livro livro){
        livros.add(livro);
    }

    public void listarPortfolio(){
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Email: " + email);
        System.out.println("Livros:");
        for (Livro livro : livros) {
            System.out.println(livro);
        }
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    
}
