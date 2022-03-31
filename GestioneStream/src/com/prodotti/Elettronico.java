package com.prodotti;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Elettronico extends Prodotto {
    private String classeEnergetica;

    public Elettronico(String codice, Date dataIngresso, String nome, String produttore, String classeEnergetica) {
        super(codice, dataIngresso, nome, produttore);
        this.classeEnergetica = classeEnergetica;
    }

    public Elettronico(String codice, Date dataIngresso, String nome, String produttore) {
        super(codice, dataIngresso, nome, produttore);
    }
    //E004,05/04/2022,Frigorifero,Samsung,B
}
