package com.prodotti;
import java.util.ArrayList;
import java.util.Date;
import java.util.Comparator;

class OrdinaPerCodice implements Comparator<Prodotto> {
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





public class Prodotto {
    private String codice;
    private Date dataIngresso;
    private String nome;
    private String produttore;


    public Prodotto(String codice, Date dataIngresso, String nome,  String produttore) {
        this.codice = codice;
        this.dataIngresso = dataIngresso;
        this.nome = nome;
        this.produttore = produttore;

    }

    public String getCodice() {
        return codice;
    }


    public static void ordinaPerCodice(ArrayList<Prodotto> lista)
    {
        lista.sort( new OrdinaPerCodice());
    }




    @Override
    public String toString() {
        return "Prodotto{" +
                "codice='" + codice + '\'' +
                ", dataIngresso=" + dataIngresso +
                ", nome='" + nome + '\'' +
                ", produttore='" + produttore + '\'' +
                '}';
    }
}
