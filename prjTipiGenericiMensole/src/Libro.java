public class Libro implements Shelfable {

    private String titolo;
    private String trama;
    private int anno_pubblicazione;

    Libro(String titolo, String trama, int anno_pubblicazione){
        this.titolo = titolo;
        this.anno_pubblicazione = anno_pubblicazione;
        this.trama = trama;
    }

    @Override
    public String getNome() {
        return titolo;
    }
    @Override
    public String getDescrizione() {
        return ( "\nLibro: \n   Titolo: " + titolo + "\n   Anno pubblicazione: " + anno_pubblicazione + "\n   Trama: " + trama );
    }
    @Override
    public void setNome(String nome) {
        this.titolo = nome;
    }
    @Override
    public void setDescrizione(String descrizione) {
        this.trama = descrizione;
    }

}
