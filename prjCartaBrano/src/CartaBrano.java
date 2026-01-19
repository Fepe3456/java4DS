public class CartaBrano {

    private int nBrani;
    private boolean attivata;

    CartaBrano(int nBrani) throws Exception{
        if( nBrani>0 ){
            this.nBrani = nBrani;
        }
        else{
            throw new Exception("Numero di brani non valido"); //Lancio dell'eccezione
        }
        this.attivata = false;
    }

    public void attiva() throws CartaGiaAttivata {
        if( !attivata ){
            attivata = true;
        }
        else{
            throw new CartaGiaAttivata("Carta già attiva");
        }
    }

    public void compraBrano() throws Exception {
        if( attivata ){
            nBrani--;
        }
        else{
            throw new Exception("Carta non attiva");
        }
    }

    public int braniRimanenti() throws Exception {
        if( nBrani>=0 ){
            return nBrani;
        }
        else{
            throw new Exception("Errore, brani non disponibili");
        }
    }

}

/*
    Creare una classe CartaBrano che rappresenta una carta prepagata per l'acquisto di brani musicali online. Deve avere le seguenti variabili di istanza private:
    brani - il numero di brani sulla carta;
    attivata - vero se la carta è stata attivata;
    Inoltre deve avere i seguenti metodi:
    CartaBrano(n)
    attivata()
    compraBrano()
    braniRimanenti() -
* */