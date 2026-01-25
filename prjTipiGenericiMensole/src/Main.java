//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Mensola<Oggetto> mensola1 = new Mensola<>("Mensola1", "Descrizione", 3);
        Libro l1 = new Libro("titolo l1");
        Libro l2 = new Libro("titolo l2");
        Libro l3 = new Libro("titolo l3");
        Brano b1 = new Brano("titolo b1");
        Brano b2 = new Brano("titolo b2");
        Brano b3 = new Brano("titolo b3");
        Film f1 = new Film("titolo f1");
        Film f2 = new Film("titolo f2");
        Film f3 = new Film("titolo f3");
        Integer int1 = new Integer(2);

        mensola1.aggiungi(l1);
        mensola1.aggiungi(b2);
        mensola1.aggiungi(f3);

        System.out.println( mensola1.toString() );

        // mensola1.aggiungi(int1); //'aggiungi(Oggetto)' in 'Mensola' cannot be applied to '(java.lang.Integer)'

    }
}