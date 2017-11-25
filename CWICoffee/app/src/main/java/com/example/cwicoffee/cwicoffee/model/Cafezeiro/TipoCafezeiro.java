package com.example.cwicoffee.cwicoffee.model.Cafezeiro;

/**
 * Created by daniel.figueiredo on 25/11/2017.
 */

enum TipoCafezeiro {
    ADMIN("ADM"),
    NORMAL("NRM"),;

    private String tipo;

    TipoCafezeiro(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return this.tipo;
    }
}
