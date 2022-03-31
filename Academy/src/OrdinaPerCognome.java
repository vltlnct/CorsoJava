import com.compuni.Persona;

import java.util.Comparator;

public class OrdinaPerCognome implements Comparator<Persona> {

        /*
        Questo metodo effettua l'override del metodo  int compare(o1,o2)
        che verrà richiamato dal metodo ArrayList.sort(Comparator<? super E> c)
         */
        @Override
        public int compare(Persona o1, Persona o2) {

            return o1.getCognome().compareTo(o2.getCognome());
        }
}
