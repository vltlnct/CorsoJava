import com.geststream.GestioneFile;
import com.prodotti.*;
import com.prodotti.Elettronico.Elettronico;

import java.text.ParseException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws ParseException {
        // write your code here
        GestioneFile g = new GestioneFile("input.txt","JSON_Prodotti.txt");
        GestioneProdotti gestioneProdotti;

//        gestioneProdotti = new GestioneProdotti(g.leggiFileTesto());
        gestioneProdotti = new GestioneProdotti(g.leggiStream());
        ArrayList listaProdotti = gestioneProdotti.getListaProdotti();

        System.out.println("\n\nOrdinamento di tutti i prodotti per codice\n");
        gestioneProdotti.sort();

        // Uso di JSON
        String conVJSON = gestioneProdotti.toJSON();
        g.scriviFileJSON(conVJSON);
        /*
        ArrayList<Alimentare> l = gestioneProdotti.getListaAlimenti();
        */
        ArrayList<Elettronico> e = gestioneProdotti.getListaElettronici();
        Elettronico.ordinaPerClasseEnergetica(e);
        for (Elettronico elementoCorrente: e){
                System.out.println( elementoCorrente);
        }
    }
}
