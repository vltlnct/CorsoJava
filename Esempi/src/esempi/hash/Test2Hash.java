package esempi.hash;
import java.util.*;

// Primo uso di una HashMap
// Esempio per la gestione dei metodi: put(), get(),  keySet(), values(), entrySet()

class Bilancio implements Comparable<Bilancio> {
    private String nominativo;
    private double valore;

    public Bilancio(String nominativo, double valore) {
        this.nominativo = nominativo;
        this.valore = valore;
    }
    public String getNominativo() {
        return nominativo;
    }
    public double getValore() {
        return valore;
    }

    @Override
    public boolean equals(Object obj) {
        // prima confronto gli oggetti
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;

            if (!(obj instanceof Bilancio)) return false;
            // Ora contronto gli attributi chiave dell'oggetto
            Bilancio altroBilancio = (Bilancio) obj;
            if (nominativo == null) {
                if (altroBilancio.nominativo != null)
                    return false;
            } else if (!nominativo.equals(altroBilancio.nominativo))
                return false;
            return true;
        }
    @Override
    public int hashCode() {
//        int code = ((nominativo == null) ? 0 : nominativo.hashCode());
        int code = Objects.hash(nominativo);
//        System.out.println("hashCode() -> Nome:[" + getNominativo() + "] hashCode:[" + code+"]");
        return code;
    }

    @Override
    public int compareTo(Bilancio o) {
        if (this.getNominativo()==null)
            return -1;
        if (o.getNominativo()==null)
            return -1;
        return  getNominativo().compareTo(o.getNominativo());
    }


    // Questi sono i comportamenti dei metodi di default degli oggetti padre
    /*
    @Override
    public boolean equals(Object obj) {
        return this.equals(obj);
    }

    @Override
    public int hashCode() {
        int code = super.hashCode();
        System.out.println("hashCode() -> [" + code+"]");
        return code;
    }

    */
}

public class Test2Hash {

    public static void main(String args[]) {
        // HashSet

        // Ricordiamoci che le HashSet per definizione non gestiscono chiavi ripetute...
        // Da qui facciamo alcune considerazioni su come vengono create le chiavi tramite le funzioni hash
        // Innanzi tutto dove sono le funzioni hash ?

        System.out.println("\n\nLa HashSet dei bilanci è : \n");

        HashSet<Bilancio> hs = new HashSet<>();
        hs.add(new Bilancio("Maria", 4367.34));
        hs.add(new Bilancio("Paolo", 95.43));
        hs.add(new Bilancio(null, 4367.34));
        hs.add(new Bilancio("Maria", 4367.34));
        hs.add(new Bilancio("Giulio", 1200.00));
        hs.add(new Bilancio("Claudia", 499.22));
        hs.add(new Bilancio("Marco", 78.48));
        hs.add(new Bilancio(null, 200.34));

        for(Bilancio b : hs){
            System.out.println(b.getNominativo()+ " "+ b.getValore());
        }

/*

        System.out.println("\n\nLa HashSet dei bilanci ordinata è : \n");
        TreeSet myTreeSet = new TreeSet(hs);
        for (Object entry : myTreeSet) {
            Bilancio obj = ((Bilancio)entry);
            System.out.println(" Nome:[" + obj.getNominativo() + "] Valore:[" + obj.getValore()+"]");
        }

*/

/*

        // HashMap
        System.out.println("\n\nLa HashSet dei bilanci è : \n");

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

*/

        // Come possiamo ordinare la HashMap
/*
        System.out.println("\n\nLa HashMap dei bilanci ordinata è : \n");
        TreeMap<Bilancio, String> sorted = new TreeMap<>();
        // Copy all data from hashMap into TreeMap
        sorted.putAll(hs);

        for (HashMap.Entry<Bilancio, String> entry : sorted.entrySet()) {
            Bilancio key = entry.getKey();
            Object value = entry.getValue();
            System.out.println(" Nome:[" + key.getNominativo() + "] Valore:[" + value+"]");
        }

        */

    }
}
