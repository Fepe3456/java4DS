package esGestioneOrdiniPizzeria;

import java.util.ArrayList;
import java.util.List;

public class Ordine {
    private Cliente cliente;
    private List<String> prodotti;

    public Ordine(Cliente cliente) {
        this.cliente = cliente;
        prodotti = new ArrayList<>();
    }

    public void addProduct(String p){
        prodotti.add(p);
    }
}
