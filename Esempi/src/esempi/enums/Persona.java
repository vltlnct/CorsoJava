package esempi.enums;

public class Persona {
    private String nominativo;
    private Stagione stagioneNascita;

    public Persona(String nominativo, Stagione stagioneNascita) {
        this.nominativo = nominativo;
        this.stagioneNascita = stagioneNascita;
    }

    public Stagione getStagioneNascita() {
        return stagioneNascita;
    }

    public String getNominativo() {
        return nominativo;
    }

    @Override
    public String toString() {
        return "Persona{" +
                " nominativo: '" + nominativo + '\'' +
                ", stagione di nascita: " + stagioneNascita +
                '}';
    }
}