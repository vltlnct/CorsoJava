package esempi.generics;

public class Confronta<T1, T2> {
    T1 a;
    T2 b;
    public Confronta(T1 a, T2 b){
        this.a = a;
        this.b = b;
    }

    public boolean confronta(){
/*        if (Integer.parseInt((String) a) == (int) b)
            return true;
        else
            return false;*/
//Esempio non buono
       if  (a == b)
            return true;
       else
            return false;
    }

    public static void main(String[] args) {
        Confronta<String, Integer> c1 = new Confronta<>("200", 200);
        Confronta<Integer, String> c2 = new Confronta<>(200,"200");

        System.out.println(c1.confronta());
        // e se inverto i parametri ?
        System.out.println(c2.confronta());
    }


}


