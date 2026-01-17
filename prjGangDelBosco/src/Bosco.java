import java.util.Objects;

public class Bosco {

    private String nomeBosco;
    private String localita;
    private float estensione;
    private Animale[] animali;
    private int dl;

    Bosco(String nomeBosco, String localita, float estensione, int quantiAnimali){
        this.nomeBosco = nomeBosco;
        this.localita = localita;
        this.estensione = estensione;
        this.animali = new Animale[quantiAnimali];
        this.dl = 0;
    }

    public void aggiungiLupo(Lupo lupo) throws IndexOutOfBoundsException {
        if( dl == animali.length ){
            throw new IndexOutOfBoundsException("Il limite massimo di animali in questo bosco è stato raggiunto!");
        } else {
            animali[dl] = lupo;
            dl++;
        }
    }
    public void aggiungiOrso(Orso orso) throws IndexOutOfBoundsException {
        if( dl == animali.length ){
            throw new IndexOutOfBoundsException("Il limite massimo di animali in questo bosco è stato raggiunto!");
        } else {
            animali[dl] = orso;
            dl++;
        }
    }

    public void rimuoviAnimale(String nome) throws  ArrayVuotoException, ValoreNonTrovatoException{
        if( dl==0 ){
            throw new ArrayVuotoException("Nel bosco non è presente nessun animale da rimuovere!");
        } else {
            boolean trovato = false;
            for (int i = 0; i < dl - 1; i++) {
                if (Objects.equals(animali[i].getNome(), nome)) {
                    trovato = true;
                }
                if (trovato) {
                    animali[i] = animali[i + 1];
                }
            }
            dl--; //Diminuire la dimensione logica
            if( !trovato ){
                throw new ValoreNonTrovatoException("Non è stato trovato nessun animale all'interno del bosco con questo nome!");
            }
        }
    }

    public String toString(){
        String str = "Il bosco '" + this.nomeBosco + "' che si trova a " + localita + " si estende per " + estensione + " ettari. Il bosco è composto da: ";
        if( dl== 0 ){
            str += "\n     Nessun animale presente";
        }
        else{
            for(int i=0; i<dl; i++){
                str += "\n     " + animali[i].rappresentazioneTestuale();
            }
        }
        return str;
    }

}

/*
Una classe Bosco che descrive:
    nome, localita, estensione (in ettari) e tutti gli animali (lupi e orsi) che lo abitano.
    ad ogni nuova nascita o morte l'elenco degli animali viene aggiornato
    deve essere possibile conoscere i dati dei vari orsi, dei vari lupi o di tutti gli animali presenti.
* */