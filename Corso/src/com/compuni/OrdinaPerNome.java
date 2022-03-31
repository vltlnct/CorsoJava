package com.compuni;

public class OrdinaPerNome implements Comparatore {
    /*
    Questo metodo effettua l'override del metodo  int compare(o1,o2)
    che verrà richiamato dal metodo ArrayList.sort(Comparator<? super E> c)
    -1 = minore
    0 = uguale
    1 = maggiore
    */
    @Override
    public int confrontaCon(Object o1, Object o2) {
        return  ((Persona) o1).getNome().compareTo(((Persona) o2).getNome());
    }
}