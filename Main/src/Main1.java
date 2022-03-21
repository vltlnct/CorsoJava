public class Main1 {
    public static void main(String[] args) {
        System.out.println("Lettura delle stringhe in ingresso");
        for (int i=0; i < args.length; i++) {
            System.out.println("Hai inserito in input : " + args[i]);
        }
        if (args.length > 0) {
            String param = args[0].substring(0,2);
            if (param.compareTo("-s") == 0) {
                String sceltaCiclo = param = args[0].substring(2, args[0].length());
                System.out.println("L'opzione -s ha come parametro : " + sceltaCiclo);
            }
        }
    }
}
