public class Auto extends AutoVeicolo{

    public Auto(String marca,
                String modello,
                double litriConsumoMedio,
                String targa) {
        super("Auto", marca, modello, litriConsumoMedio, targa);
    }

    // Usato in BootConcessionarioAutoVeicoli per tutti gli autoveicoli
    public String toString() {
        String outString = new String();
        outString = "( tipo:"+ this.getTipo() + ", targa:" + this.getTarga() + ", " + super.toString() + " )\n";
        return outString;
    }


// Usato in BootConcessionario e BootConcessionarioNew per le auto
    public String viewDataAuto() {
        String outString = new String();
        outString = "( targa:" + this.getTarga() +
                ", marca:" + this.getMarca() +
                ", modello:" +this.getModello() +
                ", consumo medio (l/km):" +Double.toString( this.getLitriConsumoMedio() ) +
                ", carburante nel serbatoio:" +Double.toString(this.getCarburanteNelSerbatoio()) + ")\n";
        return outString;
    }



}
