public class Brano implements Shelfable {

    private String titolo;
    private float durata;
    private int anno_pubblicazione;

    Brano(String titolo, float durata, int anno_pubblicazione){
        this.titolo = titolo;
        this.anno_pubblicazione = anno_pubblicazione;
        this.durata = durata;
    }

    @Override
    public String getNome() {
        return titolo;
    }
    @Override
    public String getDescrizione() {
        return ( "\nBrano: \n   Titolo: " + titolo + "\n   Anno pubblicazione: " + anno_pubblicazione + "\n   Durata: " + durata );
    }
    @Override
    public void setNome(String nome) {
        this.titolo = nome;
    }
    @Override
    public void setDescrizione(String descrizione) {

    }
}
