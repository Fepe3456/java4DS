package esGestioneOrdiniPizzeria;

public class Main {
    public static void main(String[] args) {

        Pizzeria pizzeria = new Pizzeria();

        Cliente c1 = new Cliente("Mario", "Rossi", "mario@email.it", false);
        Cliente c2 = new Cliente("Luca", "Bianchi", "luca@email.it", true);

        Ordine o1 = new Ordine(c1);
        o1.addProduct("Margherita");
        o1.addProduct("Margherita");
        o1.addProduct("Coca-Cola");

        Ordine o2 = new Ordine(c2);
        o2.addProduct("Diavola");
        o2.addProduct("Coca-Cola");

        pizzeria.addOrder(o1, false);
        pizzeria.addOrder(o2, true);

        System.out.println(pizzeria.stampaStorico());
    }
}

/*

ADT (Interfaces):
    - List
    - Queue
    - Stack
CDT:
    - ArrayList
    - ArrayQueue
    - LLStack
    - LINKED_LIST

* */