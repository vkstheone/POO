package com.mycompany.app.Model;

public class Livro extends Publicacao {  
    private String genero;
    private boolean disponivel;

    public Livro(String titulo, Autor autor, String genero, boolean disponivel) {
        super(titulo, autor); 
        this.genero = genero;
        this.disponivel = disponivel;
    }

    public String getGenero() {
        return genero;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public void validarDisponibilidade() {
        if (!disponivel) {
            System.out.println("Livro não está disponível para empréstimo.");
        }
    }
}