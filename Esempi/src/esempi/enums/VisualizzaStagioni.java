package esempi.enums;

public class VisualizzaStagioni {
    public static void main(String [] args) {
        Stagione stagione = Stagione.PRIMAVERA;

/*        switch(stagione) {
            case PRIMAVERA:
                System.out.println("Siamo in Primavera");
                break;
            case ESTATE:
                System.out.println("Siamo in Estate");
                break;
            case AUTUNNO:
                System.out.println("Siamo in Autunno");
                break;
            case INVERNO:
                System.out.println("Siamo in Inverno");
                break;
        }*/

/*        System.out.println("Iterazione foreach");
        // Operazione di iterazione con costrutto foreach
        for( Stagione d : Stagione.values() ) {
            System.out.println(d);
        }
        */

        System.out.println("Conversione di stringhe in enum");
        // Conversione di stringhe in valori del nostro enum:
        Stagione s1 = Stagione.valueOf("PRIMAVERA");
        System.out.println(s1);
        // Questo non funziona !!!
        //g = Stagione.valueOf("PRIMAVERAAAA");

        System.out.println("Tabella delle temperature per stagione ");
        for( StagioneConValori e : StagioneConValori.values() ) {
            System.out.printf("%s\t%d°\n", e, e.getGradiCentigradi());
        }

    }
}
