package esempi.eccezioni;
import java.io.IOException;
import java.util.Scanner;

public class Sqrt {

    // calcola la radice quadrata di x, se e' positivo
    public static double sqrt(double x) throws IOException {
        // lancia un'eccezione se il parametro attuale e' illegale
        if (x < 0)
        /*
            Sono non controllate tutte le eccezioni che estendono Error e RuntimeException
            Sono controllate (dal compilatore) tutte le altre eccezioni.
            Vedere alberatura
                    http://pages.di.unipi.it/corradini/Didattica/LIP-07/Eccezioni/TryCatch/main.html#:~:text=La%20clausola%20throws%20viene%20inserita,gestione%20viene%20delegata%20al%20chiamante.

         */
           // throw new IllegalArgumentException("sqrt: " + x);

                throw new IOException("sqrt: "+ x);



        return Math.sqrt(x);
    }


    public static void main(String [] args) {
        double x;
        Scanner tastiera = new Scanner(System.in);
        do {
            System.out.print("Scrivi un intero (0 per finire): ");
            x = tastiera.nextDouble();
            if (x != 0) {
                System.out.println("Risultato di sqrt("+x+"):");
               // Se voglio gestire l'eccezione inserisco il blocco try-catch

                try {
                    System.out.println(sqrt(x));
/*                } catch (IllegalArgumentException e) {
                    System.out.println("Errore : l'argomento della radice è negativo");
                }*/
                // se il metodo sqrt genera una IOException sono costretto a gestirla
                // o con un Try{} catch{}
                // o sollevandola da questo metodo inserendo il throws sul metodo


                } catch (IOException e) {
                    e.printStackTrace();
                    System.out.println("Errore : l'argomento della radice è negativo");
                }
            } while(x != 0);
    }
}
