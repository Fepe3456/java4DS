public class Oggetto {

    private String titolo;

    Oggetto(String nome){
        this.titolo = nome;
    }

    public void setTitolo(String titolo){
        this.titolo = titolo;
    }
    public String getTitolo(){
        return titolo;
    }

    public String toString(){
        return ("Titolo: '" + titolo + "'");
    }

}
