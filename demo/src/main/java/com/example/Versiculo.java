package com.example;

public class Versiculo {
    public int numero;
    public String texto;

    public Versiculo( int numero, String texto){
        this.numero = numero;
        this.texto = texto;
    }

    public String getTexto(){
        return texto;
    }

    public int getNumero(){
        return numero;
    }
}