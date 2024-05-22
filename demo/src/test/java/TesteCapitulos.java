import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.*;

import com.example.Livro;
import com.example.Testamento;

public class TesteCapitulos {
    @Test 
    public void testInsert(){
        assertTrue(true);
    }



    @Test
    public void TestaBuscaLivro(){
        Livro livroA = new Livro("Salmos");
        Testamento testamentoA = new Testamento("novo");
        testamentoA.addLivro(livroA);

        assertTrue(testamentoA.buscaLivro("Salmos"));
        assertFalse(testamentoA.buscaLivro("João"));
    }


}
