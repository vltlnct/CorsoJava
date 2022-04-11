package esempi.hash;
import java.util.*;
public class Test2Hash {

    public static void main(String args[]) {
        // HashSet

        /*
        public booleano add( E  e)
        Aggiunge l'elemento specificato a questo set se non è già presente. Più formalmente, aggiunge
        l'elemento specificato e a questo insieme se questo insieme non contiene alcun elemento
        e2 tale che (e==null ? e2==null : e.equals(e2)).
        Se questo set contiene già l'elemento, la chiamata lascia il Set invariato e restituisce false.
        Quindi l'inserimento o meno del valore all'interno dalla HashSet dipende dal valore di
        ritorno del metodo equals(Object obj).
        */

        /*
         Analizzare il comportamento con Override del metodo public boolean equals(Object obj) di Bilancio

        // Ricordiamoci che per definizione le HashSet non gestiscono chiavi ripetute... su cosa è basato tale principio ?
        // Sul fatto che il metodo equals(Object o) ritorni true o false

        // Perchè su una HashSet di semplici stringhe non ho duplicati ? Perchè a classe String fa override
        // del metodo equals() (vedere Javadoc String.equals() )

        // Da qui facciamo alcune considerazioni su come vengono create le chiavi tramite le funzioni hash
        // Innanzi tutto dove sono le funzioni hash ?
        */

/*
        System.out.println("\n\nLa HashSet dei bilanci è : \n");

        HashSet<Bilancio> hs = new HashSet<>();
        hs.add(new Bilancio("Maria", 4367.34));
        hs.add(new Bilancio("Paolo", 95.43));
        hs.add(new Bilancio(null, 222.34));
        hs.add(new Bilancio("Maria", 12.34));
        hs.add(new Bilancio("Giulio", 1200.00));
        hs.add(new Bilancio("Claudia", 499.22));
        hs.add(new Bilancio("Marco", 78.48));
        hs.add(new Bilancio(null, 200.34));

        System.out.println("------");
        for(Bilancio b : hs){
            System.out.println(b.getNominativo()+ " - "+ b.getValore() + " - " + b.hashCode());
        }

        System.out.println("\n\nLa HashSet dei bilanci ordinata è : \n");
        TreeSet myTreeSet = new TreeSet(hs);
        for (Object entry : myTreeSet) {
            Bilancio obj = ((Bilancio)entry);
            System.out.println(" Nome:[" + obj.getNominativo() + "] Valore:[" + obj.getValore()+"]");
        }
*/



/*      public  V  put(  chiave K , valore V  )
        Associa il valore specificato alla chiave specificata in questa mappa.
        Se la mappa conteneva in precedenza una mappatura per la chiave, il
        vecchio valore viene sostituito.
*/
        // HashMap
        System.out.println("\n\nLa HashMap dei bilanci è : \n");
        HashMap<Bilancio, String> hs = new HashMap();
        hs.put(new Bilancio("Maria", 4367.34), "Roma");
        hs.put(new Bilancio("Paolo", 95.43), "Milano");
        hs.put(new Bilancio(null, 4367.34), "Torino");
        hs.put(new Bilancio("Maria", 4367.34), "Palermo");
        hs.put(new Bilancio("Giulio", 1200.00),"Napoli");
        hs.put(new Bilancio("Claudia", 499.22),"Venezia");
        hs.put(new Bilancio("Marco", 78.48),"Bologna");
        hs.put(new Bilancio(null, 200.34),"Firenze");

        System.out.println("\n\nLa HashMap dei bilanci è : \n");

        // Nella seguente visualizzazione della HashMap vediamo che i valori duplicati sono
        // stati eliminati dalla HashSet interna alla HashMap

        for (HashMap.Entry<Bilancio, String> entry : hs.entrySet()) {
            Bilancio key = entry.getKey();
            Object value = entry.getValue();
            System.out.println(" Nome:[" + key.getNominativo() + "] Valore:[" + value+"]");
        }

        // Come possiamo ordinare la HashMap una TreeMap
        System.out.println("\n\nLa HashMap dei bilanci ordinata è : \n");
        TreeMap<Bilancio, String> sorted = new TreeMap<>();
        // Copy all data from hashMap into TreeMap
        sorted.putAll(hs);

        for (HashMap.Entry<Bilancio, String> entry : sorted.entrySet()) {
            Bilancio key = entry.getKey();
            Object value = entry.getValue();
            System.out.println(" Nome:[" + key.getNominativo() + "] Valore:[" + value+"]");
        }


    }
}
