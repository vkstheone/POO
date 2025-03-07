package com.mycompany.app;

import com.mycompany.app.Model.Artigo;
import com.mycompany.app.Model.Autor;
import com.mycompany.app.Model.Emprestimo;
import com.mycompany.app.Model.Livro;
import com.mycompany.app.Model.Usuario;

public class Main {
    public static void main(String[] args) {
        Autor autor = new Autor("Robert Cecil Martin", "EUA", "Autor Tradicional");

        Usuario usuarioAutor = new Usuario("Vinicius", 23);

        Livro livro = new Livro("O Profeta", autor, "Poesia em prosa", true);
        livro.validarDisponibilidade();

        String dataRetirada = "08/02/2022";
        String dataDevolucao = "15/02/2025";

        
        Emprestimo emprestimo = new Emprestimo(dataRetirada, dataDevolucao, livro, usuarioAutor);

        System.out.println("--- Detalhes do Empréstimo ---");
        if (!livro.isDisponivel()) {
            System.out.println("O livro não está disponível para empréstimo.");
        }
        System.out.println("Livro: " + emprestimo.getLivro().getTitulo());
        System.out.println("Autor: " + autor.getNome());
        System.out.println("Gênero: " + emprestimo.getLivro().getGenero());
        System.out.println("Usuário: " + emprestimo.getUsuario().getNome());
        System.out.println("Idade: " + usuarioAutor.getIdade());
        System.out.println("Data de Retirada: " + emprestimo.getDataRetirada());
        System.out.println("Data de Devolução: " + emprestimo.getDataDevolucao());

        Artigo artigo = new Artigo("JavaSpringboot", usuarioAutor, "Tecnologia", true);

        System.out.println("\n--- Detalhes do Artigo ---");
        System.out.println("Título: " + artigo.getTitulo());
        System.out.println("Autor: " + artigo.getAutor().getNome());
        System.out.println("Gênero: " + artigo.getGenero());
        System.out.println("Publicado: " + (artigo.isPublicado() ? "Sim" : "Não"));
    }
}