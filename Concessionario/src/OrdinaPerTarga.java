import java.util.Comparator;

public class OrdinaPerTarga implements Comparator<AutoVeicolo> {
    /*
    Questo metodo effettua l'override del metodo  int compare(o1,o2)
    che verrà richiamato dal metodo ArrayList.sort(Comparator<? super E> c)
     */
    @Override
    public int compare(AutoVeicolo o1, AutoVeicolo o2) {
        // usa il metodo compareTo di String
        return o1.getTarga().compareTo(o2.getTarga());
    }
}

