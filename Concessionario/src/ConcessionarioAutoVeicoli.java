import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* Viene usata ArrayList<AutoVeicolo> e
 per l'ordinamento viene usata ArrayList.sort(Comparator<? super E> c)
*/
public class ConcessionarioAutoVeicoli {

    ArrayList<AutoVeicolo> listaAuto;


    public ConcessionarioAutoVeicoli(int dim) {
        listaAuto = new ArrayList<AutoVeicolo>(dim);
    }

    public ArrayList<AutoVeicolo> getListaAuto() {
        return this.listaAuto;
    }


    public void addAutoVeicolo(AutoVeicolo nuovoAutoVeicolo) {
        this.listaAuto.add(nuovoAutoVeicolo);
    }

    public AutoVeicolo getAutoVeicolo(int i){

        return this.listaAuto.get(i);
    }

    public String toString()
    {
        String outString = new String("{\n");
        for (int i=0; i<listaAuto.size(); i++){
            outString += this.listaAuto.get(i).toString();
        }
        outString += "}";
        return outString;

    }

    public void ordina()
    {
        /*
        Questa soluzione utilizza una classe Comparator<AutoVeicolo> :
                OrdinaPerTarga implements Comparator<AutoVeicolo>
        vedere il metodo ArrayList.sort(Comparator<? super E> c)
        */
        listaAuto.sort( new OrdinaPerTarga());
    }

}


