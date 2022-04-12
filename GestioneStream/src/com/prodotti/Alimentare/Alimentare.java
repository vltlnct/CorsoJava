package com.prodotti.Alimentare;
import com.prodotti.Prodotto;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;




public class Alimentare extends Prodotto {

    private Date scadenza;
    private String provenienza;


    //Alimenti,A001,27/03/2022,Pollo,Amadori,01/05/2022,Italia,
    public Alimentare(String codice, Date dataIngresso, String nome, String produttore, Date scadenza, String provenienza) {
        super(codice, dataIngresso, nome, produttore);
        this.scadenza = scadenza;
        this.provenienza = provenienza;
    }



    public Date getScadenza() {
        return scadenza;
    }

    public String getProvenienza() {
        return provenienza;
    }


    public static void ordinaPerDataScadenza(ArrayList<Alimentare> lista)
    {
        lista.sort(new OrdinaDataScadenza());
    }
    public static void ordinaPerDataIngresso(ArrayList<Alimentare> lista)
    {
        lista.sort(new OrdinaDataIngresso());
    }


}
