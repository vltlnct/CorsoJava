import com.sun.net.httpserver.HttpContext;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpServer;

import java.io.*;
import java.net.InetSocketAddress;
import java.util.Arrays;

public class BasicHttpServerExample {


    public static String LeggiIndexPage(String nomeFile) throws IOException {

        String current = new java.io.File( "." ).getCanonicalPath();
        String currentDir = System.getProperty("user.dir");

        String indexPage = new String();
        if (nomeFile == "")
            indexPage = new String(currentDir+"\\WebRoot\\index.html");
        else
            indexPage = new String(currentDir+"\\WebRoot\\"+nomeFile);

        String outLine = new String();
        try {
            FileReader fr = new FileReader(indexPage);
            int inByte = fr.read();
            while(inByte != -1) {
                outLine = outLine + (char) inByte;
                inByte = fr.read();
            }
//            System.out.println(outLine);
            fr.close();
        } catch (IOException e) {
            System.out.println(e);
            outLine = "Il file non esiste";
        }
        return outLine;

    }

    public static void main(String[] args) throws IOException {

        HttpServer server = HttpServer.create(new InetSocketAddress(8000), 0);

        HttpContext context = server.createContext("/");
        context.setHandler(BasicHttpServerExample::handleRequest);
        server.start();
    }

    private static void handleRequest(HttpExchange exchange) throws IOException {

        System.out.println("\n");
        System.out.println("*****************************************");
        System.out.println("******** Inizio richiesta ***************");
        System.out.println("*****************************************");
        System.out.println("\n\n");

        System.out.println("Request URI = ["+exchange.getRequestURI() +"]");
        System.out.println("Request Method = ["+exchange.getRequestMethod()+"]");
        System.out.println("Request Body = ["+ Arrays.toString(exchange.getRequestBody().readAllBytes()) +"]");

        // Estraggo il nome del file richiesto in questa Request
        String uri = exchange.getRequestURI().toString();
        int ind = uri.indexOf("/");
        String nomeFile = uri.substring(ind+1, uri.length()-ind);

        // la funzione cerca il file
        String response = LeggiIndexPage(nomeFile);

        exchange.sendResponseHeaders(200, response.getBytes().length);//response code and length

        System.out.println("Response : ["+response+"]");


        System.out.println("\n\n");
        System.out.println("*****************************************");
        System.out.println("******** Fine richiesta *****************");
        System.out.println("*****************************************");
        System.out.println("\n");





        OutputStream os = exchange.getResponseBody();
        os.write(response.getBytes());
        os.close();
    }
}