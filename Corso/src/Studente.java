
/*
package com.partecipanti;
import com.anagrafica.Persona;
*/

public class Studente extends Persona {
    // Studente eredita variabili e metodi da Persona

    int matricola;        // Nuova variabile istanza
    String pianoDiStudio; // Nuova variabile istanza

    // Nuova variabile statica (di classe)
    static int nextMatricola = 1;

    // Costruttore
    public Studente(String nome, String indirizzo) {
        /*
         pur non essendo nello stesso package, dato che nome è stato dichiarato protected,
         è accessibile anche da una sotto-classe non appartetente allo stesso package
         */
        this.nome = nome;
        this.indirizzo = indirizzo;
        this.matricola = nextMatricola++;
        this.pianoDiStudio = "";
    }

    // Nuovo metodo
    public String getPdS() {
        return pianoDiStudio;
    }

    // Nuovo metodo
    public void modificaPdS(String nuovoPdS) {
        pianoDiStudio += nuovoPdS + "\n";
    }

}
