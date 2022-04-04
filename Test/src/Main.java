import com.compuni.*;

import java.util.Scanner;

public class Main {
    public static void ordinamentoCognome1(ListaComponenti l){
        // Ordinamento per Cognome senza interfacce
        l.ordinaPerCognome();
        System.out.println("Lista Ordinata : "+l);
    }

    public static void ordinamentoCognome2(ListaComponenti l){
        // Ordinamento per Cognome tramite interfaccia implementata con classe esterna
        // Implementazione tramite interfaccia esterna
        l.sort(new OrdinaPerCognome());
        System.out.println("Lista Ordinata : "+l);
    }

    // Esercizio 3.2
    public static void ordinamentoPerDataAssunzione1(ListaComponenti l) {
        // Ordinamento per Data Assunzione senza interfacce
        // Inserire il codice qui ...

    }
    public static void ordinamentoPerDataAssunzione2(ListaComponenti l) {
        // Ordinamento per Data Assunzione tramite interfaccia implementata con classe esterna
        // Inserire il codice qui ...
    }


    public static void main(String[] args) {
        ListaComponenti listaTotale = new ListaComponenti(10);

        listaTotale.addComponente(new Persona("Marco", "Neri", 30));
        listaTotale.addComponente(new Studente("Paolo", "Rossi", 30));
        listaTotale.addComponente(new Studente("Franco", "Verdi", 35));
        listaTotale.addComponente(new Studente("Giulio", "Bianchi", 32));
        listaTotale.addComponente(new Docente("Maria", "Gialli", 45, "Italiano"));
        listaTotale.addComponente(new Docente("Piero", "Blu", 50, "Informatica"));
        /*
         Esercizio 1 - Creare opportunamente una nuova classe Amministrativi con l'informazione dataAssunzione come
         attributo aggiuntivo. Decidere autonomamente il tipo dell'attributo
        */
        listaTotale.addComponente(new Amministrativo("Claudio", "Zeta", 50, "01/01/2019"));
        listaTotale.addComponente(new Amministrativo("Giulia", "Beta", 50, "01/01/2021"));
        listaTotale.addComponente(new Amministrativo("Giovanni", "Alfa", 50, "01/01/2020"));
        listaTotale.addComponente(new Amministrativo("Claudia", "Gamma", 50, "01/01/2018"));

        ordinamentoCognome1(listaTotale);
        //ordinamentoCognome2(listaTotale);

        ListaComponenti listaAmministrativi = new ListaComponenti(5);

        /* Esercizio 2
         Estrarre dalla lista  listaTotale soltanto gli Amministrativi ed inserirli
         nella nuova lista listaAmministrativi
        */
        // Inserire il codice qui per estrazione componenti Amministrativi


        /* Esercizio 3.1
         Completare i metodi statici

            static void OrdinamentoPerData1(ListaComponenti l)
            static void OrdinamentoPerData2(ListaComponenti l)

         affinchè venga realizzato l'ordinamento per Data di Assunzione dei soli componenti Amministrativi
         utilizzando le tre modalità già viste per gli ordinamenti sui cognomi
            1) senza interfacce
            2) con interfaccia implementata con classe esterna
        */

        // Inserire il codice qui per richiamare i metodi statici


    }
}
