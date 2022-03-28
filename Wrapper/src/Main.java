class Persona{
    public String nome = new String();
    public String cognome = new String();

    public Persona(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
    }
}

public class Main {
    public static void Funzione1(int x, String s) {
        Persona p = new Persona("Mario", "Verdo");
        int y=2;
        System.out.println(x*y);
        System.out.println(s);
        Funzione2(x*y);
    }

    public static void Funzione2(double x) {
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
        Persona p2 = new Persona("Paolo", "Rossi");
        // un metodo della classe Main
        Funzione1(a, s);

        p1 = null;
        p2 = null;

        System.gc();

/*        // Uso il nome della classe Main
        Main.Funzione1(a);
        Main.Funzione2(b);

        // Uso una istanza della classe Main
        Main m = new Main();
        m.Funzione1(a);
        m.Funzione2(10.5);*/


//        Stringa.addio();

    }
}

