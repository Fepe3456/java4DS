public class Cassaforte2<T> {

    private T[] elements;
    private int maxElements;
    private int dl;

    Cassaforte2(int max){
        this.maxElements = max;
        this.elements = (T[]) new Object[max];
        this.dl=0;
    }

    public void aggiungi(T object) throws CassaforteException{
        if( dl>=maxElements ){
            //throw new CassaforteException("Numero massimo di elementi da aggiungere nella cassaforte già raggiunto!");
               //Oppure creo un array lungo il doppio
            raddoppiaArray();
        }
        elements[dl] = object;
        dl++;
    }

    private void raddoppiaArray(){
        T[] newArray = (T[]) new Object[maxElements*2];
        for(int i=0; i<elements.length; i++){
            newArray[i] = elements[i];
        }
        elements = newArray;
    }

    public void rimuovi(T object) throws CassaforteException{
        if( dl!=0 ){
            boolean trovato = false;
            int index=0;
            while( !trovato && index<=dl ){
                if( elements[index] == object ){
                    trovato = true;
                    for(int i=0; i<elements.length-1; i++){
                        elements[i] = elements[i+1];
                    }
                    dl--;
                }else{
                    index++;
                }
            }
            if( !trovato ){
                throw new CassaforteException("Nella cassaforte non è presente l'elemento che si vuole rimuovere!");
            }
        }
        else{
            throw new CassaforteException("Non ci sono elementi da rimuovere!");
        }
    }

    public int getMaxElements(){return maxElements;}
    public void setMaxElements(int max){this.maxElements=max;}

    public String toString(){
        String str="\nCassaforte{\n   Numero massimo di elementi: " + maxElements + "\n   Elementi:";
        for(int i=0; i<dl; i++){
            str += "\n      " + elements[i];
        }
        str += "\n}";
        return str;
    }

}

/*
Supponiamo che in una banca ci siano svariate casseforti. Queste casseforti possono contenere oggetti di tipo diverso.
I tipi possono essere documenti (String), banconote (Integer) e monete (Float).
La cassaforte deve poter:
    - Memorizzare un numero limitato di oggetti.
    - Permettere di aggiungere, ritirare e visualizzare oggetti.
Si ipotizzano 3 casseforti dislocate in diverse stanze. Una per i documenti, una per le monete e una per le banconote

Per questo esercizio utilizza i tipi generici
* */