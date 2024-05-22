package com.example;

import java.util.LinkedList;
import java.util.List;

public class Livro {
    private String nome;
    private List<Capitulo> capitulos;

    public Livro( String nome){
        this.nome = nome;
        this.capitulos = new LinkedList<Capitulo>();
    }

    public String getNome(){
        return nome;
    }

    public void addCapitulo( Capitulo capitulo){
        this.capitulos.add(capitulo);
    }

    public List<Capitulo> listaCapitulos(){
        return this.capitulos;
    }

    public Capitulo buscaCapitulo(int numeroCampitulo){
        for (Capitulo capitulo : capitulos) {
            if (capitulo.getNumero() == numeroCampitulo) {
                return capitulo;
            }
        }

        return null;
    }

    public Capitulo buscaVersiculos(String texto) {
        for (Capitulo capitulo : this.capitulos) {
            List<Versiculo> versiculos = capitulo.getVersiculos();
            for (Versiculo versiculo : versiculos) {
                if(versiculo.getTexto() == texto){
                    return capitulo;
                }
            }
        }

        return null;
    }

    public static void main(String[] args) {
        Livro livro = new Livro("Meu Livro");
        Versiculo versiculo1 = new Versiculo(12, "Se Deus assim nos amou, também nós devemos amar uns aos outros");
        //capitulo.addVersiculos(versiculo1);
        Capitulo capituloEncontrado = livro.buscaVersiculos("Se Deus assim nos amou, também nós devemos amar uns aos outros");
    }
}
