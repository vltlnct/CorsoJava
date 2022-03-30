package com.prodotti;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Elettronici extends Prodotto {
    private String classeEnergetica;

    public Elettronici(String codice, Date dataIngresso, String nome, String produttore, String classeEnergetica) {
        super(codice, dataIngresso, nome, produttore);
        this.classeEnergetica = classeEnergetica;
    }
    //E004,05/04/2022,Frigorifero,Samsung,B
}
