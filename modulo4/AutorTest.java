package com.mycompany.app;

import static org.junit.Assert.assertEquals;
import org.junit.Test;  // ✅ JUnit 4

import com.mycompany.app.Model.Autor;


public class AutorTest {
    @Test
    public void testCriacaoAutor() {
        Autor autor = new Autor("Robert Cecil Martin", "EUA", "Autor Tradicional");
        assertEquals("Robert Cecil Martin", autor.getNome());
        assertEquals("EUA", autor.getNacionalidade());
        assertEquals("Autor Tradicional", autor.getTipoAutor());
    }
}