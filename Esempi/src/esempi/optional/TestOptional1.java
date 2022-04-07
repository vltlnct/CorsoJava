package esempi.optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

// https://www.javaboss.it/java-optional/

class Impiegato {
    private String id;
    private String nome;

    public Impiegato(String id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Impiegato() {

    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }
}

public class TestOptional1 {

    private List<Impiegato> impiegati = new ArrayList<Impiegato>();

    //  Questo esempio di funzione può restituire un valore null generando una
    //  eccezione NullPointerException
  /*
    public String searchNameById( String id ) {
        Impiegato result = null;
        for ( Impiegato impiegato : impiegati ) {
            if ( impiegato.getId().equalsIgnoreCase( id ) ) {
                result = impiegato;
                break;
            }
        }
        return result != null ? result.getNome() : null;
    }
    */


    public String searchNameById( String id ) {
        Optional<Impiegato> result = impiegati.stream()
                .filter( c -> c.getId().equalsIgnoreCase( id ) )
                .findFirst();
//       return result.get().getNnome();
        /*
        Si noti che il metodo findFirst() restituisce un tipo Optional sul quale invochiamo poi il get()
        per ottenere l’oggetto Customer in esso referenziato. Sfortunatamente il metodo get() invocato
        su un Optional empty restituisce l’eccezione NoSuchElementException, quindi di fatto non abbiamo
        risolto il nostro problema. Ci viene in aiuto il metodo isPresent() che restituisce true se il
        riferimento non è nullo per cui lo statement di return diviene:
        */
        return result.isPresent() ? result.get().getNome() : "UNKNOWN";

        /*
        Sebbene il codice sia ora perfettamente funzionante, risulta
        sicuramente poco elegante e certamente non in linea con la
        semplicità con cui è stato ricercato il valore richiesto
        utilizzando gli Stream. Fortunatamente la classe Optional
        presenta metodi che consentono di evitare l’utilizzo dei
        metodi get() e isPresent() e di produrre codice più “elegante”.
        Tali metodi sono tutti quelli della famiglia orElse() che
        consentono di restituire un valore di default o
        una eccezione specifica se l’oggetto Optional si riferisce
        ad un valore nullo. Ad esempio il metodo completo potrebbe essere:
        */

    /*
        return impiegati.stream()
                    .filter( c -> c.getId().equalsIgnoreCase( id ) )
                    .findFirst()
                    .orElseGet( Impiegato::new )
                    .getNome();
    */
    /*
            in cui nel caso di oggetto non trovato viene instanziato
            un oggetto Customer (di default) invocando il relativo
            costruttore, sul quale eseguire poi il metodo getName().
    */
    }

    public static void main(String args[]) {
        TestOptional1 test = new TestOptional1();
        test.impiegati.add(new Impiegato("001", "Paolo Rossi"));
        test.impiegati.add(new Impiegato("002", "Marco Neri"));
        test.impiegati.add(new Impiegato("003", "Giuilo Verdi"));


    }
}
