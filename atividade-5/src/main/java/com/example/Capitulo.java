package com.example;

import java.util.LinkedList;
import java.util.List;

public class Capitulo {
    private int numero;
    private List<Versiculo> versiculos;

    public Capitulo( int numero){
        this.numero = numero;
        this.versiculos = new LinkedList<Versiculo>();
    }

    public int getNumero(){
        return numero;
    }

    
    public Versiculo buscaVersiculo( String valorVersiculo){
        for (Versiculo versiculo : versiculos) {
            if (versiculo.getTexto().equals(valorVersiculo)) {
                return versiculo;
            }
        }
        return null;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Capitulo other = (Capitulo) obj;
        return numero == other.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public List<Versiculo> getVersiculos() {
        return versiculos;
    }

    public void addVersiculos(Versiculo versiculos) {
        this.versiculos.add(versiculos);
    }
}
