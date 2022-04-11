package esempi.hash;


import java.util.HashSet;

public class GestCustomer {

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
//        Customer max2 = max1;

        Customer max3 = new Customer( "Marco Verdi", 220.0, "mrcvrd4321" );

        System.out.println( " == : " + (max1 == max2) );
        System.out.println( "Equals: " + max1.equals( max2 ) );
        System.out.println( "Max1 hashCode:" + max1.hashCode() );
        System.out.println( "Max2 hashCode:" + max2.hashCode() );
        System.out.println( "Max3 hashCode:" + max3.hashCode() );

        System.out.println( "Equals: " + max1.equals( max3 ) );
        System.out.println( "Max1 hashCode:" + max1.hashCode() );


         /*
         Ricordando ora che gli elementi inseriti in una HashSet devono essere unici rispetto
         alla chiave utilizzata nella funzione hash, verifichiamo ora se entrambi i libri vengono
         inseriti nella HashSet hs,
         */
        System.out.println( "\nInserimento in una HashSet \n");

        HashSet<Customer> hs = new HashSet<>();
        hs.add(max1);
        hs.add(max2);
        hs.add(max3);

        for(Customer c : hs){
            System.out.println(c.getCodiceFiscale()+ " "+ c.getNominativo() + " hashCode " + c.hashCode());
        }

    }
}
