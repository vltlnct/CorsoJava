import java.util.Arrays;

/* Utilizzo esclusivamente un Array con dimensione fissa e
   degli indici per accedere agli elementi
 */
public class Concessionario {
    private Auto[] listaAuto;
    private int indiceArray;

    //List<Auto> listaAuto = new ArrayList<Auto>();

    public Concessionario(int dim) {
        this.listaAuto = new Auto[dim];
        this.indiceArray = 0;
    }

    public Auto[] getListaAuto() {
        return this.listaAuto;
    }

    public void addAuto(Auto nuovaAuto) {
        if (this.indiceArray < this.listaAuto.length)
            this.listaAuto[this.indiceArray++] = nuovaAuto;
        else
            System.out.println("Non c'è più spazio nell'array");
    }

    public String viewListaAuto()
    {
        String outString = new String("{\n");
        for (int i=0; i<this.indiceArray; i++){
            outString += this.listaAuto[i].viewDataAuto();
        }
        outString += "}";
        return outString;
    }


    public void ordinaPerTarga()
    {
        // realizzare un ordinamento con ciclo for
        Auto tem;
        int i,j;
        for (i=0; i<listaAuto.length; i++)
            for (j=0; j<listaAuto.length-1; j++)
                if (listaAuto[j].getTarga().compareTo(listaAuto[j+1].getTarga()) > 0){
                    tem = listaAuto[j];
                    listaAuto[j] = listaAuto[j+1];
                    listaAuto[j+1] = tem;
                }
    }

}
