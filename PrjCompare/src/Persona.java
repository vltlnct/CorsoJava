// package com.Oggetti;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Objects;

/*
package com.anagrafica;
*/

public class Persona extends Object{
    // Quale visibilità hanno gli attributi in questo momento  ?
    private String nome;
    private String cognome;
    private int eta; // anni
    private Date dataNascita;

    public Persona(String nome, String cognome,  int eta, String dataNascitaStr) {
        this.nome = nome;
        this.cognome = cognome;
        SimpleDateFormat formatter = new SimpleDateFormat("dd/mm/yyyy", Locale.ITALIAN);
        try {
            this.dataNascita = formatter.parse(dataNascitaStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        this.eta = eta;
    }

    public Persona(String nome, String cognome, int eta) {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
    }
/*
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Persona)) return false;
        Persona persona = (Persona) o;
        return eta == persona.eta && Objects.equals(nome, persona.nome) && Objects.equals(cognome, persona.cognome) && Objects.equals(dataNascita, persona.dataNascita);
    }
*/

/*
    @Override
    public String toString() {
        return "Persona{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", eta=" + eta +
                ", dataNascita=" + dataNascita +
                '}';
    }
}*/
