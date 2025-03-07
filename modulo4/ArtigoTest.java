package com.mycompany.app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

import com.mycompany.app.Model.Artigo;
import com.mycompany.app.Model.Autor;


public class ArtigoTest {
    @Test
    public void testCriacaoArtigo() {
        Autor autor = new Autor("Vinicius", "Brasileiro", "Usuário");
        Artigo artigo = new Artigo("JavaSpringboot", autor, "Tecnologia", true);

        assertEquals("JavaSpringboot", artigo.getTitulo());
        assertEquals("Vinicius", artigo.getAutor().getNome());
        assertEquals("Tecnologia", artigo.getGenero());
        assertTrue(artigo.isPublicado());
    }
}