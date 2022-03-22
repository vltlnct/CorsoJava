public class Main {
    public static void main(String[] args) {
            System.out.println("Lettura delle stringhe in ingresso");
            int[] listaNumeri = new int[args.length];
            int somma = 0;
            for (int i=0; i < args.length; i++) {
                listaNumeri[i] = Integer.parseInt(args[i]);
                System.out.println("Hai inserito in input : " + listaNumeri[i]);
                somma += listaNumeri[i];
            }
            System.out.println("Somma finale : " + somma);
     }

}
