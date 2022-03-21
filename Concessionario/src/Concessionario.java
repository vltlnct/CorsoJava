import java.util.Arrays;

public class Concessionario {
    private Auto[] listaAuto;
    private int indiceArray;

    //List<Auto> listaAuto = new ArrayList<Auto>();

    public Concessionario() {
        this.listaAuto = new Auto[100];
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
/*
        String outString = new String("{\n");
        for (int i=0; i<this.indiceArray; i++){
            outString += this.listaAuto[i].viewDataAuto();
        }
        outString += "}";
        return outString;
*/
        String outString = new String("{\n"+ Arrays.deepToString(listaAuto) + "}");
        return  outString;
    }
}
