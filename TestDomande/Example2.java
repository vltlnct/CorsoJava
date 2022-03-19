/*
 trova errore - Risposta : il ciclo iterativo dentro la funzione primo(), usato per
 verificare se il numero è primo, deve partire da 2
 */


public class Example2 {
    private static boolean primo(int Numero) {
        for (int i = 1; i <= Numero-1; i++) {
            if ((Numero % i) == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] arg) {
        if (primo(11)) {
            System.out.println("Il numero è primo");
        } else{
            System.out.println("Il numero non è primo");
        }
    }

}
