public class CronometroGiri {

    private float tempoDiPartenza; //Il momento in cui il cronometro è stato fatto partire
    private float tempoDiPartenzaGiroCorrente; //il valore del cronometro all'inizio del giro corrente
    private float durataUltimoGiro; //il tempo impiegato per effettuare l'ultimo giro; con ultimo si intende rispetto al giro corrente
    private float tempoTotale; //il tempo totale trascorso dall'inizio della gara fino all'ultimo giro completo
    private boolean inEsecuzione;
    private int numeroGiri;
    private int giriCompletati;


    CronometroGiri(int nGiri){
        this.numeroGiri = nGiri;
        reset();
    }

    public void reset(){
        this.tempoDiPartenza = 0;
        this.tempoDiPartenzaGiroCorrente = tempoDiPartenza;
        this.inEsecuzione = false;
        this.giriCompletati = 0;
    }

    public void partito() throws CronometroGiaPartitoException {
        if( !inEsecuzione ){
            inEsecuzione = true;
        }
        else{
            throw new CronometroGiaPartitoException();
        }
    }

    public void marcaGiro(float durata) throws GiriCompletatiException, ValoreNegativoException {
        if( durata<=0 ){
            throw new ValoreNegativoException("La durata del giro deve essere positiva (durataGiro>0)");
        }
        if( giriCompletati<numeroGiri ){
            durataUltimoGiro = durata;
            tempoDiPartenzaGiroCorrente += durataUltimoGiro;
            tempoTotale += durataUltimoGiro;
            giriCompletati++;
        }
        else{
            throw new GiriCompletatiException();
        }
    }

    public float getDurataUltimoGiro(){
        return durataUltimoGiro;
    }

    public float getTempoTotale(){
        return tempoTotale;
    }

    public int getGiriCompletati(){
        return giriCompletati;
    }

    public int getGiriRimanenti(){
        return (numeroGiri - giriCompletati);
    }

}


/*
 Scrivere una classe CronometroGiri che possa essere utilizzata per cronometrare i giri di una corsa. La classe dovrebbe avere le seguenti variabili di istanza private:
     inEsecuzione - booleano che indica se il cronometro è in esecuzione;
     tempoDiPartenza - Il momento in cui il cronometro è stato fatto partire;
     tempoDiPartenzaGiroCorrente - il valore del cronometro all'inizio del giro corrente;
     durataUltimoGiro - il tempo impiegato per effettuare l'ultimo giro; con ultimo si intende rispetto al giro corrente;
     tempoTotale - il tempo totale trascorso dall'inizio della gara fino all'ultimo giro completo;
     giriCompletati
     numeroGiri - il numero totale di giri previsti per questa gara;
 La classe dovrebbe avere i seguenti metodi:
     CronometroGiri(n)
     partito()
     marcaGiro()
     getDurataUltimoGiro()
     getTempoTotale()
     getGiriRimanenti()
 Tutti i tempi devono essere espressi in secondi.
* */
