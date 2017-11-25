package com.example.cwicoffee.cwicoffee.model.Cafe;

/**
 * Created by daniel.figueiredo on 25/11/2017.
 */

enum StatusCafe {
    ABERTO("AB"),
    CONCLUIDO("CO"),
    CANCELADO("CA");

    private String status;

    StatusCafe(String status) {
        this.status = status;
    }

    public String getStatus() {
        return this.status;
    }
}
