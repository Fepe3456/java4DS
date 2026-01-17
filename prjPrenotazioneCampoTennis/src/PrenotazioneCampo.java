abstract class PrenotazioneCampo {

    protected String nomeGiocatore;
    protected Data data;
    protected Orario oraInizio;
    protected Orario oraFine;

    PrenotazioneCampo(String nomeGiocatore, Data data, Orario oraInizio, Orario oraFine){
        this.nomeGiocatore = nomeGiocatore;
        this.data = data;
        this.oraInizio = oraInizio;
        this.oraFine = oraFine;
    }

    abstract public float calcolaCosto();

    public String stampaDettagli(){
        return "Il campo è stato prenotato da " + nomeGiocatore + " per il giorno " + data.toString() + " dalle ore " + oraInizio.toString() + " alle ore " + oraFine.toString();
    }

}

/*
Definisci una classe PrenotazioneCampo con:
    attributi: nomeGiocatore, data, oraInizio, oraFine;
    un metodo calcolaCosto() (il costo dipende dal tipo di campo e dalla durata);
    un metodo stampaDettagli() che mostra i dati comuni della prenotazione.
* */