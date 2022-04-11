package esempi.hash;
import java.util.Objects;

public class Bilancio implements Comparable<Bilancio> {
    private String nominativo;
    private double valore;

    public Bilancio(String nominativo, double valore) {
        this.nominativo = nominativo;
        this.valore = valore;
    }
    public String getNominativo() {
        return nominativo;
    }
    public double getValore() {
        return valore;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        Bilancio bilancio = (Bilancio) o;
        if ((nominativo == null) && (bilancio.nominativo == null)) {
            return true;
        }
        return  (getNominativo().equals(bilancio.getNominativo()) &&
                (getValore() == bilancio.getValore()));

    }

    @Override
    public int hashCode() {
        int code = Objects.hash(nominativo, valore);
        //Attenzione va tolta sovrascrittura per incoerenza con il metodo equals()
        //code = super.hashCode(); //togliere

//        System.out.println("hashCode() -> Nome:[" + getNominativo() + "] hashCode:[" + code+"]");
        return code;
    }

    @Override
    public int compareTo(Bilancio o) {
        if ((this.getNominativo() == null) && (o.getNominativo() == null))
            return 0;
        if (this.getNominativo() == null)
            return -1;
        if (o.getNominativo() == null)
            return 1;
        return getNominativo().compareTo(o.getNominativo());
    }
}

