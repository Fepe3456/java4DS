public class Stanza {

    private String nome;
    private String occupazione;
    private float metratura;

    Stanza(String nome, String occupazione, float lunghezza, float larghezza){
        this.nome = nome;
        this.occupazione = occupazione;
        this.metratura = lunghezza * larghezza;
    }

    public String getNome(){
        return nome;
    }
    public String getOccupazione(){
        return occupazione;
    }
    public float getMetratura(){
        return metratura;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setOccupazione(String occupazione){
        this.occupazione = occupazione;
    }
    public void setMetratura(float lunghezza, float larghezza){
        this.metratura = lunghezza * larghezza;
    }

    public String toString(){
        return "La stanza '" + nome + "' con occupazione '" + occupazione + "', misura " + metratura + " m2 ";
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
Le stanze costituiscono invece una composizione della casa, poiché la loro esistenza dipende da quella dell’abitazione.
Ogni stanza deve contenere le informazioni relative
    alla metratura,
    al nome (ad esempio “Camera”, “Cucina”, “Bagno”) e
    alla propria occupazione, che indica la funzione della stanza. L’occupazione può essere, ad esempio, ricreativa per ambienti come il salotto o la cucina, riposo per le camere da letto, oppure benessere personale per il bagno o locali simili.
* */