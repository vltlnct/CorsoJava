package esempi.hash;
// Esempio per la gestione dei metodi hashCode() e equals()

import java.util.HashSet;

class Libro {

    private String isbn;

    private String autore;

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((isbn == null) ? 0 : isbn.hashCode());
        System.out.println("hashCode() -> [" + result + "] ");
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Libro other = (Libro) obj;
        if (isbn == null) {
            if (other.isbn != null)
                return false;
        } else if (!isbn.equals(other.isbn))
            return false;
        return true;
    }
}

public class GestioneLibri {

    /*
    Se una classe esegue l’override del metodo equals, deve farlo anche del metodo hashCode
    I metodi equals() e hashCode() devono usare lo stesso set di campi
    Se due oggetti sono uguali, deve essere uguale anche il loro hash code
     */
    public static void main(String args[]) {
        Libro libro1 = new Libro();
        libro1.setIsbn("123456789");
        libro1.setAutore("Pippo");

        Libro libro2 = new Libro();
        libro2.setIsbn("123456789");
        libro2.setAutore("Pluto");

        System.out.println(libro1.equals(libro2));


        /*
         Ricordando ora che gli elementi inseriti in una HashSet devono essere unici rispetto
         alla chiave utilizzata nella funzione hash, verifichiamo ora se entrambi i libri vengono
         inseriti nella HashSet hs,
         */
        HashSet<Libro> hs = new HashSet<>();
        hs.add(libro1);
        hs.add(libro2);

        for(Libro l : hs){
            System.out.println(l.getIsbn()+ " "+ l.getAutore());
        }
    }
}
