public class AutoVeicolo {
    private String tipo;  //Auto, moto, autotreno
    private String marca;
    private String modello;

    private double litriConsumoMedio;   // 5.2l/100 Km percorso misto 20km/l
    private double carburanteNelSerbatoio; // l di carburante presente nel serbatoio
    private final int limiteCapacitaSerbatoio = 75;  // capacità massima serbatoio

    public AutoVeicolo(String tipo,
                       String marca,
                       String modello,
                       double litriConsumoMedio) {
        this.tipo = tipo;
        this.marca = marca;
        this.modello = modello;
        this.litriConsumoMedio = litriConsumoMedio;
        this.carburanteNelSerbatoio = 0;
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

}
