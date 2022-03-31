package com.prodotti;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;

/*
 nei casi di Alimento utilizzo due volte l'interfaccia Comparator per realizzare due diversi
 criteri di ordinamento : uno sulla data di scadenza e uno sulla data di ingresso in magazzino
 */
class OrdinaDataScadenza implements Comparator<Alimento> {
    /*
   Questo metodo effettua l'override del metodo  int compare(o1,o2)
   che verrà richiamato dal metodo ArrayList.sort(Comparator<? super E> c)
    */
    @Override
    public int compare(Alimento o1, Alimento o2) {
        return o2.getScadenza().compareTo(o1.getScadenza());
    }
}
class OrdinaDataIngresso implements Comparator<Alimento> {
    /*
    Questo metodo effettua l'override del metodo  int compare(o1,o2)
    che verrà richiamato dal metodo ArrayList.sort(Comparator<? super E> c)
     */
    @Override
    public int compare(Alimento o1, Alimento o2) {
        return o2.getProvenienza().compareTo(o1.getProvenienza());
    }
}


public class Alimento extends Prodotto  {

    private Date scadenza;
    private String provenienza;


    //Alimenti,A001,27/03/2022,Pollo,Amadori,01/05/2022,Italia,
    public Alimento(String codice, Date dataIngresso, String nome, String produttore, Date scadenza, String provenienza) {
        super(codice, dataIngresso, nome, produttore);
        this.scadenza = scadenza;
        this.provenienza = provenienza;
    }

    public Date getScadenza() {
        return scadenza;
    }

    public String getProvenienza() {
        return provenienza;
    }


    public static void ordinaPerDataScadenza(ArrayList<Alimento> lista)
    {
        lista.sort(new OrdinaDataScadenza());
    }
    public static void ordinaPerDataIngresso(ArrayList<Alimento> lista)
    {
        lista.sort(new OrdinaDataIngresso());
    }


}
