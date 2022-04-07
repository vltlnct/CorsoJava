package esempi.generics;
import java.util.Comparator;

//public class OrdinaPerCodice implements Comparator<Prodotto> {
public class OrdinaPerCodice implements Comparator {
    /*
    Questo metodo effettua l'override del metodo  int compare(o1,o2)
    che verrà richiamato dal metodo ArrayList.sort(Comparator<? super E> c)
   */

    @Override
    public int compare(Object o1, Object o2) {
        return ((Prodotto)o1).getCodice().compareTo(((Prodotto)o2).getCodice());
    }
}
