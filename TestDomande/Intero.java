/*
trova errore - Risposta : il metodo statico incrementa() prova ad utilizzare una
varibile con access modifiers private
 */
public class Intero {
    private int x;
    public Intero(int x) { this.x = x; }
}
class ProvaIntero {
    public static void main(String[] arg) {
        Intero q = new Intero(19);
        incrementa(q);
    }

    private static void incrementa(Intero q){
 //       q.x++;
    }
}


