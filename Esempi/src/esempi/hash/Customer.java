package esempi.hash;

import java.util.Objects;

public class Customer {
    private String nominativo;
    private Double conto;
    private String codiceFiscale;

    public Customer(String nominativo, Double conto, String codiceFiscale) {
        this.nominativo = nominativo;
        this.conto = conto;
        this.codiceFiscale = codiceFiscale;
    }

    public String getNominativo() {
        return nominativo;
    }

    public Double getConto() {
        return conto;
    }

    public String getCodiceFiscale() {
        return codiceFiscale;
    }
    // Caso 1 - nessun override dei metodi

    // Caso 2
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof Customer)) {
            return false;
        }
        Customer customer = (Customer) o;
        return customer.codiceFiscale.equals(codiceFiscale);
    }

// Caso 3
    public int hashCode() {
        int result = Objects.hash(codiceFiscale);  // y = f(x1)

        return result;
    }
}
