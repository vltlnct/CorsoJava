package esempi.enums;

// Enum: posso anche creare Enum composti da oggetti specifici caratterizzati da attributi e metodi

public enum TavolaPeriodica {
    IDROGENO("H", 1, 1.008),
    ELIO("He", 2, 4.003),
    // ... altri elementi
    LITIO("Li", 3, 6.491);

    private int numeroAtomico;
    private double massaAtomica;
    private String simbolo;

    public int getNumeroAtomico() {
        return numeroAtomico;
    }
    public String getSimbolo() {
        return simbolo;
    }
    /*
     Questa volta ho bisogno di un costruttore per gli Elementi dell'Enum
     Questo costruttore a differenza delle istanze degli oggetti, non dovrà
     essere utilizzato per allocare nessuna istanza, quindi non verrà invocato da new.
     Ricordiamo infatti che l'Enum è "costante"

    */

    private TavolaPeriodica(String simbolo, int numeroAtomico, double massaAtomica) {
        this.simbolo = simbolo;
        this.numeroAtomico = numeroAtomico;
        this.massaAtomica = massaAtomica;
    }
}

