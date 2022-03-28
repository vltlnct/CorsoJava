package com.compuni;

/*
package com.partecipanti;
import com.anagrafica.Persona;

java.lang.Object
      com.compuni.Persona
            com.compuni.Studente
*/

public class Studente extends Persona {
    // Studente eredita variabili e metodi da Persona

    Integer matricola;        // Nuova variabile istanza
    String pianoDiStudio; // Nuova variabile istanza

    // Nuova variabile statica (di classe)
    static int nextMatricola = 1;

    // Costruttore
    public Studente(String nome, String cognome, int eta) {
        /*
         pur non essendo nello stesso package, dato che nome è stato dichiarato protected,
         è accessibile anche da una sotto-classe non appartetente allo stesso package
         */
        this.nome = nome;
        this.cognome = cognome;
        this.matricola = nextMatricola++;
        this.eta = eta;
        this.pianoDiStudio = "";
    }

    public Studente() {
        this("aaaa","bbbb",00);
        this.matricola = nextMatricola++;
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
