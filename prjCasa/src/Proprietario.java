public class Proprietario {

    private String nome;
    private String cognome;
    public Data nascita;
    private char sesso;

    Proprietario(String nome, String cognome, Data dataNascita, char sesso){
        this.nome = nome;
        this.cognome = cognome;
        this.nascita = dataNascita;
        this.sesso = sesso;
    }

    public String getNome(){
        return nome;
    }
    public String getCognome(){
        return cognome;
    }
    public Data getNascita(){
        return nascita;
    }
    public char getSesso(){
        return sesso;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setCognome(String cognome){
        this.cognome = cognome;
    }
    public void setNascita(int giorno, int mese, int anno){
        nascita.setGiorno(giorno);
        nascita.setMese(mese);
        nascita.setAnno(anno);
    }
    public void setSesso(char sesso){
        this.sesso = sesso;
    }

    public String toString(){
        return "Il proprietario " + nome + " " + cognome + " (" + sesso + ") è nato il " + nascita.toString();
    }

}

/*      RACCOLTA ECCEZIONI CREATE
    MAIN:
        - ValoreNegativoException --> per: lunghezza e larghezza, numero di stanze
        - VariabileNecessariaNonCreata --> per: proprietario non creato (non si può assegnare a casa),
        - CarattereNonValidoException --> per: char sesso
        - DataNonValidaException --> per: data di nascita e di costruzione casa
    CASA:
        - StanzaException --> per: stanza non trovata in rimuoviStanza()
    STANZA:
        -
    PROPRIETARIO:
        -
    DATA:
        -
* */

/*
Il proprietario è descritto da
    un nome,
    una data di nascita e
    un sesso, e può esistere indipendentemente dalla casa: la relazione tra Casa e Proprietario è quindi di tipo aggregazione lasca.
* */