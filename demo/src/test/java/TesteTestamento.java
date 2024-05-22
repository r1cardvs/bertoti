import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;

import com.example.Capitulo;
import com.example.Livro;
import com.example.Testamento;
import com.example.Versiculo;

public class TesteTestamento {
    Testamento antigo = new Testamento("Antigo");
    Testamento novo = new Testamento("Novo");
    Livro geneses = new Livro("Gênesis");
    Livro exodo = new Livro("Êxodo");
    Livro levitico = new Livro("Levítico");
    Livro deuteronomio = new Livro("Deuteronômio");
    Livro mateus = new Livro("Mateus");
    Livro marcos = new Livro("Marcos");
    Livro lucas = new Livro("Lucas");
    Livro joao = new Livro("João");

    @Before
    public void cadastroLivros(){
        antigo.addLivro(geneses);
        antigo.addLivro(exodo);
        antigo.addLivro(levitico);
        antigo.addLivro(deuteronomio);
        novo.addLivro(mateus);
        novo.addLivro(marcos);
        novo.addLivro(lucas);
        novo.addLivro(joao);
    }

    @Test 
    public void testeBuscaCapitulosNoTestamento(){
        Capitulo capitulo12 = new Capitulo(12);
        marcos.addCapitulo(capitulo12);
        Versiculo versiculo = new Versiculo(30, "Ame o Senhor, o seu Deus, de todo o seu coração, de toda a sua alma, de todo o seu entendimento e de todas as suas forças.");
        capitulo12.addVersiculos(versiculo );

        Livro livroEncontrado = novo.buscaLivroVersiculo("Ame o Senhor, o seu Deus, de todo o seu coração, de toda a sua alma, de todo o seu entendimento e de todas as suas forças.");
        
        assertEquals(livroEncontrado.getNome(), "Marcos");
        assertNull(antigo.buscaLivroVersiculo("Ame o Senhor, o seu Deus, de todo o seu coração, de toda a sua alma, de todo o seu entendimento e de todas as suas forças."));
    }
}
