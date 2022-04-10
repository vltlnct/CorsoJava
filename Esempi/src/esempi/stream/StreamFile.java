package esempi.stream;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFile {
    Stream<String> fileStream; // attributo segue il metodo leggiStream
    private String nomefileTestoIn;

    public StreamFile(String nomefileTestoIn) {
        this.nomefileTestoIn = nomefileTestoIn;
    }



    public ArrayList<String> getFile () {
        //FileReader rappresenta un
        ArrayList<String> listaRighe =  new ArrayList<>();
        FileReader readerFileTesto = null;
        File fileTestoIn =  new File(nomefileTestoIn);
        try {

            readerFileTesto = new FileReader(fileTestoIn);
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }

        BufferedReader streamFileIinput = new BufferedReader(readerFileTesto);
        if (fileTestoIn.exists()) {
            System.out.println("Utilizzo della classe File");

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


    public ArrayList<String> getStream()
    {
        System.out.println("Utilizzo della classe Stream");
        try {
            fileStream = Files.lines(Paths.get(nomefileTestoIn));
        } catch (
                IOException e) {
            System.out.println("Errore nell'apertura del file");
            e.printStackTrace();
        }
        ArrayList<String> listaRighe =  new ArrayList<>();
        return (ArrayList<String>) fileStream.collect(Collectors.toList());
    }

    public static void main(String[] args) {
        StreamFile myStream =  new StreamFile("inputFile.txt");
        System.out.println(myStream.getStream());

        System.out.println(myStream.getFile());

    }


}
