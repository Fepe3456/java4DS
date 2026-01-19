public class Utente {

    private String nome;
    private int punti;

    Utente(String nome){
        this.nome = nome;
        punti = 0;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    public int getPunti(){
        return punti;
    }

    public void aggiungiPunti(int punti){
        this.punti += punti;
    }

    public String toString(){
        String str = "L'utente si chiama '" + nome + "' ed ha totalizzato " + punti + " punti";
        return str;
    }

}
