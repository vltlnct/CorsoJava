/*
package com.anagrafica;
*/
public class Persona {
    // Quale visibilità hanno gli attributi in questo momento  ?
    protected String nome;
    protected String indirizzo;

    public Persona(String nome, String indirizzo) {
        this.nome = nome;
    }

    public Persona() {
        this("xxxx","yyyy");
    }

    public String getNome() {
        return nome;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void visualizza() {
        System.out.println("Nome: " + nome + "\nIndirizzo: " + indirizzo);
    }

    public boolean omonimo(Persona p) {
        return this.nome.equalsIgnoreCase(p.nome);
    }

}