import java.util.Comparator;

public class AutoVeicolo /*implements Comparable<AutoVeicolo>*/ {
    private String tipo;  //Auto, moto, autotreno
    private String marca;
    private String modello;
    private String targa;

    private double litriConsumoMedio;   // 5.2l/100 Km percorso misto 20km/l
    private double carburanteNelSerbatoio; // l di carburante presente nel serbatoio
    private final int limiteCapacitaSerbatoio = 75;  // capacità massima serbatoio

    public AutoVeicolo(String tipo,
                       String marca,
                       String modello,
                       double litriConsumoMedio,
                       String targa) {
        this.tipo = tipo;
        this.marca = marca;
        this.modello = modello;
        this.litriConsumoMedio = litriConsumoMedio;
        this.targa = targa;
        this.carburanteNelSerbatoio = 0;
    }


    public AutoVeicolo(String marca,
                       String modello,
                       double litriConsumoMedio,
                       String targa) {
        this.tipo = "N/A";
        this.marca = marca;
        this.modello = modello;
        this.litriConsumoMedio = litriConsumoMedio;
        this.targa = targa;
        this.carburanteNelSerbatoio = 0;
    }

    public String getTipo() {
        return tipo;
    }

    public String getMarca() {
        return this.marca;
    }

    public String getModello() {
        return this.modello;
    }

    public int getLimiteCapacitSerbatoio() {
        return this.limiteCapacitaSerbatoio;
    }

    public double getLitriConsumoMedio() {
        return this.litriConsumoMedio;
    }

    double getKmPerLitro(){
        // restituisce il numero di km percorsi con un litro di carburante
        double calcolo = this.getLitriConsumoMedio();
        calcolo = 100/calcolo;
        return calcolo;
    }

    public double getCarburanteNelSerbatoio() {
        return carburanteNelSerbatoio;
    }

    public int verificaCarburante(int kmDaPercorere){
        double fabbisognoLitriCarburante = kmDaPercorere / getKmPerLitro();
        int stato = 0;
        // La riserva scatta sotto al 10% della capacità del serbatoio
        if ( this.getCarburanteNelSerbatoio() < fabbisognoLitriCarburante )
            stato = -1;  // il carburante nel serbatoio non è sufficiente per percorrere la distanza
        else if ( (this.getCarburanteNelSerbatoio() - fabbisognoLitriCarburante) < (this.limiteCapacitaSerbatoio * 0.1))
            stato = -2;  // il carburante nel serbatoio è sufficiente per percorrere la distanza ma andrà in riserva
        else
            stato = 1;  // il carburante nel serbatoio è sufficiente per percorrere la distanza

        return  stato;
    }

    public double addCarburanteNelSerbatoio(int carburante) {
        if ( (this.carburanteNelSerbatoio + carburante) <= this.limiteCapacitaSerbatoio)
            this.carburanteNelSerbatoio += carburante;
        else {
            System.out.println("La quantità di carburante (" + (this.carburanteNelSerbatoio + carburante) + ") è maggiore della capacità del serbatoio (" + this.limiteCapacitaSerbatoio + ")");
            this.carburanteNelSerbatoio = limiteCapacitaSerbatoio;
        }
        return this.carburanteNelSerbatoio;
    }

    public void percorriDistanza(int kmPercorsi) {
        double litriConsumati = kmPercorsi / getKmPerLitro();
        this.carburanteNelSerbatoio = this.carburanteNelSerbatoio - litriConsumati;
    }


    // Usato in BootConcessionarioAutoMoto per tutti gli autoveicoli
    public String toString() {
        String outString = new String();
        outString = " marca:" + this.getMarca() +
                ", modello:" +this.getModello() +
                ", consumo medio (l/km):" +Double.toString( this.getLitriConsumoMedio() ) +
                ", carburante nel serbatoio:" +Double.toString(this.getCarburanteNelSerbatoio()) + " ";
        return outString;
    }

    public String getTarga() {
        return targa;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }

/*
 Questa seconda soluzione si applica quando la stessa classe AutoVeicoli implementa
 l'interfaccia Comparable<AutoVeicolo>
*/

/*    @Override
    public int compareTo(AutoVeicolo o) {
        *//*
        Zero	Due stringhe sono uguali.
        Maggiore di zero	La stringa che si richiama è maggiore di str.
        Meno di zero	La stringa invocante è minore di str.
        *//*
        int risultato =  (this.getTarga().compareTo(o.getTarga()));
        return risultato;
    }*/
}
