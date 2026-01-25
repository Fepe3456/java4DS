public class Mensola<T extends Oggetto> {

    private String nome;
    private String descrizione;
    private int numOggetti;
    private T[] oggetti;
    private int dl;

    Mensola(String nome, String descrizione, int numOggetti){
        this.nome = nome;
        this.descrizione = descrizione;
        this.numOggetti = numOggetti;
        oggetti = (T[]) new Oggetto[numOggetti];
        this.dl = 0;
    }

    public void aggiungi(T oggetto){
        if( numOggetti > oggetti.length ){
            raddoppiaArray();
        }
        oggetti[dl] = oggetto;
        dl++;
    }
    public void raddoppiaArray(){
        this.numOggetti *= 2;
        T[] newArray = (T[]) new Oggetto[numOggetti];
        for(int i=0; i<oggetti.length; i++){
            newArray[i] = oggetti[i];
        }
        oggetti = newArray;
    }

    public void rimuovi(T object) throws MensolaException{
        if( dl!=0 ){
            boolean trovato = false;
            int index=0;
            while( !trovato && index<=dl ){
                if( oggetti[index] == object ){
                    trovato = true;
                    for(int i=0; i<oggetti.length-1; i++){
                        oggetti[i] = oggetti[i+1];
                    }
                    dl--;
                }else{
                    index++;
                }
            }
            if( !trovato ){
                throw new MensolaException("Nella cassaforte non è presente l'elemento che si vuole rimuovere!");
            }
        }
        else{
            throw new MensolaException("Non ci sono elementi da rimuovere!");
        }
    }

    public String toString(){
        String str = "\nMensola{\n   Nome: " + nome + "\n   Descrizione: " + descrizione + "\n   Oggetti: ";
        for(int i=0; i<dl; i++){
            str = str + "\n     " + oggetti[i].toString();
        }
        str += "\n}";
        return str;
    }

}

/*

public class Mensola<T extends OggettoDigitale> {

    private String nome;
    private String descrizione;
    private T[] oggetti;
    private int numeroOggetti;

    // Costruttore
    public Mensola(String nome, String descrizione, int capacita) {
        this.nome = nome;
        this.descrizione = descrizione;
        this.oggetti = (T[]) new OggettoDigitale[capacita];  // Array di tipo generico
        this.numeroOggetti = 0;
    }

    // Metodo per aggiungere un oggetto alla mensola
    public void aggiungiOggetto(T oggetto) {
        if (numeroOggetti == oggetti.length) {
            T[] nuovoArray = (T[]) new OggettoDigitale[oggetti.length * 2];
            System.arraycopy(oggetti, 0, nuovoArray, 0, oggetti.length);
            oggetti = nuovoArray;
        }
        oggetti[numeroOggetti++] = oggetto;
    }

    // Metodo per rimuovere un oggetto dalla mensola
    public void rimuoviOggetto(T oggetto) {
        for (int i = 0; i < numeroOggetti; i++) {
            if (oggetti[i].equals(oggetto)) {
                for (int j = i; j < numeroOggetti - 1; j++) {
                    oggetti[j] = oggetti[j + 1];
                }
                oggetti[--numeroOggetti] = null;
                return;
            }
        }
        System.out.println("Oggetto non trovato.");
    }

    // Metodo per visualizzare il contenuto della mensola
    public void visualizzaContenuto() {
        System.out.println("Mensola: " + nome);
        System.out.println("Descrizione: " + descrizione);
        if (numeroOggetti == 0) {
            System.out.println("La mensola è vuota.");
        } else {
            for (int i = 0; i < numeroOggetti; i++) {
                System.out.println(oggetti[i]);
            }
        }
    }

    // Getter e Setter per nome e descrizione
    public String getNome() {
        return nome;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }
}

* */