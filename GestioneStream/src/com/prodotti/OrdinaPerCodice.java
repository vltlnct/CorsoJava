package com.prodotti;

import java.util.Comparator;

public class OrdinaPerCodice implements Comparator<Prodotto> {
    /*
    Questo metodo effettua l'override del metodo  int compare(o1,o2)
    che verrà richiamato dal metodo ArrayList.sort(Comparator<? super E> c)
     */
    @Override
    public int compare(Prodotto o1, Prodotto o2) {
        // usa il metodo compareTo di String
        return o2.getCodice().compareTo(o1.getCodice());
    }
}

