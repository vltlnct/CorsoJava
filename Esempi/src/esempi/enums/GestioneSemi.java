package esempi.enums;

public class GestioneSemi {
    public static void main(String[] args) {
        Semi a = Semi.QUADRI;

        for( Semi s : Semi.values() ) {
            System.out.println(s);
            for (int i=1; i<=13; i++ ){
  //              Card c = new Card(i, s);
            }
        }
    }
}
