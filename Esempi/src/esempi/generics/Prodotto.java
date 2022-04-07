package esempi.generics;
import java.util.ArrayList;
import java.util.Date;
import java.util.Comparator;
import java.util.Objects;

// se non uso Generics dovro implementare un metodo il public int compareTo(Object o) a cui passo un Object
//public class Prodotto implements Comparable {

//public class Prodotto {
// Se invece uso Generics implementerò un metodo  public int compareTo(Prodotto o)  a cui passo un prodotto


public class Prodotto extends Object implements Comparable<Prodotto> {
    private String codice;
    private String nome;

    public Prodotto(String codice, String nome) {
        this.codice = codice;
        this.nome = nome;
    }

    public String getCodice() {
        return codice;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "\nProdotto {" + "codice='" + codice + '\'' +", nome='" + nome + '\'' +'}';
    }

    @Override
    public int compareTo(Prodotto o) {
        return o.getCodice().compareTo(this.getCodice());
    }
}
