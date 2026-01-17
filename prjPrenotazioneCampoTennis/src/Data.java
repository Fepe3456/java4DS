public class Data {

    private int giorno;
    private int mese;
    private int anno;

    Data(int giorno, int mese, int anno) throws DataNonValidaException {
        this.giorno = giorno;
        this.mese = mese;
        this.anno = anno;
        if( !isValid() ){
            throw new DataNonValidaException("Errore --> La data non è valida!");
        }
    }

    private boolean isValid(){
        boolean tf = true;
        int[] giorniMese = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if( mese<1 || mese > 12 ){
            return false;
        }
        if( isBisestile() ){
            giorniMese[1] = 29;
        }
        if( giorno > giorniMese[mese-1] ){
            tf = false;
        }
        return tf;
    }

    private boolean isBisestile() {
        return (anno % 4 == 0 && anno % 100 != 0) || (anno % 400 == 0);
    }

    public String toString(){
        return giorno + "/" + mese + "/" + anno;
    }

}
