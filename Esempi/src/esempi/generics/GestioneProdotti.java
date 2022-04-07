package esempi.generics;

import esempi.enums.TavolaPeriodica;

import java.util.ArrayList;
import java.util.Collections;

public class GestioneProdotti {
        public static void main(String[] args) {
            ArrayList lista = new ArrayList();

            lista.add(new Prodotto("003", "Bicchieri"));
            lista.add(new Prodotto("002", "Bottiglia"));
            lista.add(new Prodotto("001", "Tovaglia"));
            lista.add(new Prodotto("004", "Forchetta"));
            lista.add("Forchetta");

/*            lista.sort(new OrdinaPerCodice());
            System.out.println(lista);*/

            // Ordino l'ArrayList usando l'interfaccia Comparable che ho impkemenato in prodotto
            Collections.sort(lista);
            System.out.println(lista);
            System.out.println();

            for (int i=0; i< lista.size(); i++) {
                Prodotto e = (Prodotto)lista.get(i);
                System.out.printf("%s\t\t|\t%s\n", e.getCodice(), e.getNome());
            }
/*            System.out.println();
            for( Prodotto e : lista ) {
                System.out.printf("%s\t\t|\t%s\n", e.getCodice(), e.getNome());
            }*/
        }


}
