public class Pupazzo {

    private String nome;
    private float prezzo;

    Pupazzo(String nome){
        this.nome = nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    public void setPrezzo(float prezzo){
        this.prezzo = prezzo;
    }
    public float getPrezzo(){
        return prezzo;
    }

    public String toString(){
        return ("Il pupazzo si chiama " + nome + " e costa €" + prezzo);
    }

}
