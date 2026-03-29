package esClinicaMedica;

public class Paziente {

    private String nome;
    private String cognome;
    private String codice_id;

    public Paziente(String nome, String cognome, String codice_id) {
        this.nome = nome;
        this.cognome = cognome;
        this.codice_id = codice_id;
    }

    public String getNome() {
        return nome;
    }
    public String getCognome() {
        return cognome;
    }
    public String getCodice_id() {
        return codice_id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }
    public void setCodice_id(String codice_id) {
        this.codice_id = codice_id;
    }

    public String toString() {
        return "Paziente{" + "\n   Nome: " + nome + "\n   Cognome: " + cognome + "\n   Codice identificativo: " + codice_id + "\n}";
    }
}
