package com.compuni;
import java.util.Arrays;

// Ereditarietà multipla
//public class ListaComponenti implements Comparatore {

public class ListaComponenti {
    private Object [] lista;
    private int indexArray=0;

    public ListaComponenti(int dim) {

        this.lista =  new Object[dim];
    }


    public void addComponente(Persona p) {
        //this.lista[indexArray++] = p;
            this.lista[indexArray++] = p;
    }


    public Object getComponente(int i) {
        return  this.lista[i];
    }

    private int dimArray()
    {
        return  this.indexArray;
    }

    //Implementazione tramite interfaccia esterna
    public void sort(Comparatore criterio){
        // realizzare un ordinamento con ciclo for
        Object tem;
        int i,j;
        for (i=0; i<this.indexArray; i++)
            for (j=0; j<this.indexArray-1; j++){

                if (criterio.confrontaCon(this.lista[j], this.lista[j+1]) > 0){
                    tem =  this.lista[j];
                    this.lista[j] = this.lista[j+1];
                    this.lista[j+1] = tem;
                }
            }
    }


/*
        // Ereditarietà multipla
        public void sort2(){
        // realizzare un ordinamento con ciclo for
        Object tem;
        int i,j;
        for (i=0; i<this.indexArray; i++)
            for (j=0; j<this.indexArray-1; j++){
                if (confrontaCon(this.lista[j], this.lista[j+1]) > 0){
                    tem =  this.lista[j];
                    this.lista[j] = this.lista[j+1];
                    this.lista[j+1] = tem;
                }
            }
    }*/

    // Soluzione senza interfacce
/*    public void ordinaPerCognome()
    {
        // realizzare un ordinamento con ciclo for
        Object tem;
*//*        [7,1,5,3]
        [1,7,5,3]
        [1,5,7,3]
        [1,5,3,7]

        [1,5,3,7]
        [1,3,5,7]
        [1,3,5,7]
        [1,3,5,7]*//*
        int i,j;
        for (i=0; i<this.dimArray(); i++)
            for (j=0; j<this.dimArray()-1; j++){
                if (((Persona)this.lista[j]).getCognome().compareTo(((Persona)this.lista[j+1]).getCognome()) > 0){
                    tem =  this.lista[j];
                    this.lista[j] = this.lista[j+1];
                    this.lista[j+1] = tem;
                }
            }
    }*/

    @Override
    public String toString() {
        return "ListaComponenti{" +
                "lista=" + Arrays.toString(lista) +
                ", indexArray=" + indexArray +
                '}';
    }

/*          // Ereditarietà multipla
    @Override
    public int confrontaCon(Object o1, Object o2) {
        return  ((Persona) o1).getCognome().compareTo(((Persona) o2).getCognome());
    }*/
}
