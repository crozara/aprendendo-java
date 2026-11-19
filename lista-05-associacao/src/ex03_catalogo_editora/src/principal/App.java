package principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import modelo.Autor;
import modelo.Livro;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        List<Livro> livros = new ArrayList<Livro>();
        List<Autor> autores = new ArrayList<Autor>();

        int opc;

        do{
            System.out.println();
            System.out.println("1 - Cadastrar novo autor. ");
            System.out.println("2 - Cadastrar novo livro. ");
            System.out.println("3 - Publicar livro. ");
            System.out.println("4 - Listar portfolio. ");
            System.out.println("5 - Encerrar programa.");
            System.out.print("Escolha uma opção: ");
            opc = in.nextInt();
            in.nextLine();

            if(opc == 1){
                String nome, cpf, email;
                System.out.println("\n=============");
                System.out.println("Cadastro de novo autor:");
                System.out.print("Digite o nome:");
                nome = in.nextLine();
                System.out.print("Digite o CPF: ");
                cpf = in.nextLine();
                System.out.print("Digite o email:");
                email = in.nextLine();
                Autor a1 = new Autor(cpf, nome, email);
                autores.add(a1);
                System.out.println("Autor cadastrado com sucesso!");
            }

            else if(opc == 2){
                String titulo, codigo;
                System.out.println("\n=============");
                System.out.println("Cadastro de novo Livro:");
                System.out.print("Digite o titulo:");
                titulo = in.nextLine();
                System.out.print("Digite o código ISBN: ");
                codigo = in.nextLine();
                Livro l1 = new Livro(titulo, codigo);
                livros.add(l1);
                System.out.println("Livro cadastrado com sucesso!");
            }

            else if(opc == 3){
                System.out.println("\n=============");
                System.out.println("Publicar Livro:");
                String cpf, codigo;
                System.out.print("Digite o CPF do autor:");
                cpf = in.nextLine();
                System.out.print("Digite o codigo ISBN: ");
                codigo = in.nextLine();

                Autor autorEncontrado = null;
                for (Autor autor : autores) {
                    if (autor.getCpf().equals(cpf)) {
                        autorEncontrado = autor;
                        break;
                    }
                }

                Livro livroEncontrado = null;
                for (Livro livro : livros) {
                    if (livro.getCodigo().equals(codigo)) {
                        livroEncontrado = livro;
                        break;
                    }
                }

                if (autorEncontrado == null || livroEncontrado == null) {
                    System.out.println("Erro: Autor ou Livro não encontrado no acervo!");
                } else {
                    autorEncontrado.publicarLivro(livroEncontrado);
                    System.out.println("Livro vinculado ao autor com sucesso!");
                }
            }

            else if(opc == 4){
                String cpf;
                System.out.println("\n=============");
                System.out.print("Digite o CPF para busca:");
                cpf = in.nextLine();

                for (Autor autor : autores) {
                    if(autor.getCpf().equals(cpf)){
                        autor.listarPortfolio();
                        break;
                    }
                }
            }

        }while(opc != 5);
        System.out.println("\nFinalizando programa...");
        in.close();
    }
}
