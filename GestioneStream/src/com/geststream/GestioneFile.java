package com.geststream;

//lo uso per importare tutte le Eccezioni sui File
import com.prodotti.Prodotto;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.io.File;
//per lettura file Testo
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GestioneFile {
    //La classe File rappresenta un file memorizzato su supporto di memoria : HD, USB, ecc.
    File fileTestoIn; // attributo segue il metodo leggiFileTesto
    File fileJSONOut;
    Stream<String> fileStream; // attributo segue il metodo leggiStream
    Stream<String> buffStream;


    public ArrayList<String> leggiStream () {
        return (ArrayList<String>) fileStream.collect(Collectors.toList());
    }

    // Il metodo è obsoleto. Viene utilizzato il metodo leggiStream()
    public ArrayList leggiFileTesto () {

        ArrayList listaRighe =  new ArrayList();
        //FileReader rappresenta un  oggetto per la gestione dei File collegato file system
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

    public GestioneFile(String nomefileTestoIn, String nomefileOut)  {
        fileTestoIn = new File(nomefileTestoIn);
        fileJSONOut = new File(nomefileOut);

        try {
            fileStream = Files.lines(Paths.get(nomefileTestoIn));
        } catch (IOException e) {
            System.out.println("Errore nell'apertura del file");
            e.printStackTrace();
        }
        try {
            buffStream = Files.newBufferedReader(Paths.get(nomefileTestoIn)).lines();
        } catch (IOException e) {
            System.out.println("Errore nell'apertura del file");
            e.printStackTrace();
        }
    }

}



