package esempi.hash;
import java.util.HashMap;
import java.util.HashSet;


public class Test1Hash {

    public static void main(String args[]) {
        // Vediamo la classe HashMap https://docs.oracle.com/javase/8/docs/api/java/util/HashMap.html
        // Creiamo una HashMap con i due parametri K e V
        HashMap<String, Double> acc_balance = new HashMap();
        // initialize the HashMap
        acc_balance.put("Maria", 443.0);
        acc_balance.put("Paolo", 95.43);
        acc_balance.put(null, 5.43);
        acc_balance.put("Giulio", 1200.00);
        acc_balance.put("Claudia", 499.22);
        acc_balance.put("Marco", 78.48);
        acc_balance.put("Maria", 4367.34);
        acc_balance.put(null, 54.43);
        System.out.println("La HashMap dei bilanci è : ");

        // Iterare la HashMap tramite la coppia chiave e valore:
        for (HashMap.Entry<String, Double> entry : acc_balance.entrySet() ) {
            String key = entry.getKey();
            Object value = entry.getValue();
            System.out.println("Nome:[" + key + "] Valore:[" + value+"]");

        }

        /*
        // Iterare la HashMap tramite la chiave
        for (String key : acc_balance.keySet()) {
            System.out.println("Nome :" + key);
        }
        // Iterare la HashMap tramite i valori
        for (Object value : acc_balance.values()) {
            System.out.println("Valore :" + value);
        }

        System.out.println();
        // Aggiorno il bilancio di Paolo aggiungendo 1000 al valore memorizzato.
        double balance = ((Double)acc_balance.get("Paolo")).doubleValue();
        hs.add("Paolo", balance + 1000);
        //print the contents of updated account
        System.out.println("Il bilancio di Paolo è: " + acc_balance.get("Paolo")+ "\n");

        // Iterare la HashMap tramite la coppia chiave e valore:
        for (HashMap.Entry<String, Double> entry : acc_balance.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            System.out.println("Nome:[" + key + "] Valore:[" + value+"]");

        }
        */

        // Usiamo ora una HashSet a cui passiamo un solo parametro
/*        HashSet<String> hs = new HashSet<>();
        // initialize the HashMap
        hs.add("Maria");
        hs.add("Paolo");
        hs.add(null);
        hs.add("Giulio");
        hs.add("Claudia");
        hs.add("Marco");
        hs.add("Maria");
        hs.add(null);
        System.out.println("\n\nLa HashSet dei Nomi è : ");

        for(String s : hs){
            System.out.println(s);
        }*/

    }

}
