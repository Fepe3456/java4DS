public class Orario {

    private int ore;
    private int minuti;
    private int secondi;

    Orario(int ore, int minuti, int secondi) throws OrarioNonValidoException {
        this.ore = ore;
        this.minuti = minuti;
        this.secondi = secondi;
        if( !isValid() ){
            throw new OrarioNonValidoException("Errore --> L'orario non è valido!");
        }
    }

    public int getOre(){
        return ore;
    }
    public int getMinuti(){
        return minuti;
    }
    public int getSecondi(){
        return secondi;
    }

    public int calcolaOreTraOrarioENuovoOrario(Orario nuovoOrario){
        int nOre = nuovoOrario.getOre()-ore;
        if( ( nuovoOrario.getMinuti() - minuti ) !=0 ){
            if( ( nuovoOrario.getMinuti() - minuti ) < 0 ){
                nOre -= 1;
            }
            nOre += 1;
        }
        return nOre;
    }

    public boolean isValid(){
        boolean tf = true;
        if( ore < 0 || ore > 23 ){
            tf = false;
        }
        else if( minuti < 0 || minuti > 59 ){
            tf = false;
        }
        else if( secondi < 0 || secondi > 59 ){
            tf = false;
        }
        return tf;
    }

    public String toString(){
        return ore + ":" + minuti + ":" + secondi;
    }

}
