package com.compuni;

import java.util.Date;
/*
java.lang.Object
        com.compuni.Persona
            com.compuni.Docente
*/

public class Docente extends Persona {
    private int codDocente;        // Nuova variabile istanza

    // Nuova variabile statica (di classe)
    static int nextCodDocente = 1;

    public Docente(String nome, String cognome, int eta, String materiaInsegnata) {
        super(nome, cognome, eta);
        this.codDocente = nextCodDocente++;
    }

    public Docente() {
        this("0000","0000",00,"0000");
        this.codDocente = nextCodDocente++;
    }
}
