import java.util.ArrayList;
import java.util.List;

public class Cassaforte<T> {

    private List<T> elements;
    private int maxElements;

    Cassaforte(int max){
        this.maxElements = max;
        this.elements = new ArrayList<T>();
    }

    public void aggiungi(T object) throws CassaforteException{
        if( elements.size() <= maxElements-1 ){
            elements.add(object);
        }
        else{
            throw new CassaforteException("Numero massimo di elementi da aggiungere nella cassaforte già raggiunto!");
        }
    }

    public void rimuovi(T object) throws CassaforteException{
        if( elements.size() > 0 ){
            if( elements.contains(object) ){
                elements.remove(object);
            }
            else{
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
        return (   "\nCassaforte{\n   Numero massimo elementi: " + maxElements + "\n   Elementi:\n      " + elements.toString() + "\n}\n"   );
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