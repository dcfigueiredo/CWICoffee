package com.example.cwicoffee.cwicoffee.model.Cafe;

import com.example.cwicoffee.cwicoffee.model.CafezeiroCafe.CafezeiroCafe;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * Created by daniel.figueiredo on 25/11/2017.
 */

public class Cafe {

    private Long idCafe;
    private LocalDate dtCafe;
    private List<CafezeiroCafe> listCafezeiroCafe;
    private BigDecimal vlGasto;
    private StatusCafe status;
}
