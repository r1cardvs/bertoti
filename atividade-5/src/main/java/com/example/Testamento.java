package com.example;

import java.util.LinkedList;
import java.util.List;

public class Testamento {
    private List<Livro> livros;
    private String nome;

    public Testamento(String nome){
        this.nome = nome;
        this.livros = new LinkedList<Livro>();
    }

    public String getNome(){
        return nome;
    }

    public void addLivro(Livro livro){
        livros.add(livro);
    }

    public List<Livro> getLivros(){
        return livros;
    }

    public boolean buscaLivro(String nomeLivro ){
        for(Livro livro: this.livros){
            if(livro.getNome() == nomeLivro){
                return true;
            }
        }

        return false;
    }

    public Livro buscaLivroVersiculo(String textoVersiculo){
        for(Livro livro : this.livros){
            Capitulo retorno = livro.buscaVersiculos(textoVersiculo);
            if(retorno != null)
            {
                return livro;
            }
        }

        return null;
    }


}
