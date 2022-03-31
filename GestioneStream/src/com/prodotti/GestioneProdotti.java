package com.prodotti;

import com.google.gson.Gson;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class GestioneProdotti {
        private ArrayList<Prodotto> listaProdotti;

        public GestioneProdotti(ArrayList<String> rowToTrasform){
            listaProdotti = new ArrayList<Prodotto>();
            System.out.println("--- Con each loop ---");
            String s;
            String [] vet = new String[10];
            for (String elementoCorrente: rowToTrasform){
                s = elementoCorrente;
                vet = s.split(",");
                System.out.println(vet[0]+" "+s);
                listaProdotti.add(this.getProdotti(vet));
            }
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

                    retval = new Alimento(attributi[1],  dIn, attributi[3], attributi[4], dScad, attributi[6]);
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

                    retval = new Elettronico(attributi[1], dIn, attributi[3], attributi[4], attributi[5]);
                    break;
            }
            return retval;
        }

        public ArrayList<Prodotto> getListaProdotti(){
            return listaProdotti;
        }

        public ArrayList<Alimento> getListaAlimenti(){
            ArrayList<Alimento> listaAlimenti = new ArrayList<Alimento>();
            for (Prodotto elementoCorrente: listaProdotti){
                if (elementoCorrente instanceof Alimento)
                    listaAlimenti.add( (Alimento) elementoCorrente);
            }
            return listaAlimenti;
        }



    public ArrayList<Elettronico> getListaElettronici(){
        ArrayList<Elettronico> listaElettronico = new ArrayList<Elettronico>();
        for (Prodotto elementoCorrente: listaProdotti){
            if (elementoCorrente instanceof Elettronico)
                listaElettronico.add( (Elettronico) elementoCorrente);
        }
        return listaElettronico;
    }



    public String toJSON() {
            Gson gson = new Gson();
            StringBuilder sb = new StringBuilder();
            for(Prodotto d : listaProdotti) {
                sb.insert(0,gson.toJson(d)+"\n");
            }
            return sb.toString();
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
