public class Moto extends AutoVeicolo {

    private String targa;

    public Moto(String marca,
                String modello,
                double litriConsumoMedio,
                String targa) {
        super("Moto", marca, modello, litriConsumoMedio);
        this.targa = targa;
    }

    public String getTarga() {
        return targa;
    }

    // Usato in BootConcessionarioAutoMoto per le moto
    public String viewDataMoto() {
        String outString = new String();
        outString = "[ targa:" + this.getTarga() +
                ", marca:" + this.getMarca() +
                ", modello:" +this.getModello() +
                ", consumo medio (l/km):" +Double.toString( this.getLitriConsumoMedio() ) +
                ", carburante nel serbatoio:" +Double.toString(this.getCarburanteNelSerbatoio()) + "]\n";
        return outString;
    }

    public String toString() {
        String outString = new String();
        outString = "[ tipo:"+ this.getTipo() + ", targa:" + this.getTarga() + ", " + super.toString() + " ]\n";
        return outString;
    }


}
