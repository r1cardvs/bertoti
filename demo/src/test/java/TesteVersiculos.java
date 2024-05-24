import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.*;

import com.example.Capitulo;
import com.example.Livro;
import com.example.Versiculo;

public class TesteVersiculos {
    Livro livro = new Livro("João");
    Capitulo capitulo = new Capitulo(10);

    @Before
    public void baseVersiculo(){
        livro.addCapitulo(capitulo);
        Versiculo versiculo1 = new Versiculo(12, "Se Deus assim nos amou, também nós devemos amar uns aos outros");
        capitulo.addVersiculos(versiculo1);
    }

    @Test 
    public void insertVersiculo(){
        assertEquals(capitulo.getVersiculos().getFirst().getNumero(), 12);
        assertEquals(capitulo.getVersiculos().getFirst().getTexto(), "Se Deus assim nos amou, também nós devemos amar uns aos outros");
    }

    @Test
    public void buscarVersiculoCapitulo(){
        assertNotNull( capitulo.buscaVersiculo("Se Deus assim nos amou, também nós devemos amar uns aos outros"));
    }

    @Test
    public void buscarVersiculoLivro(){
        Capitulo capituloEncontrado = livro.buscaVersiculos("Se Deus assim nos amou, também nós devemos amar uns aos outros");
        assertEquals(capituloEncontrado.getNumero(), 10);
    }

    @Test
    public void testaComparaVersiculos(){
        Versiculo versiculoA = new Versiculo(1, "Amados, amemos uns aos outros, pois o amor procede de Deus. Aquele que ama é nascido de Deus e conhece a Deus.");
        Versiculo versiculoB = new Versiculo(1, "Amados, amemos uns aos outros, pois o amor procede de Deus. Aquele que ama é nascido de Deus e conhece a Deus.");

        assertEquals(versiculoA, versiculoB);
    }
}
