package esempi.enums;

public enum StagioneConValori {
    PRIMAVERA(18),
    ESTATE(30),
    AUTUNNO(15),
    INVERNO(5);

    private int gradiCentigradi;
    /*
    Il costruttore viene dichiarato senza la keyword public, in quanto il costruttore
    viene unicamente utilizzato all’interno dell’enum e la parola public farebbe
    riferimento a un utilizzo “esterno” di questo metodo.
     */
    StagioneConValori(int gradi) {
        this.gradiCentigradi = gradi;
    }

    public int getGradiCentigradi() {
        return gradiCentigradi;
    }
}
