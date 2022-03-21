public class BootConcessionarioAutoVeicoli {


    public static void gestioneAutoveicoli(){
        ConcessionarioAutoVeicoli concessionario = new ConcessionarioAutoVeicoli();
        concessionario.addAutoVeicolo(new Auto("Hyundai","i10",4.8, "AA123BB"));
        concessionario.addAutoVeicolo(new Auto("Mazda","2",4.8, "BB456CC"));
        concessionario.addAutoVeicolo(new Auto("Kia","Picanto",5, "CC678DD"));
        concessionario.addAutoVeicolo(new Auto("Mitsubishi","Space Star",5, "DD890EE"));

        concessionario.addAutoVeicolo(new Moto("APRILIA","CAPONORD 1200 RALLY",9.4, "YY123AA"));
        concessionario.addAutoVeicolo(new Moto("BMW","R 1220 GS",10.8, "WW345BB"));
        concessionario.addAutoVeicolo(new Moto("DUCATI","MULTISTRADA 1200 ENDURO",9.7, "XX567CC"));
        concessionario.addAutoVeicolo(new Moto("HONDA","CRF1000 L AFRICA TWIN ABS DTC",12.2, "ZZ789DD"));

        System.out.println(concessionario);

        concessionario.getAutoVeicolo(0).addCarburanteNelSerbatoio(20);
        if (concessionario.getAutoVeicolo(0).verificaCarburante(150) == 1) {
            concessionario.getAutoVeicolo(0).percorriDistanza(150);
        }
        System.out.println(concessionario.getAutoVeicolo(0));

        concessionario.getAutoVeicolo(2).addCarburanteNelSerbatoio(10);
        if (concessionario.getAutoVeicolo(2).verificaCarburante(50) == 1) {
            concessionario.getAutoVeicolo(2).percorriDistanza(50);
        }
        System.out.println(concessionario.getAutoVeicolo(2));


        concessionario.getAutoVeicolo(6).addCarburanteNelSerbatoio(10);
        if (concessionario.getAutoVeicolo(6).verificaCarburante(50) == 1) {
            concessionario.getAutoVeicolo(6).percorriDistanza(50);
        }
        System.out.println(concessionario.getAutoVeicolo(6));


        System.out.println(concessionario);
        // write your code here
    }

    public static void main(String[] args) {
        gestioneAutoveicoli();
    }

}
