//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Mensola mensola = new Mensola("Mensola1", "descrizione_mensola", 4);
        Libro l = new Libro("TitoloLibro", "trama_libro", 2010);
        Brano b = new Brano("TitoloBrano", 3.10f, 2000);
        Film f = new Film("TitoloFilm", "trama_film", "NomeRegista");
        Oggetto o = new Oggetto("intruso");

        mensola.aggiungi(l);
        mensola.aggiungi(b);
        mensola.aggiungi(f);
        // mensola.aggiungi(o); //'aggiungi(Shelfable)' in 'Mensola' cannot be applied to '(Oggetto)'

        System.out.println( mensola.toString() );

        // mensola.rimuovi(o); 'rimuovi(Shelfable)' in 'Mensola' cannot be applied to '(Oggetto)'
        mensola.rimuovi(b);
        System.out.println( mensola.toString() );

    }
}