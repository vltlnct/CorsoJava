package com.prodotti;



import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


/*
 Nel caso di Elettronico implemento soltanto l'interfaccia Comparable ed applico
 la ereditarietà multipla. In questo caso il metodo da implementare si trova quindi nella stessa classe
 Elettronico
 */

public class Elettronico extends Prodotto implements Comparable<Elettronico> {



    private String classeEnergetica;

    public Elettronico(String codice, Date dataIngresso, String nome, String produttore, String classeEnergetica) {
        super(codice, dataIngresso, nome, produttore);
        this.classeEnergetica = classeEnergetica;
    }

    public Elettronico(String codice, Date dataIngresso, String nome, String produttore) {
        super(codice, dataIngresso, nome, produttore);
    }

    public String getClasseEnergetica() {
        return classeEnergetica;
    }


    /*
     Inserendo il metodo di Compartor nella stessa classe, possiamo poi richiamare  anche ArrayList.sort() con
     la sintassi qui sotto, inidcando cioè il metodo compareTo(Elettronico o) implementato sotto
     */
    public static void ordinaPerClasseEnergetica(ArrayList<Elettronico> lista)
    {
        lista.sort(Elettronico::compareTo);
    }

    @Override
    public int compareTo(Elettronico o) {

        return this.getClasseEnergetica().compareTo(o.getClasseEnergetica());
    }

    @Override
    public String toString() {
        return "Elettronico{" +
                "classeEnergetica='" + classeEnergetica + ", " +
                 super.toString() + "} ";
    }
}
