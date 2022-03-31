package com.compuni;

/*
package com.partecipanti;
import com.anagrafica.Persona;

java.lang.Object
      com.compuni.Persona
            com.compuni.Studente
*/

import java.util.Objects;

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
        super(nome, cognome, eta);
        this.matricola = nextMatricola++;
        this.pianoDiStudio = "";
    }

    public Studente() {
        this("aaaa","bbbb",00);
    }

    // Nuovo metodo
    public String getPdS() {
        return pianoDiStudio;
    }

    // Nuovo metodo
    public void modificaPdS(String nuovoPdS) {
        pianoDiStudio += nuovoPdS + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Studente)) return false;
    //    if (!super.equals(o)) return false;
        Studente studente = (Studente) o;
        return Objects.equals(matricola, studente.matricola);
    }

    @Override
    public int hashCode() {
        return Objects.hash(matricola);
    }
}
