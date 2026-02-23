public class Libro implements Shelfable{

    private String titolo;
    private int pagine;
    private int annoPubblicazione;
    private float prezzo;

    Libro(String titolo, int pagine, int annoPubblicazione, float prezzo){
        this.titolo = titolo;
        this.pagine = pagine;
        this.annoPubblicazione = annoPubblicazione;
        this.prezzo = prezzo;
    }

    @Override
    public String getName() {
        return titolo;
    }
    public int getPagine() {
        return pagine;
    }
    public int getAnnoPubblicazione() {
        return annoPubblicazione;
    }
    public float getPrezzo() {
        return prezzo;
    }

    @Override
    public String getDescription() {
        return "Il libro si intitola '" + titolo + "' ha " + pagine + " pagine, è stato pubblicato l'anno " + annoPubblicazione + " e costa " + prezzo + "€";
    }
}
