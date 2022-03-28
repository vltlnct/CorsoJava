import com.compuni.*;

import java.util.Date;

public class Docente extends Persona {
    private String codFiscale;        // Nuova variabile istanza
    private String materiaInsegnata; // Nuova variabile istanza

    public Docente(String nome,
                   String cognome,
                   Date dataNascita,
                   double altezza,
                   int peso,
                   StatoCivile statoCivile,
                   String codFiscale,
                   String materiaInsegnata) {
        super(nome, cognome, dataNascita, altezza, peso, statoCivile);
        this.codFiscale = codFiscale;
        this.materiaInsegnata = materiaInsegnata;
    }

    public String getCodFiscale() {
        return codFiscale;
    }

    public void setCodFiscale(String codFiscale) {
        this.codFiscale = codFiscale;
    }

    public String getMateriaInsegnata() {
        return materiaInsegnata;
    }

    public void setMateriaInsegnata(String materiaInsegnata) {
        this.materiaInsegnata = materiaInsegnata;
    }


}
