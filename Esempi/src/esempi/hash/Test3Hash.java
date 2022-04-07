package esempi.hash;

import java.util.Objects;

class Customer {
    private String nominativo;
    private Double conto;
    private String codiceFiscale;

    public Customer(String nominativo, Double conto, String codiceFiscale) {
        this.nominativo = nominativo;
        this.conto = conto;
        this.codiceFiscale = codiceFiscale;
    }

//https://docs.oracle.com/javase/7/docs/api/java/lang/Object.html#hashCode()
    /*
    Il motivo per cui ridefinire solamente uno dei due metodi non è sufficiente
    è ben spiegato nel javadoc del metodo hashCode() in cui è descritto il
    comportamento che tale metodo deve rispettare. Comportamento che può essere
    riassunto nei seguenti tre punti:
    1) Se invocato sullo stesso oggetto più di una volta durante un’esecuzione di
       un’applicazione Java, il metodo hashCode() deve restituire lo stesso valore intero,
       a condizione che non vengano modificate le informazioni utilizzate nel metodo equals().
       Non è necessario che tale valore intero rimanga coerente da un’esecuzione di un’applicazione
       a un’altra esecuzione della stessa applicazione.
    2) Se due oggetti sono uguali secondo il metodo equals(), invocare il metodo hashCode() su
       ciascuno dei due oggetti deve produrre lo stesso risultato intero.
    3) Non è necessario che il metodo hashCode() produca risultati distinti quando invocato su oggetti
       che risultino non uguali secondo il metodo equals(). Tuttavia restituire hash code distinti per
       oggetti non uguali può migliorare le prestazioni degli hash table.
     */

    // Caso 2
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof Customer)) {
            return false;
        }
        Customer customer = (Customer) o;
        return   customer.nominativo.equals(nominativo) &&
                 customer.codiceFiscale.equals(codiceFiscale);
    }

    // Caso 3
    public int hashCode() {
        int result = Objects.hash(nominativo, codiceFiscale);
        return result;
    }
}



public class Test3Hash {

    /*
     Caso 1 : Non applico nessun override. Comportamento coerente con i tre punti ma non applicandola
     ad un dominio reale. Infatti due persone sono diverse in base al Codice Fiscale
     */

    /*
     Caso 2 : override del metodo equals().
     Coerente rispetto ad una logica applicata ad un dominio reale, ma non rispetto alle specifiche Javadoc
     sul metodo. Infatti rispetto ai punti 2) e 3) non è rispettato.
     */

    /* Caso 3 : override del metodo equals() e hashCode()
     Ora è rispettata la logica applicativa e la specifica Javadoc, dato i metodi equals sono coerenti
     rispetto agli attributi usati nel confronto e nella generazione degli hashCode().
     */

    public static void main(String[] args) {
        Customer max1 = new Customer( "Paolo Rossi", 200.0, "palrss1234" );
        Customer max2 = new Customer( "Paolo Rossi", 200.0, "palrss1234" );

        Customer max3 = new Customer( "Marco Verdi", 220.0, "mrcvrd4321" );

        System.out.println( "Equals: " + max1.equals( max2 ) );
        System.out.println( "Max1 hashCode:" + max1.hashCode() );
        System.out.println( "Max2 hashCode:" + max2.hashCode() );

/*        System.out.println( "Equals: " + max1.equals( max3 ) );
        System.out.println( "Max1 hashCode:" + max1.hashCode() );
        System.out.println( "Max3 hashCode:" + max3.hashCode() );*/
    }
}
