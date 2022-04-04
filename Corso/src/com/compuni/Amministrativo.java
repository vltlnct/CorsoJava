package com.compuni;

public class Amministrativo extends Persona{
    private String dataAssunzione;

    public Amministrativo(String nome, String cognome, int eta, String dataAssunzione) {
        super(nome, cognome, eta);
        this.dataAssunzione = dataAssunzione;
    }

    public String getDataAssunzione() {
        return dataAssunzione;
    }
}
