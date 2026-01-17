public class Data {

    private int giorno;
    private int mese;
    private int anno;

    Data(int giorno, int mese, int anno){
        this.giorno = giorno;
        this.mese = mese;
        this.anno = anno;
    }

    public int getGiorno(){
        return giorno;
    }
    public int getMese(){
        return mese;
    }
    public int getAnno(){
        return anno;
    }

    public void setGiorno(int giorno){
        this.giorno = giorno;
    }
    public void setMese(int mese){
        this.mese = mese;
    }
    public void setAnno(int anno){
        this.anno = anno;
    }

    public boolean isBisestile(){
        boolean tf=false;
        if( (anno%4==0 && anno%100!=0) || (anno%400==0) ){ //Se è bisestile
            tf=true;
        }
        return tf;
    }

    public boolean dataValida(){
        boolean tf=false;
        int giorniMese=0;
        if( mese==11 || mese==4 || mese==6 || mese==9 ){
            giorniMese = 30;
        }else if( mese==1 || mese==3 || mese==5 || mese==7 || mese==8 || mese==10 || mese==12 ){
            giorniMese = 31;
        }else if( mese==2 ){
            if( isBisestile() ){
                giorniMese = 29;
            }
            else{
                giorniMese = 28;
            }
        }
        if( giorno>0 && giorno<giorniMese ){
            tf = true;
        }
        return tf;
    }

    public String toString(){
        return (giorno + "/" + mese + "/" + anno);
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