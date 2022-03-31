import com.compuni.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        ListaComponenti l = new ListaComponenti(10);

        l.addComponente( new Persona("Marco", "Neri", 30));
        l.addComponente( new Studente("Paolo", "Rossi", 30));
        l.addComponente( new Studente("Franco", "Verdi", 35));
        l.addComponente( new Studente("Giulio", "Bianchi", 32));
        l.addComponente( new Docente("Maria", "Gialli", 45, "Italiano"));
        l.addComponente( new Docente("Piero", "Blu", 50, "Informatica"));

        /*
        l.ordinaPerCognome();
        System.out.println("Lista Ordinata : "+l);
        */

        // Implementazione tramite interfaccia esterna
        l.sort(new OrdinaPerCognome());
        System.out.println("Lista Ordinata : "+l);
/*
        // Ereditarietà multipla
        l.sort2();
        System.out.println("Lista Ordinata : "+l);
*/


    }
}
