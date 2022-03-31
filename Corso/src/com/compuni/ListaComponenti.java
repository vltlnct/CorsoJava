package com.compuni;


import java.util.Arrays;

public class ListaComponenti {
    private Object [] lista;
    private int indexArray=0;

    public ListaComponenti(int dim) {
        this.lista =  new Object[dim];
    }
    public void addComponente(Persona p) {
        this.lista[indexArray++] = p;
    }
    public Object getComponente(int i) {
        return  this.lista[i];
    }

/*
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
*/

    public void ordinaPerCognome()
    {
        // realizzare un ordinamento con ciclo for
        Object tem;

        int i,j;
        for (i=0; i<this.indexArray; i++)
            for (j=0; j<this.indexArray-1; j++){
                if (((Persona)this.lista[j]).getCognome().compareTo(((Persona)this.lista[j+1]).getCognome()) > 0){
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
