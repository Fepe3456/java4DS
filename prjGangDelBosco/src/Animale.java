abstract class Animale {

    protected String nome;
    protected float peso;
    protected char sesso;

    Animale(String nome, float peso, char sesso){
        this.nome = nome;
        this.peso = peso;
        this.sesso = sesso;
    }

    public String getNome(){return nome;}
    public float getPeso(){return peso;}
    public char getSesso(){return sesso;}

    abstract int calcolaEta();
    abstract String rappresentazioneTestuale();
    abstract String ottieniVerso();

}

/*
Una classe Animale, che rappresenta le caratteristiche generali di un animale:
    nome, peso, sesso; inoltre si vuole poter conoscere l'età e la rappresentazione testuale dell'Animale stesso.
    ogni animale emette un particolare verso.
* */