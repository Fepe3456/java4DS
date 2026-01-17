public class Data {

    private int giorno;
    private int mese;
    private int anno;

    Data(int g, int m, int a){
        this.giorno = g;
        this.mese = m;
        this.anno = a;
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

    public void setGiorno(int g){
        this.giorno = g;
    }
    public void setMese(int m){
        this.mese = m;
    }
    public void setAnno(int a){
        this.anno = a;
    }

    public int giorniPassatiDa(Data data){
        int count = 0;

        return count;
    }

    private boolean isBisestile(int anno){
        boolean tf = false;
        if( ( anno % 4 == 0  &&  anno % 100 != 0 ) || ( anno % 400 == 0) ){
            tf = true;
        }
        return tf;
    }

    private int giorniNelMese(int mese){
        int gg = 31;
        if( mese == 4 || mese == 6 || mese == 9 || mese == 11 ){
            gg = 30;
        }
        else if( mese == 2 ){
            if( isBisestile(anno) ){
                gg = 29;
            }
            else{
                gg = 28;
            }
        }
        return gg;
    }

}
