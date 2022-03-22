import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // dichiaro tipi primitivi
        int valoreIntero = 10;
        double valoreDoppiaPrec = 10.5;
        float valoreFloat = 10.5F;
        boolean cond = true;
        char c = 65;
        int [] listaNumeri = new int[10];
        double [] d = new double[10];
        char[] str1 = new char[10];
        char[] str2 = new char[]{'C','i','a','o',' ','a',' ','t','u','t','t','i'};
        char[] str3 = new char[]{'a','b','c','d',' ','A',' ','a','b','c','d'};

        Stringa laMiaStringa1 = new Stringa(str2);
        System.out.println(laMiaStringa1);
        System.out.println(str2);
        System.out.println(laMiaStringa1.toUpperCase());
        System.out.println(str2);

        Stringa laMiaStringa2 = new Stringa(str3.length, str3);
        System.out.println(laMiaStringa2);
        System.out.println(str3);
        System.out.println(laMiaStringa2.toUpperCase());
        System.out.println(str3);

        System.out.println("Inserisci un carattere");
        Scanner tastiera = new Scanner(System.in);
        String s = tastiera.nextLine();


/*        System.out.println("<- Output variabili array di caratteri ->");
        System.out.println(str1);
        System.out.println(str2);

        String laMiaStringa = new String(str2);
        System.out.println(laMiaStringa);
        System.out.println(laMiaStringa.toUpperCase());

        Stringa strMia = new Stringa();*/


        // Creo oggetti Wrapper dea dati primitivi - metodo deprecato
        Integer intObj = new Integer(10);
        Double doubObj = new Double(10.5);
        Float floatObj = new Float(10.5);
        Character charObj = new Character('c');

        Integer intObj1 = new Integer(valoreIntero);
        Double doubObj1 = new Double(valoreDoppiaPrec);
        Float floatObj1 = new Float(valoreFloat);
        Character charObj1 = new Character(c);

        // Creo oggetti Wrapper dea dati primitivi - metodi corretti
        Integer intObj2= 10;
        Double doubObj2 = 10.5;
        Float floatObj2 = 10.5F;
        Character charObj2 = 'c';

        // Creo oggetti Wrapper dea dati primitivi - uso metodi statici
        Integer intObj3 = Integer.valueOf(valoreIntero);
        Double doubObj3 = Double.valueOf(valoreDoppiaPrec);
        Float floatObj3 = Float.valueOf(valoreFloat);

        Integer intObj4 = Integer.valueOf(10);
        Double doubObj4 = Double.valueOf(10.5);
        Float floatObj4 = Float.valueOf(10.5F);


        // Anche gli oggetti String possono essere visti come Wrapper di array di char
        // Inquesto caso il metodo con istanziazione dell'oggetto è corretto

        //Creo un oggetto String con un array di char
/*        String str1Obj = new String(str1);
        String str2Obj = new String(str1);
        //Creo un oggetto String con una costante
        String strObj = new String("\nquesta è un oggetto String");

        System.out.println("\n<- Output variabili stringhe ->");
        System.out.println(strObj);
        System.out.println(str1Obj);
        System.out.println(str2Obj);

        //Come
        System.out.println(intObj);
        System.out.println(doubObj);
        System.out.println(floatObj);*/

        // trasformazione da Wrapper Class a primitivo
        int valoreIntero1 = intObj.intValue();
        double valoreDoppiaPrec1 = doubObj.doubleValue();
        float valoreFloat1 = floatObj.floatValue();

/*        System.out.println(valoreIntero);
       System.out.println(valoreDoppiaPrec);
       System.out.println(valoreFloat);*/



        //Quando usare le wrapper class
/*
       A volte è necessario utilizzare classi wrapper, ad esempio quando si
       lavora con oggetti Collection, come ArrayList, dove non è
       possibile utilizzare tipi primitivi (l'elenco può memorizzare solo oggetti):
*/

//        ArrayList<int> myNumbers = new ArrayList<int>(); // Invalid
//          ArrayList<Integer> myNumbers = new ArrayList<Integer>(); // Valid

    }


}
