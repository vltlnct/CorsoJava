package com.prodotti;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Vestiario extends Prodotto {
    private String modello;   // Sportivo, Classico
    private String sesso;
    private String materiale;  // Lana, cotone, misto ecc.
    private Integer taglia;

    //Vestiario,V003,30/03/2022,Camicia,H&M,Sportiva,D,Cotone,38,

    public Vestiario(String codice, Date dataIngresso, String nome, String produttore, String modello, String sesso, String materiale, Integer taglia) {
        super(codice, dataIngresso, nome, produttore);
        this.modello = modello;
        this.sesso = sesso;
        this.materiale = materiale;
        this.taglia = taglia;
    }




}
