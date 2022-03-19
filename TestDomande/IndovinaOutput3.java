// Indovina output (difficile) : stampa le potenze di 2 -> 2 4 8 16 32 128
public class IndovinaOutput3 {
    public static void main(String[] arg) {
        int x = 1, y=255;
        for (int i = 0; i<8; i++) {
            System.out.println((y & x));
            x = x << 1;
        }
    }

}
