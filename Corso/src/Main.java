import com.compuni.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        ListaComponenti l = new ListaComponenti(10);

        l.addComponente( new Persona("Marco", "Neri", 30));
        l.addComponente( new Studente("Paolo", "Rossi", 30));
        l.addComponente( new Studente("Franco", "Verdi", 30));
        l.addComponente( new Docente("Maria", "Gialli", 45, "Italiano"));
        l.addComponente( new Docente("Piero", "Blu", 50, "Informatica"));
        l.ordinaPerCognome();
        System.out.println("Lista Ordinata : "+l);

/*        l.sort(new OrdinaPerCognome());
        System.out.println("Lista Ordinata : "+l);
/*






// Argomento : confronto tra valori e oggetti
        int a = 1;
        System.out.println(a == 1);
        char c = 'A';
        System.out.println(c == 'A');
        // Ciao>Cian => 1     Ciao=Ciao => 0   Ciao<Ciap => -1
        String st1 = new String("Ciao");
        System.out.println(st1.compareTo("Cian"));
        System.out.println(st1.compareTo("Ciao"));
        System.out.println(st1.compareTo("Ciap"));

        // Confronto tra oggetti
        String st4 = new String("Ciao");
        String st5 = st4;
        String st6 = new String("Cian");

        System.out.println(" st4.equals('Ciao') :" + st4.equals("Ciao"));
        System.out.println(" st4.equals(st5) :" + st4.equals(st5));
        System.out.println(" st4.equals(st6) :" + st4.equals(st6));

        Persona p1 = new Persona("Marco", "Neri", 30);
        Persona p2 = new Persona("Marco", "Neri", 30);
        System.out.println(" p1 == p2 : " + (p1 == p2));
        System.out.println(" p1.equals(st4) :" + p1.equals(st4));*/
    }
}
