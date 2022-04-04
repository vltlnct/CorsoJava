package com.compuni;
import java.util.Arrays;

// Ereditarietà multipla
public class ListaComponenti extends Object {

    private Object [] lista;
    private int indexArray=0;

    public ListaComponenti(int dim) {

        this.lista =  new Object[dim];
    }
    public void addComponente(Object p) {
        //this.lista[indexArray++] = p;
            this.lista[indexArray++] = p;
    }

    public Object getComponente(int i) {
        return  this.lista[i];
    }

    public int dimArray()
    {
        return  this.indexArray;
    }


    // Soluzione senza interfacce
    public void ordinaPerCognome()
    {
        // realizzare un ordinamento Bubble Sort non ottimizzato con ciclo for
        Object tem;
        int i,j;
        for (i=0; i<this.dimArray(); i++)
            for (j=0; j<this.dimArray()-1; j++){
                if (((Persona)this.lista[j]).getCognome().compareTo(((Persona)this.lista[j+1]).getCognome()) > 0){
                    tem =  this.lista[j];
                    this.lista[j] = this.lista[j+1];
                    this.lista[j+1] = tem;
                }
            }
    }


    public void ordinaPerData()
    {
        // realizzare un ordinamento Bubble Sort non ottimizzato con ciclo for
        Object tem;
        int i,j;
        for (i=0; i<this.dimArray(); i++)
            for (j=0; j<this.dimArray()-1; j++){
                if (((Amministrativo)this.lista[j]).getDataAssunzione().compareTo(((Amministrativo)this.lista[j+1]).getDataAssunzione()) > 0){
                    tem =  this.lista[j];
                    this.lista[j] = this.lista[j+1];
                    this.lista[j+1] = tem;
                }
            }
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



    @Override
    public String toString() {
        return "ListaComponenti{" +
                "lista=" + Arrays.toString(lista) +
                ", indexArray=" + indexArray +
                '}';
    }



}
