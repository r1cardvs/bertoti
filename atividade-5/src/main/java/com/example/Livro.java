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
}
