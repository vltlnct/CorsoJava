import com.compuni.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

/*        Persona p1 = new Persona("Marco", " Neri", 30);
        Persona p2 = new Persona();
        System.out.println(p1.toString());
        System.out.println(p2.toString());

        Studente s1 = new Studente("Paolo", " Rossi", 30);
        Studente s2 = new Studente();
        System.out.println(s1.toString());
        System.out.println(s2.toString());

        Docente d1 = new Docente("Giulio", " Neri", 30, "Italiano");
        Docente d2 = new Docente();
        System.out.println(d1.toString());
        System.out.println(d2.toString());*/

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
        System.out.println(" p1.equals(st4) :" + p1.equals(st4));
    }
}
