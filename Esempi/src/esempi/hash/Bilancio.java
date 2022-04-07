package esempi.hash;
import java.util.Objects;

public class Bilancio {
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


    // Metodo equals realizza il contronto tra questa istanza dell'oggetto e l'oggetto passato

    /* Caso 1 - Non faccio override : richiamo super.equals()
     Il confronto avviene tra gli indirizzi delle istanze, quindi saranno tutti diversi, dato che
     ogni Object passato è di tipo Bilancio ed ogni istanza ha un suo puntatore
    */
    /* Caso 2 - Faccio override e restituisco false
      Tutti i valori verranno inseriti nella Set, senza alcun vincolo e controllo
    */
    /* Caso 3 - implemento un vero metodo di confronto tra particolari attributi della classe Bilancio
    Retituirò true o false sulla base del criterio che voglio adottare. Non verranno inseriti i duplicati
    */

    @Override
    public boolean equals(Object obj) {
        // Caso 1
        /*
         boolean ret =  super.equals(obj);
         return ret;
         */

        // Caso 2
        //return false;

        // Caso 3
        if (this == obj)  // se i due oggetti hanno puntatori uguali, sono certamente lo stesso oggetto
            return true;
        if (obj == null)  // se l'altro puntatore è null, è certamente diverso dall'oggetto corrente
            return false;

        // Ora contronto gli attributi chiave dell'oggetto
        Bilancio altroBilancio = (Bilancio) obj;
        if (nominativo == null) {
            if (altroBilancio.nominativo != null)
                return false;
        } else if (!nominativo.equals(altroBilancio.nominativo))
            return false;
        return true;
    }

    /*
      La funzione hashCode(), rispetto alla specifica in Javadoc del metodo hashCode() è opportuno
      che segua i criteri di confronto utilizzati in equals().
      Questo criterio garantirà anche la specifica dell' Set e delle HastSet che prevede l'unicità degli oggetti
      posti in questi insiemi.
      https://docs.oracle.com/javase/7/docs/api/java/util/HashSet.html#add(E)
      https://docs.oracle.com/javase/7/docs/api/java/util/Set.html
    */

    @Override
    public int hashCode() {
        int code = Objects.hash(nominativo);
        //Attenzione va tolta sovrascrittura per incoerenza con il metodo equals()
        code = super.hashCode();
        System.out.println("hashCode() -> Nome:[" + getNominativo() + "] hashCode:[" + code+"]");
        return code;
    }

}

