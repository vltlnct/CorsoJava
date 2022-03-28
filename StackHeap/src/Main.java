class Persona{
    public String nome = new String();
    public String cognome = new String();

    public Persona(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
    }
}

/*
 L'esempio, opportunamente eseguito nel debug dove viene visualizzata la memoria Stck e memoria Heap,
 serve a dimostrare il comportamento di questi due spazi di memoria.
 Viene inoltre evidenziata l'importanza dell'azione di Garbage Collection avviata dall JVM, una volta
 che si rende necessario ripulire lo spazio Heap da istanze non più referenziate.
 System.gc() è una funzione a disposizione del programmatore per invocare la funzione di Garbage Collection
 senza attendere l'intervento "asincrono" della JVM
 */

public class Main {
    public static void funzione1(int x, String s) {
        Persona p = new Persona("Mario", "Neri");
        int y=2;
        System.out.println(x*y);
        System.out.println(s);
        funzione2(x*y);
    }

    public static void funzione2(double x) {
        double y = 2;
        System.out.println(x/y);
    }

    public static void main(String[] args) {
        for (int i=0; i<args.length; i++)
            System.out.println(args[i]);

        int a;
        a = 15;
        double b;
        b = 10.5;
        String s = new String("Ciao a tutti");
        Persona p1 = new Persona("Paolo", "Rossi");
        Persona p2 = new Persona("Giulio", "Verdi");
        // un metodo della classe Main
        funzione1(a, s);

        /*
         Richiamo il Garbage Collector della JVM (funzioen System.gc() ) per ripulire l'Heap dall'istanza Persona("Mario", "Neri")
         allocata in funzione1() e non più referenziata nello stack (il puntatore p è stato eliminato insieme
         al record di attivazione)
         */
        System.gc();
        p1 = null;
        /*
         Richiamo Garbage Collector della JVM ( funzione System.gc() ) per ripulire l'Heap dall'istanza Persona("Paolo", "Rossi")
         allocata nel main() e non più referenziata dal puntatore p1. A quest'ultimo infatti è stato assegnato il valore
         "null" , ed equivale ad eliminare il riferimento nello Stack all'istanza nell'Heap
         */
        System.gc();
        p2 = null;
    }
}

