package com.prodotti;
import java.util.Date;
import java.util.Objects;

public class Prodotto {
    private String codice;
    private Date dataIngresso;
    private String nome;
    private String produttore;


    public Prodotto(String codice, Date dataIngresso, String nome,  String produttore) {
        this.codice = codice;
        this.dataIngresso = dataIngresso;
        this.nome = nome;
        this.produttore = produttore;

    }

    public String getCodice() {
        return codice;
    }


    @Override
    public boolean equals(Object o) {
/*        if (this == o) return true;
        if (!(o instanceof Prodotto))
            return false;
        Prodotto persona = (Prodotto) o;
        boolean ret = this.getEta() == persona.getEta()
                && Objects.equals(getNome(), persona.getNome())
                && Objects.equals(getCognome(),
                persona.getCognome());
        return ret;*/
        return true;
    }


}
