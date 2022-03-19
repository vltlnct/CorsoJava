// Indovina output (medio) : stampa la sequenza -> 9 6 3 2
public class IndovinaOutput2 {

    public static void main(String[] arg) {
        int Numero = 18;
        for (int i = 2; i <= Numero-1; i++) {
            if ((Numero % i) == 0) {
                System.out.println(Numero/i);
            }
        }
    }


}
