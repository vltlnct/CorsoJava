
package com.compuni;
/*
java.lang.Object
        com.compuni.Persona
*/

import java.util.Objects;

public class Persona extends Object {
    // Quale visibilità hanno gli attributi in questo momento  ?
    protected String nome;
    String cognome;
    int eta;

    // signature o firma della funzione
    // <visibilità> <tipo di ritorno> <nome> <pamaetri in ingresso ...>
    public Persona(String nome, String cognome, int eta) {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
    }

    public Persona() {
        this("xxxx","yyyy",00);
   //     super("xxxx","yyyy",00);

    }

    public String getNome() {

        return nome;
    }

    public int getEta() {

        return eta;
    }

    public String getCognome() {
        return cognome;
    }

    @Override
    // signature o firma della funzione
    // <visibilità> <tipo di ritorno> <nome> <pamaetri in ingresso ...>
    public String toString() {
        String st = "Persona {" +
                "nome='" + this.nome + '\'' +
                ", cognome='" + this.cognome + '\'' +
                ", eta=" + this.eta +
                '}';
        return  st; //super.toString();

    }

    // signature o firma della funzione
    // <visibilità> <tipo di ritorno> <nome> <pamaetri in ingresso ...>

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Persona))
            return false;
        Persona persona = (Persona) o;
        boolean ret = this.getEta() == persona.getEta()
                && Objects.equals(getNome(), persona.getNome())
                && Objects.equals(getCognome(),
                persona.getCognome());
        return ret;
    }



    // Overloading
    // signature o firma della funzione
    // <visibilità> <tipo di ritorno> <nome> <pamaetri in ingresso ...>
    public void visualizza() {
        System.out.println("Nome: " + getNome() + " Cognome: " + getCognome() + " Eta :"+getEta());
    }
    // <visibilità> <tipo di ritorno> <nome> <pamaetri in ingresso ...>
    public void visualizza(String titolo) {
        System.out.println(titolo + "Nome: " + getNome() + " Cognome: " + getCognome() + " Eta :"+getEta());
    }

    // signature o firma della funzione
    // <visibilità> <tipo di ritorno> <nome> <pamaetri in ingresso ...>
    public boolean omonimo(Persona p) {
        return this.nome.equalsIgnoreCase(p.nome);
    }

}