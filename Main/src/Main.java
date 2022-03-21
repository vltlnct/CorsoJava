public class Main {

    public static void main(String[] args) {
        if (args.length > 0) {

            String param = args[0].substring(0,2);
            if (param.equals("-s")) {
                String sceltaCiclo = param = args[0].substring(2,args[0].length());
                int indArgs=1;
                switch (sceltaCiclo) {
                    case "for":
                        System.out.println("Hai scelto il ciclo for");
                        for (; indArgs < args.length; indArgs++) {
                            System.out.println("Hai inserito in input : " + args[indArgs]);
                        }
                        break;
                    case "while":
                        System.out.println("Hai scelto il ciclo while");
                        while (indArgs < args.length) {
                            System.out.println("Hai inserito in input : " + args[indArgs]);
                            indArgs++;
                        }
                        break;
                    case "dowhile":
                        System.out.println("Hai scelto il ciclo do-while");
                        do {
                            System.out.println("Hai inserito in input : " + args[indArgs]);
                            indArgs++;
                        } while (indArgs < args.length);
                        break;
                    default:
                        System.out.println("Errore : non hai indicato il ciclo");
                        break;
                }
            } else {
                System.out.println("Non hai scelto nessun ciclo. Uso per default il ciclo for");
                for (int i=0; i < args.length; i++) {
                    System.out.println("Hai inserito in input : " + args[i]);
                }
            }
        } else {
                System.out.println("Non ci sono parametri ingresso");
        }
    }
}
