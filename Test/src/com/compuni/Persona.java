
package com.compuni;
/*
java.lang.Object
        com.compuni.Persona
*/

public class Persona  {
    // Quale visibilità hanno gli attributi in questo momento  ?
    private String nome;
    private String cognome;
    private int eta;

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



}