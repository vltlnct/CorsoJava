package com.geststream;

//lo uso per importare tutte le Eccezioni sui File
import java.io.*;
import java.util.*;
import java.io.File;
//per lettura file Testo
import java.io.FileReader;
import java.io.BufferedReader;

public class GestioneFile {
    //La classe File rappresenta un file memorizzato su supporto di memoria : HD, USB, ecc.
    File fileTestoIn;
    File fileJSONOut;

    public ArrayList leggiFileTesto () {
        //FileReader rappresenta un
        ArrayList listaRighe =  new ArrayList();
        FileReader readerFileTesto = null;
        try {
            readerFileTesto = new FileReader(fileTestoIn);
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }

        BufferedReader streamFileIinput = new BufferedReader(readerFileTesto);
        if (fileTestoIn.exists()) {
            System.out.println("Lettura del file di testo");

            String linea = null;
            int i=0;
            try {
                do  {
                        linea = streamFileIinput.readLine();
                        if (linea != null) {
                            i++;
    //                      System.out.println("linea: "+i+":"+linea);
                             listaRighe.add(linea);
                        }
                } while (linea != null);
                readerFileTesto.close();
            } catch (IOException e) {
                System.out.println(e);
            }

        } else {
            System.out.println("Il file "+fileTestoIn.getName()+" non esiste");

        }
        return listaRighe;
    }



    public void scriviFileJSON (String strToFileJSON) {
            try {
                System.out.println(strToFileJSON);
                FileWriter fw = new FileWriter(fileJSONOut);
                fw.write(strToFileJSON.toString());
                fw.flush();
                fw.close();
            }
            catch(IOException e) {
                e.printStackTrace();
            }
    }




    public GestioneFile(String nomefileTestoIn, String nomefileOut) {
        fileTestoIn = new File(nomefileTestoIn);
        fileJSONOut = new File(nomefileOut);
    }

}



