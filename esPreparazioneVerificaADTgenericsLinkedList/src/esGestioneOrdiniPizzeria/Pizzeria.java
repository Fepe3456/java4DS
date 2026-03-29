package esGestioneOrdiniPizzeria;

import java.util.List;

public class Pizzeria {

    private ArrayQueue<Ordine> ordiniNormali;
    private ArrayQueue<Ordine> ordiniImportanti;
    private LLStack<Ordine> history;
    private List<String> prodotti;

    public Pizzeria() {
        this.ordiniNormali = new ArrayQueue<>(20);
        this.ordiniImportanti = new ArrayQueue<>(20);
        this.history = new LLStack<>();
    }

    public void addOrder(Ordine order, boolean important){
        if( important ){
            ordiniImportanti.enqueue(order);
        }
        else{
            ordiniNormali.enqueue(order);
        }
    }

    //preparazione e rimozione ordine ...


    public String getProdotti() {
        return prodotti.toString();
    }

    public String stampaStorico() {
        return history.show();
    }
}
