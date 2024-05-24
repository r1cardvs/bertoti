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

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Versiculo other = (Versiculo) obj;
        return numero == other.numero && texto.equals(other.texto);
    }
}