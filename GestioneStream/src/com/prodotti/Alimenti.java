package com.prodotti;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Alimenti extends Prodotto {

    private Date scadenza;
    private String provenienza;


    //Alimenti,A001,27/03/2022,Pollo,Amadori,01/05/2022,Italia,
    public Alimenti(String codice, Date dataIngresso, String nome, String produttore, Date scadenza, String provenienza) {
        super(codice, dataIngresso, nome, produttore);
        this.scadenza = scadenza;
        this.provenienza = provenienza;
    }

}
