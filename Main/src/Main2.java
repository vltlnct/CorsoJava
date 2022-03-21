import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {

        int[] listaValori = new int[args.length];

        System.out.println("Lettura delle stringhe in ingresso");
        for (int i=0; i < args.length; i++) {
            System.out.println("Hai inserito in input : " + args[i]);
            listaValori[i] =  Integer.parseInt(args[i]);
        }
        System.out.println("Lettura delle stringhe in ingresso : "+"{"+ Arrays.deepToString(args) + "}");


        if (args.length > 0) {
            try {
                String param = args[0].substring(0, 2);
                if (param.compareTo("-s") == 0) {
                    String sceltaCiclo = param = args[0].substring(2, args[0].length());
                    System.out.println("L'opzione -s ha come parametro : " + sceltaCiclo);
                }
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Input errato nella opzione -s. ");
                System.out.println("-s<for> , -s<while>, -s<dowhile>");
            }

        }
    }
}
