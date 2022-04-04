package esempi.eccezioni;
import java.util.Scanner;

public class Sqrt {

    // calcola la radice quadrata di x, se e' positivo
    public static double sqrt(double x) {

        // lancia un'eccezione se il parametro attuale e' illegale
        if (x < 0)
            throw new IllegalArgumentException("sqrt: " + x);

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
/*                // Se voglio gestire l'eccezione inserisco il blocco try-catch
                try {*/
                    System.out.println(sqrt(x));
/*                } catch (IllegalArgumentException e) {
                    System.out.println("Errore : l'argomento della radice è negativo");
                }*/
            }
        } while(x != 0);
    }
}
