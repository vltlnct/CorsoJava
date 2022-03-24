/*import com.partecipanti.Studente;*/

public class Main {

    public static void main(String[] args) {
	// write your code here

        Studente s1 = new Studente("Paolo Rossi", "Corso Garibaldi 15");
        System.out.println(s1.nome);
        System.out.println(s1.matricola);
        /*
         per usare l'attributo .nome quando dichiarato protected creo un metodo get(). Dove ?
         La cosa migliore è farlo in persona
         */


        Studente s2 = new Studente("Marco Neri", "Via del Corso 1");
        System.out.println(s2.nome);
        System.out.println(s2.matricola);
    }
}
