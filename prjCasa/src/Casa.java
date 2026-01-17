import java.util.Objects;

public class Casa {

    private Data dataCostruzione;
    private Proprietario proprietario;
    private float metraturaTotale;
    private Stanza[] stanze;
    private int dl;

    Casa(Data dataCostruzione, Proprietario proprietario, int numeroStanze){
        this.dataCostruzione = dataCostruzione;
        this.proprietario = proprietario;
        metraturaTotale = 0;
        dl = 0;
        stanze = new Stanza[numeroStanze];
    }

    public void aggiungiStanza(String nome, String occupazione, float lunghezza, float larghezza){
        stanze[dl] = new Stanza(nome, occupazione, lunghezza, larghezza);
        metraturaTotale += stanze[dl].getMetratura();
        dl++;
    }

    public void rimuoviStanza(String nome) throws StanzaException{
        int i=0;
        boolean tf = false;
        while( !tf && i<=dl){
            if(Objects.equals(stanze[i].getNome(), nome)){
                metraturaTotale -= stanze[i].getMetratura();
                for(int j=i; j<dl-1; j++){
                    stanze[j] = stanze[j+1];
                }
                stanze[dl] = null;
                dl--;
                tf = true;
            }
            i++;
        }
        if( !tf ){ //Se tf=false, quindi se non è stata trovata una stanza con questo nome
            throw new StanzaException("Stanza non trovata! (Nome non valido!)");
        }
    }

    public Proprietario getProprietario(){
        return proprietario;
    }
    public Data getDataCostruzione(){
        return dataCostruzione;
    }
    public float getMetraturaTotale(){
        return metraturaTotale;
    }
    public Stanza[] getStanzeRegistrate(){
        Stanza[] newStanze = new Stanza[dl];
        for(int i=0; i<dl; i++){
            newStanze[i] = stanze[i];
        }
        return newStanze;
    }

    public void setProprietario(Proprietario newProprietario){
        this.proprietario = newProprietario;
    }
    public void setDataCostruzione(Data newDataCostruzione){
        this.dataCostruzione = newDataCostruzione;
    }

    public String toString(){
        String str = "Informazioni sulla casa:\n   " +
                "\n   " + proprietario.toString() +
                "\n   Data costruzione: " + dataCostruzione.toString() +
                "\n   Metratura totale: " + metraturaTotale;
        str += "\n   Stanze:";
        for(int i=0; i<dl; i++){
            str += "\n      Stanza '" + stanze[i].getNome() + "' con occupazione '" + stanze[i].getOccupazione() + "' e con metratura " + stanze[i].getMetratura();
        }
        return str;
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
Ogni casa deve possedere alcune informazioni fondamentali:
    la data di costruzione,
    il proprietario a cui appartiene,
    la metratura totale e
    l’elenco delle stanze che la compongono.

La casa dovrà inoltre fornire i metodi necessari per
    calcolare la metratura totale,
    aggiungere o rimuovere stanze e
    visualizzare in modo leggibile le informazioni generali dell’abitazione e del proprietario.
* */