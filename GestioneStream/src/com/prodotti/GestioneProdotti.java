package com.prodotti;

import com.google.gson.Gson;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class GestioneProdotti {
        private ArrayList<String> rowToTrasform;
        private ArrayList<Prodotto> listaProdotti;

        public GestioneProdotti(ArrayList<String> righe){
            rowToTrasform = righe;
            listaProdotti = new ArrayList();
        }

        private Prodotto getProdotti (String[] attributi) {
            Prodotto retval = null;
            Date dIn = null;
            Date dScad = null;

            switch (attributi[0]){
                case "Alimenti":
                    try {
                        dIn = (new SimpleDateFormat("dd/mm/yyyy")).parse(attributi[2]);
                        dScad = (new SimpleDateFormat("dd/mm/yyyy")).parse(attributi[5]);
                    } catch (ParseException  e){}

                    retval = new Alimenti(attributi[1],  dIn, attributi[3], attributi[4], dScad, attributi[6]);
                    break;
                case "Vestiario":
                    try {
                        dIn = (new SimpleDateFormat("dd/mm/yyyy")).parse(attributi[2]);
                    } catch (ParseException  e){}
                    retval = new Vestiario(attributi[1], dIn, attributi[3],attributi[4], attributi[5], attributi[6],
                            attributi[7], Integer.valueOf(attributi[8]) );
                    break;
                case "Elettronici":
                    try {
                        dIn = (new SimpleDateFormat("dd/mm/yyyy")).parse(attributi[2]);
                    } catch (ParseException  e){}

                    retval = new Elettronici(attributi[1], dIn, attributi[3], attributi[4], attributi[5]);
                    break;
            }
            return retval;
        }

        public ArrayList<Prodotto> getListaProdotti(){
            System.out.println("--- Con each loop ---");
            String s;
            String [] vet = new String[10];
            for (String elementoCorrente: rowToTrasform){
                s = elementoCorrente;
                vet = s.split(",");
                System.out.println(vet[0]+" "+s);
                listaProdotti.add(this.getProdotti(vet));
            }
            return listaProdotti;
        }

    public String toJSON() {
        Gson gson = new Gson();
        StringBuilder sb = new StringBuilder();
        for(Prodotto d : listaProdotti) {
            sb.insert(0,gson.toJson(d)+"\n");


        }
        return sb.toString();
    }


    public void ordinaPerCodice()
    {
        /*
        Questa soluzione utilizza una classe Comparator<AutoVeicolo> :
                OrdinaPerTarga implements Comparator<AutoVeicolo>
        Vedere il metodo 	Arrays.sort(T[] a, Comparator<? super T> c)
        */
        listaProdotti.sort( new OrdinaPerCodice());
    }


    public void ordinamentoIngenuo(){

           // realizzare un ordinamento con ciclo for
        Prodotto tem;
        Prodotto p1;
        Prodotto p2;
        int i,j;
        for (i=0; i<listaProdotti.size(); i++)
            for (j=0; j<listaProdotti.size()-1; j++){
                p1 = (Prodotto)listaProdotti.get(j);
                p2 = (Prodotto)listaProdotti.get(j+1);

                if (p1.getCodice().compareTo(p2.getCodice()) > 0){
                    tem = p1;
                    p1 = p2;
                    p2 = tem;
                }
            }
    }



}
