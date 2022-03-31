package com.prodotti;
import java.util.Date;
import java.util.Objects;

public class Prodotto {
    private String codice;
    private Date dataIngresso;
    private String nome;
    private String produttore;


    public Prodotto(String codice, Date dataIngresso, String nome,  String produttore) {
        this.codice = codice;
        this.dataIngresso = dataIngresso;
        this.nome = nome;
        this.produttore = produttore;

    }

    public String getCodice() {
        return codice;
    }

}
