package com.prodotti.Alimentare;

import java.util.Comparator;

public class OrdinaDataIngresso implements Comparator<Alimentare> {
    /*
    Questo metodo effettua l'override del metodo  int compare(o1,o2)
    che verrà richiamato dal metodo ArrayList.sort(Comparator<? super E> c)
     */
    @Override
    public int compare(Alimentare o1, Alimentare o2) {
        return o2.getProvenienza().compareTo(o1.getProvenienza());
    }
}
