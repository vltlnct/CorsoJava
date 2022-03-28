import com.compuni.*;

import java.util.Date;

public class Studente extends Persona {
    // Studente eredita variabili e metodi da Persona

    private int matricola;        // Nuova variabile istanza
    private String pianoDiStudio; // Nuova variabile istanza

    // Nuova variabile statica (di classe)
    private static int nextMatricola = 1;

    public Studente(String nome,
                    String cognome,
                    Date dataNascita,
                    double altezza,
                    int peso,
                    StatoCivile statoCivile,
                    int matricola,
                    String pianoDiStudio) {
        super(nome, cognome, dataNascita, altezza, peso, statoCivile);
        this.matricola = matricola;
        this.pianoDiStudio = pianoDiStudio;
    }
    public Studente(String nome,
                    String cognome,
                    Date dataNascita,
                    double altezza,
                    int peso,
                    StatoCivile statoCivile,
                    String pianoDiStudio) {
        super(nome, cognome, dataNascita, altezza, peso, statoCivile);
        this.matricola = nextMatricola++;
        this.pianoDiStudio = pianoDiStudio;
    }



    // Nuovo metodo
    public String getPdS() {

        return pianoDiStudio;
    }

    // Nuovo metodo
    public void modificaPdS(String pianoDiStudio) {
        this.pianoDiStudio += pianoDiStudio + "\n";
    }

    public int getMatricola() {
        return matricola;
    }

    public String getPianoDiStudio() {
        return pianoDiStudio;
    }

    public void setPianoDiStudio(String pianoDiStudio) {
        this.pianoDiStudio = pianoDiStudio;
    }
}
