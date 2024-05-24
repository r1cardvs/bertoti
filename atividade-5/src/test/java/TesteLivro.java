import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.*;

import com.example.Capitulo;
import com.example.Livro;
import com.example.Testamento;

public class TesteLivro {
    Livro livro = new Livro("Coríntios");

    @Test 
    public void insertLivro(){
        Livro livroInserido = new Livro("Coríntios");
        assertTrue(livroInserido.getNome()=="Coríntios");
    }

    @Test
    public void testeCadastroLivroNoTestamento(){
        Livro livroA = new Livro("Leviticos");
        Livro livroB = new Livro("Coríntios");

        Testamento testamentoA = new Testamento("novo");
        testamentoA.addLivro(livroB);
        testamentoA.addLivro(livroA);

        assertEquals(testamentoA.getLivros().size(),2);
        assertEquals(testamentoA.getLivros().get(0).getNome(),"Leviticos");
        assertEquals(testamentoA.getLivros().get(1).getNome(),"Coríntios");
    }

    @Test
    public void testeBuscaCapitulosNoLivro(){
        Capitulo capitulo1 = new Capitulo(3);
        Capitulo capitulo2 = new Capitulo(2);
        Capitulo capituloFora = new Capitulo(30);

        this.livro.addCapitulo(capitulo2);
        this.livro.addCapitulo(capitulo1);

        assertNull(this.livro.buscaCapitulo(30));

        this.livro.addCapitulo(capituloFora);
        assertNotNull(livro.buscaCapitulo(30));

        assertEquals(livro.buscaCapitulo(3), capitulo1);
    }
}
