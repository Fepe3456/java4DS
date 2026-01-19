public class Gioco {

    private Utente g1;
    private Utente g2;
    private Dado dado;
    private int maxLanci;
    private int lanciEffettuati;

    Gioco(Utente g1, Utente g2, Dado dado, int maxLanci, int nFacce){
        this.g1 = new Utente( g1.getNome() ); //Aggregazione stretta
        this.g2 = new Utente( g2.getNome() ); //Aggregazione stretta
        //this.g1 = g1; //Aggregazione lasca
        //this.g2 = g2; //Aggregazione lasca
        this.dado = dado; //Aggregazione lasca
        this.maxLanci = maxLanci;
        this.lanciEffettuati = 0;
    }

    public void gioca(){
        while( lanciEffettuati <= maxLanci ){
            g1.aggiungiPunti( dado.lancio() );
            g2.aggiungiPunti( dado.lancio() );
            lanciEffettuati++;
        }

    }

    public void reset(){
        g1.aggiungiPunti( -( g1.getPunti() ) );
        g2.aggiungiPunti( -( g2.getPunti() ) );
    }

    public String toString(){
        String str = g1.getNome() + " ha totalizzato " + g1.getPunti() + " punti\n" + g2.getNome() + " ha totalizzato " + g2.getPunti() + " punti";
        return str;
    }

}
