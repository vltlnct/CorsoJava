import com.geststream.GestioneFile;
import com.prodotti.*;

import java.text.ParseException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws ParseException {
        // write your code here
        GestioneFile g = new GestioneFile("input.txt","JSON_Prodotti.txt");
        GestioneProdotti gestioneProdotti = new GestioneProdotti(g.leggiFileTesto());

        ArrayList listaProdotti = gestioneProdotti.getListaProdotti();

//        gestioneProdotti.ordinaPerCodice();
        gestioneProdotti.ordinamentoIngenuo();

        // Uso di JSON
        String conVJSON = gestioneProdotti.toJSON();
        g.scriviFileJSON(conVJSON);


        /*
        ArrayList<Alimento> l = gestioneProdotti.getListaAlimenti();
        Alimento*/

        ArrayList<Elettronico> e = gestioneProdotti.getListaElettronici();
        Elettronico.ordinaPerClasseEnergetica(e);

        for (Elettronico elementoCorrente: e){
                System.out.println( elementoCorrente);
        }


    }
}
