import com.compuni.Persona;

import java.util.ArrayList;

public class GestioneUniversita {
/*    private Object [] popolazione;
    private int indexArray;*/
    private ArrayList popolazione;

    public GestioneUniversita(int dim) {
/*        this.popolazione = new Object[dim];
        indexArray = 0;*/
        this.popolazione = new ArrayList();

    }
    public void addComponente(Persona p) {
 //       this.popolazione[indexArray++] = p;
        this.popolazione.add(p);

    }
    public Object getComponente(int i) {
        return (Persona)this.popolazione.get(i);

//        return  this.popolazione[i];
    }

    public int getDimensione(){
        return this.popolazione.size();
//        return this.indexArray;
    }


    public void ordinaPerCognome()
    {
        // realizzare un ordinamento con ciclo for
        Persona tem;
        Persona p1;
        Persona p2;
        int i,j;
        for (i=0; i<popolazione.size(); i++)
            for (j=0; j<popolazione.size()-1; j++){
                p1 = (Persona)popolazione.get(j);
                p2 = (Persona)popolazione.get(j+1);

                if (p1.getCognome().compareTo(p2.getCognome()) > 0){
                    tem = p1;
                    p1 = p2;
                    p2 = tem;
                }
            }
    }


/*
    public void ordina()
    {
        */
/*
        Questa soluzione utilizza una classe Comparator<AutoVeicolo> :
                OrdinaPerTarga implements Comparator<AutoVeicolo>
        vedere il metodo ArrayList.sort(Comparator<? super E> c)
        *//*


        OrdinaPerCognome criterio  = new OrdinaPerCognome();
        popolazione.sort(criterio);
    }
*/


}
