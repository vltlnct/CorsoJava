public class Auto extends AutoVeicolo{

    private String targa;

    public Auto(String marca,
                String modello,
                double litriConsumoMedio,
                String targa) {
        super("Auto", marca, modello, litriConsumoMedio);
        this.targa = targa;
    }

    public String getTarga() {
        return targa;
    }

    public String viewDataAuto() {
        String outString = new String();
        outString = "[ targa:" + this.getTarga() +
                ", marca:" + this.getMarca() +
                ", modello:" +this.getModello() +
                ", consumo medio (l/km):" +Double.toString( this.getLitriConsumoMedio() ) +
                ", carburante nel serbatoio:" +Double.toString(this.getCarburanteNelSerbatoio()) + "]\n";
        return outString;
    }



}
