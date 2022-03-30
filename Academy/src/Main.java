import com.compuni.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        StatoCivile st = new StatoCivile();

        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 2022);
        cal.set(Calendar.MONTH, Calendar.MARCH);
        cal.set(Calendar.DAY_OF_MONTH, 24);
        Date dataAttuale = cal.getTime();

        GestioneUniversita gu = new GestioneUniversita(100);

/*        String nome;
        String cognome;
        String tipo;
        Scanner tastiera = new Scanner(System.in);
        int i=0;
        do {
            tipo = tastiera.nextLine();
            if (tipo.compareTo("fine")!=0) {
                nome = tastiera.nextLine();
                cognome = tastiera.nextLine();
                if (tipo.compareTo("Docente") == 0) {
                    gu.addComponente(new Docente(nome, cognome, dataAttuale, 183, 84, st, "AAAAAA", "aaaa"));
                }
                if (tipo.compareTo("Studente") == 0) {
                    gu.addComponente(new Studente(nome, cognome, dataAttuale, 175, 63, st, "xxxx"));
                }
            }
        } while (tipo.compareTo("fine")!=0);*/


        gu.addComponente(new Studente("Paolo","Rossi",dataAttuale,175,63,st,"xxxx"));
        gu.addComponente(new Studente("Marco","Verdi",dataAttuale,180,72,st,"yyyy"));
        gu.addComponente(new Studente("Mauro","Bianchi",dataAttuale,180,72,st,"yyyy"));
        gu.addComponente(new Docente("Giulio","Verdi",dataAttuale,180,71,st,"BBBBBB","bbbb"));
        gu.addComponente(new Docente("Paolo","Bianchi",dataAttuale,185,85,st,"CCCCCC","cccc"));
        gu.addComponente(new Docente("Giulio","Bianchi",dataAttuale,188,62,st,"EEEEEE","dddd"));

       for (int j=0; j<gu.getDimensione(); j++)
       {

           Studente referencePers = (Studente) gu.getComponente(j);
           System.out.println( referencePers.getCognome() );

/*           if ( gu.getComponente(j) instanceof Studente) {
               System.out.println("Ho trovato una istanza della classe Studente");
    *//*               Studente oggettoCorrente = (Studente) gu.getComponente(j);
               System.out.println( oggettoCorrente.getMatricola() );*//*
           }
           if ( gu.getComponente(j) instanceof Docente) {
               System.out.println("Ho trovato una istanza della classe Docente");
*//*               Docente oggettoCorrente = (Docente) gu.getComponente(j);
               System.out.println( oggettoCorrente.getCodFiscale() );*//*
           }*/

       }



    }
}
