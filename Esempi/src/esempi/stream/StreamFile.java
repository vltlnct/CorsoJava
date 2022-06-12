package esempi.stream;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
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
//        String [] listaRighe = new String[100];
        File fileTestoIn =  new File(nomefileTestoIn);
        FileReader readerFileTesto = null;
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
//                      listaRighe[i] = linea;
                        listaRighe.add(linea);
                    }
                } while (linea != null);
                readerFileTesto.close();
            } catch (IOException e) {
                System.out.println(e);
            }
        } else {
            System.out.println("Il file "+fileTestoIn.getName()+" non esiste");
            return null;
        }
        return listaRighe;
    }

    public ArrayList<String> getStream()
    {
        System.out.println("Utilizzo della classe Stream");
        try {
            fileStream = Files.lines(Paths.get(nomefileTestoIn));
        } catch (NoSuchFileException e) {
            System.out.println("Errore nell'apertura del file");
            e.printStackTrace();
            return null;
        } catch (IOException e) {
            System.out.println("Errore nell'apertura del file");
            e.printStackTrace();
            return null;
        }
        ArrayList<String> listaRighe =  new ArrayList<>();
        listaRighe = (ArrayList<String>)  fileStream.collect(Collectors.toList());
        return listaRighe;
    }

    public static void main(String[] args) {
        StreamFile myStream = new StreamFile("C:\\xampp\\htdocs\\CorsoJava\\Esempi\\inputFile.txt");
        ArrayList<String> l;

        l = myStream.getFile();
        System.out.println(l);

        l = myStream.getStream();
        System.out.println(l);

    }
}
