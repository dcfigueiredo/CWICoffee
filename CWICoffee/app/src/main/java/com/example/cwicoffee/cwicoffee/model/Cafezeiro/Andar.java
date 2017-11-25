package com.example.cwicoffee.cwicoffee.model.Cafezeiro;

/**
 * Created by daniel.figueiredo on 25/11/2017.
 */

public enum Andar {

    PRIMEIRO("1"),
    SEGUNDO("2"),
    TERCEIRO("3"),
    QUARTO("4"),
    QUINTO("5");

    private String valor;

    Andar(String andar) {
        this.valor = andar;
    }

    public String getValor(){
        return this.valor;
    }
}
