// Indovina output (facile): stampa il risultato 256
public class IndovinaOutput1 {
    public static void main(String[] arg) {
        int x = 8, y=2, z=1;
        for (int i = 1; i<=x; i++) {
            z = z * y;
        }
        System.out.println(z);
    }

}
