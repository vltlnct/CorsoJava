public class BootConcessionario {

    public static void main(String[] args) {
        Concessionario c = new Concessionario(4);
        c.addAuto(new Auto("Mitsubishi","Space Star",5, "DD890EE"));
        c.addAuto(new Auto("Kia","Picanto",5, "CC678DD"));
        c.addAuto(new Auto("Mazda","2",4.8, "BB456CC"));
        c.addAuto(new Auto("Hyundai","i10",4.8, "AA123BB"));
        System.out.println(c.viewListaAuto());

        c.ordina();

        c.getListaAuto()[0].addCarburanteNelSerbatoio(20);
        if (c.getListaAuto()[0].verificaCarburante(150) == 1) {
            c.getListaAuto()[0].percorriDistanza(150);
        }
        System.out.println(c.getListaAuto()[0].viewDataAuto());

        c.getListaAuto()[2].addCarburanteNelSerbatoio(10);
        if (c.getListaAuto()[2].verificaCarburante(50) == 1) {
            c.getListaAuto()[2].percorriDistanza(50);
        }
        System.out.println(c.getListaAuto()[2].viewDataAuto());


        System.out.println(c.viewListaAuto());
	// write your code here
    }
}
