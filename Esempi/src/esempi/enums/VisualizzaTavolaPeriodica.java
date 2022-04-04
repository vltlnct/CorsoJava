package esempi.enums;

public class VisualizzaTavolaPeriodica {
        public static void main(String[] args) {

        System.out.printf("Simbolo\t|\tPos.|\tNome\n");
        for( TavolaPeriodica e : TavolaPeriodica.values() ) {
            System.out.printf("%s\t\t|\t%d\t|\t%s\n", e.getSimbolo(), e.getNumeroAtomico(), e);
        }
    }
}