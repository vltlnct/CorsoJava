package com.compuni;

import java.util.Date;

public class Persona extends Object{
    // Quale visibilità hanno gli attributi in questo momento  ?
    private String nome;
    private String cognome;
    private Date dataNascita;
    private double altezza;
    private int peso;
    private StatoCivile statoCivile;

    public Persona(String nome, String cognome, Date dataNascita, double altezza, int peso, StatoCivile statoCivile) {
        this.nome = nome;
        this.cognome = cognome;
        this.dataNascita = dataNascita;
        this.altezza = altezza;
        this.peso = peso;
        this.statoCivile = statoCivile;
    }

    public StatoCivile getStatoCivile() {
        return statoCivile;
    }

    // nome , parametri in ingresso, tipo di ritorno
    public double getAltezza() {     //180 -> 180.0 / 100 _ > 1.8
        return this.altezza;  //180
    }
    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }
    public Date getDataNascita() {
        return dataNascita;
    }

    public void setAltezza(double altezza) {
        if (altezza < 210)
            this.altezza = altezza;
        else
            System.out.println("Altezza non ammessa");
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setStatoCivile(StatoCivile statoCivile) {
        this.statoCivile = statoCivile;
    }


}