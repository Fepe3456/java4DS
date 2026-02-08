public class Catalogo<T extends Mediable> {

    private T[] elements;
    private int dl, maxElements;

    Catalogo(int maxElements){
        dl = 0;
        this.maxElements = maxElements;
        elements = (T[]) new Mediable[ maxElements ];
    }

    public void aggiungi(T object){
        if( dl>=maxElements ){
            doubleArray();
        }
        elements[dl] = object;
        dl++;
    }

    private void doubleArray(){
        maxElements = maxElements*2;
        T[] newArray = (T[]) new Mediable[ maxElements ];
        for(int i=0; i<elements.length; i++){
            newArray[i] = elements[i];
        }
        elements = newArray;
    }

    public void rimuoviElemento(T object) throws CatalogoException{
        if( dl>0 ){
            boolean trovato = false;
            int index=0;
            while( index<dl && !trovato ){
                if( elements[index] == object ){
                    trovato = true;
                }
                else{
                    index ++;
                }
            }
            if( trovato ){
                leftShift(index);
                dl--;
            }
            else{
                throw new CatalogoException("Non è stato trovato l'elemento nel catalogo!");
            }
        }
        else{
            throw new CatalogoException("Nessun elemento da rimuovere!");
        }
    }

    private void leftShift(int index){
        for(int i=index+1; i<maxElements; i++){
            elements[i-1] = elements[i];
        }
    }

    public T cercaMediaConTitoloAutore(String titolo_o_autore) throws CatalogoException{
        T elementoTrovato = null;
        boolean trovato = false;
        int index = 0;
        while( index<maxElements && !trovato ){
            if( elements[index].getTitolo() == titolo_o_autore ){
                trovato = true;
            }
            else{
                index++;
            }
        }
        if( trovato ){
            elementoTrovato = elements[index];
        }
        else{
            throw new CatalogoException("Nessun media trovato con questo titolo!");
        }
        return elementoTrovato;
    }

    public String visualizzaMediaDisponibili(){
        String str = "Media disponibili: ";
        for(int i=0; i<dl; i++){
            if( elements[i].getStatoDisponibilità() ){
                str += "\n   " + elements[i].toString();
            }
        }
        return str;
    }

    public String toString(){
        String str = "Catalogo: ";
        for(int i=0; i<dl; i++){
            str += "\n   " + (i+1) + ". " + elements[i].toString();
        }
        return str;
    }

}

/*
Si realizzi un sistema che consenta di:
Definire un’interfaccia generica per i media, includendo i metodi per il prestito e la restituzione.

Gestire i media in cataloghi generici tramite i generics.

Aggiungere e rimuovere media da un catalogo.

Ricercare media per titolo o autore all’interno di un catalogo.

Visualizzare i media disponibili in un catalogo.

Prestare e restituire media tramite identificativo.

Gestire più cataloghi all’interno della biblioteca.

Ricercare un media all’interno di tutti i cataloghi.

Visualizzare lo stato di disponibilità complessivo di tutti i media.

* */