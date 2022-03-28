import com.compuni.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
        String st1 = new String("Ciao");
        String st2 = new String("a tutti");
        String st3 = " Ciao a tutti";
        System.out.println(st3.toString());

        Persona p1 = new Persona("Marco", " Neri", 30);
        Persona p2 = new Persona();
        System.out.println(p1.toString());
        System.out.println(p2.toString());


/*      java.lang.Object
            com.compuni.Persona
                com.compuni.Studente
*/

        Studente s1 = new Studente("Paolo", " Rossi", 30);
        Studente s2 = new Studente();
        System.out.println(s1.toString());
        System.out.println(s2.toString());


        Docente d1 = new Docente("Giulio", " Neri", 30, "Italiano");
        Docente d2 = new Docente();
        System.out.println(d1.toString());
        System.out.println(d2.toString());

        /*
        Studente s1 = new Studente("Paolo", "Rossi", 25);
        System.out.println(s1.nome);
        System.out.println(s1.matricola);
        */

        /*
         per usare l'attributo .nome quando dichiarato protected creo un metodo get(). Dove ?
         La cosa migliore è farlo in persona
         */

/*        Studente s2 = new Studente("Marco", " Neri", 30);
        System.out.println(s2.nome);
        System.out.println(s2.matricola);
        */




    //    Persona p3 = new Persona("Marco", " Neri");

/*
        p1.visualizza();
        p1.visualizza("Valore degli attributi dell'istanza p1 : ");
        p2.visualizza("Valore degli attributi dell'istanza p2 : ");
*/



    }
}
