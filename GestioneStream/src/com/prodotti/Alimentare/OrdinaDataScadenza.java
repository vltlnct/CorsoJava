package com.prodotti.Alimentare;

import java.util.Comparator;

/*
 nei casi di Alimentare utilizzo due volte l'interfaccia Comparator per realizzare due diversi
 criteri di ordinamento : uno sulla data di scadenza e uno sulla data di ingresso in magazzino
 */
public class OrdinaDataScadenza implements Comparator<Alimentare> {
    /*
   Questo metodo effettua l'override del metodo  int compare(o1,o2)
   che verrà richiamato dal metodo ArrayList.sort(Comparator<? super E> c)
    */
    @Override
    public int compare(Alimentare o1, Alimentare o2) {
        return o2.getScadenza().compareTo(o1.getScadenza());
    }
}