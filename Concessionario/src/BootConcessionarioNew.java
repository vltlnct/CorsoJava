public class BootConcessionarioNew {

    public static void main(String[] args) {
        ConcessionarioNew c = new ConcessionarioNew();
        c.addAuto(new Auto("Hyundai","i10",4.8, "AA123BB"));
        c.addAuto(new Auto("Mazda","2",4.8, "BB456CC"));
        c.addAuto(new Auto("Kia","Picanto",5, "CC678DD"));
        c.addAuto(new Auto("Mitsubishi","Space Star",5, "DD890EE"));
        System.out.println(c.viewListaAuto());

        c.getAuto(0).addCarburanteNelSerbatoio(20);
        if (c.getAuto(0).verificaCarburante(150) == 1) {
            c.getAuto(0).percorriDistanza(150);
        }
        System.out.println(c.getAuto(0).viewDataAuto());

        c.getAuto(2).addCarburanteNelSerbatoio(10);
        if (c.getAuto(2).verificaCarburante(50) == 1) {
            c.getAuto(2).percorriDistanza(50);
        }
        System.out.println(c.getAuto(2).viewDataAuto());

        System.out.println(c.viewListaAuto());
        // write your code here
    }

}
