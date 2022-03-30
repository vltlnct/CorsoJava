import com.geststream.GestioneFile;
import com.prodotti.*;

import java.text.ParseException;
import java.util.ArrayList;

public class Main {

    /*public static void leggiListaDiOggetti(){
            // write your code here
            GestioneFile g = new GestioneFile("input.txt", "JSON_Prodotti.txt");
            ArrayList righe = g.leggiFileTesto();

            System.out.println("--- Con il toString() nativo di ArrayList ---");
            System.out.println(righe);

            System.out.println("--- Con ciclo for ---");
            for (int i=0; i<righe.size(); i++)
                System.out.println(righe.get(i));

            System.out.println("--- Con each loop ---");
            for (Object elementoCorrente: righe)
                System.out.println(elementoCorrente);

            System.out.println("--- Con la classe Iterator ---");
            Iterator iteratore = righe.iterator();
            while (iteratore.hasNext())
                System.out.println(iteratore.next());
    }

    public static void leggiListaDiStringhe(){
        // write your code here
        GestioneFile g = new GestioneFile("input.txt","JSON_Prodotti.txt");
        ArrayList righe = g.leggiFileTesto();

        System.out.println("--- Con il toString() nativo di ArrayList ---");
        System.out.println(righe);

        System.out.println("--- Con ciclo for ---");
        for (int i=0; i<righe.size(); i++)
            System.out.println(righe.get(i));

        System.out.println("--- Con for each loop ---");
        for (Object elementoCorrente: righe)
            System.out.println(elementoCorrente);

        System.out.println("--- Con la classe Iterator ---");
        Iterator iteratore = righe.iterator();
        while (iteratore.hasNext())
            System.out.println(iteratore.next());

    }
*/
    public static void main(String[] args) throws ParseException {
        // write your code here
        GestioneFile g = new GestioneFile("input.txt","JSON_Prodotti.txt");
        GestioneProdotti gestioneProdotti = new GestioneProdotti(g.leggiFileTesto());

        ArrayList listaProdotti = gestioneProdotti.getListaProdotti();

//        gestioneProdotti.ordinaPerCodice();
        gestioneProdotti.ordinamentoIngenuo();


        String conVJSON = gestioneProdotti.toJSON();
        g.scriviFileJSON(conVJSON);

    }
}
