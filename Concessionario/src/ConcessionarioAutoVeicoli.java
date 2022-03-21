import java.util.ArrayList;
import java.util.List;

public class ConcessionarioAutoVeicoli {
    List<AutoVeicolo> listaAutoVeicolo;


    public ConcessionarioAutoVeicoli() {
        listaAutoVeicolo = new ArrayList<AutoVeicolo>();
    }

    public List<AutoVeicolo> getListaAuto() {
        return this.listaAutoVeicolo;

    }


    public void addAutoVeicolo(AutoVeicolo nuovoAutoVeicolo) {
        this.listaAutoVeicolo.add(nuovoAutoVeicolo);
    }

    public AutoVeicolo getAutoVeicolo(int i){
        return this.listaAutoVeicolo.get(i);
    }

    public String toString()
    {
        String outString = new String("{\n");

        for (int i=0; i<listaAutoVeicolo.size(); i++){
            outString += this.listaAutoVeicolo.get(i).toString();
        }
        outString += "}";
        return outString;

    }

}


