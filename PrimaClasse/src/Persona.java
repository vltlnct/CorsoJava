
class Persona {
    private final String nazione = "Italia";
    public static int numeroDipendenti=100000;

    public String azienda;
    private String nome;
    private String cognome;

    public Persona(String azienda, String nome, String cognome) {
        this.azienda = azienda;
        this.nome = nome;
        this.cognome = cognome;
    }
    /*
    public void ciaoDaPersona(){
        System.out.println("Ciao da "+this.nome+" "+this.cognome+ " (invocazione metodo void)");
    }
    public String restituisciCiaoDaPersona(){
        return "Ciao da " + this.nome+" "+this.cognome+ " (ritorno da funzione). ";
    }*/
}