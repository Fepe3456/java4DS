public class Mensola{

    private String nome;
    private String descrizione;
    private int numOggetti;
    private Shelfable[] oggetti;
    private int dl;

    Mensola(String nome, String descrizione, int numOggetti){
        this.nome = nome;
        this.descrizione = descrizione;
        this.numOggetti = numOggetti;
        oggetti = new Shelfable[numOggetti];
        this.dl = 0;
    }

    public void aggiungi(Shelfable oggetto){
        if( numOggetti > oggetti.length ){
            raddoppiaArray();
        }
        oggetti[dl] = oggetto;
        dl++;
    }
    private void raddoppiaArray(){
        this.numOggetti *= 2;
        Shelfable[] newArray = new Shelfable[numOggetti];
        for(int i=0; i<oggetti.length; i++){
            newArray[i] = oggetti[i];
        }
        oggetti = newArray;
    }

    public void rimuovi(Shelfable oggetto) throws MensolaException{
        if( dl!=0 ){
            boolean trovato = false;
            int index=0;
            while( !trovato && index<=dl ){
                if( oggetti[index] == oggetto ){
                    trovato = true;
                    for(int i=index; i<oggetti.length-1; i++){
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
            str = str + "\n    <> Oggetto[" + i + "]     " + oggetti[i].getDescrizione();
        }
        str += "\n}";
        return str;
    }

}
