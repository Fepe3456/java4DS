public class DVD implements Mediable {

    private String autore;
    private String titolo;
    private int identificativo;
    private boolean stato;
    private float durata;

    DVD(String autore, String titolo, int identificativo, boolean stato, float durata){
        this.autore = autore;
        this.titolo = titolo;
        this.identificativo = identificativo;
        this.stato = stato;
        this.durata = durata;
    }

    @Override
    public String getAutore() {
        return autore;
    }

    @Override
    public String getTitolo() {
        return titolo;
    }

    @Override
    public int getIdentificativo() {
        return identificativo;
    }

    @Override
    public boolean getStatoDisponibilità() {
        return stato;
    }

    public String toString(){
        String str = "   Titolo: " + titolo + "\n   Autore: " + autore + "\n   Identificativo: " + identificativo + "\n   Durata: " + durata + "\n   Stato: ";
        if( stato ){
            str += "disponibile";
        }
        else{
            str += "non disponibile";
        }
        return str;
    }
}
