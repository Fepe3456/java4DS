public class Film implements Shelfable {

    private String titolo;
    private String trama;
    private String regista;

    Film(String titolo, String trama, String regista){
        this.titolo = titolo;
        this.regista = regista;
        this.trama = trama;
    }

    @Override
    public String getNome() {
        return titolo;
    }
    @Override
    public String getDescrizione() {
        return ( "\nFilm: \n   Titolo: " + titolo + "\n   Regista: " + regista + "\n   Trama: " + trama );
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
