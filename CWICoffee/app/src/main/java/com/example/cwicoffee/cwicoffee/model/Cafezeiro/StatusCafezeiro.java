package com.example.cwicoffee.cwicoffee.model.Cafezeiro;

/**
 * Created by daniel.figueiredo on 25/11/2017.
 */

enum StatusCafezeiro {
    BRONZE("BR"),
    PRATA("PR"),
    OURO("OU"),
    CAVEIRA("CA");

    private String status;

    StatusCafezeiro(String status) {
        this.status = status;
    }

    private String getStatus() {
        return this.status;
    }
}
