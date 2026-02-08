import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Catalogo<DVD> catalogo = new Catalogo<DVD>(3);
        DVD d1 = new DVD("Author", "Title1", 1234, true, 3.2f);
        DVD d2 = new DVD("Author", "Title2", 4567, false, 3.2f);
        DVD d3 = new DVD("Author", "Title3", 9101, true, 3.2f);
        DVD d4 = new DVD("Author", "Title4", 1121, false, 3.2f);

        catalogo.aggiungi(d1);
        System.out.println( catalogo.toString() );
        catalogo.aggiungi(d2);
        System.out.println( catalogo.toString() );
        catalogo.aggiungi(d3);
        System.out.println( catalogo.toString() );
        catalogo.aggiungi(d4);
        System.out.println( catalogo.toString() );

        catalogo.rimuoviElemento(d2);
        System.out.println( catalogo.toString() );

        System.out.println("\nMedia disponibili: " + catalogo.visualizzaMediaDisponibili() );

        DVD elemento_cercato = catalogo.cercaMediaConTitoloAutore("Title1");
        System.out.println( "\n\nElemento cercato con titolo 'title1'" + elemento_cercato.toString() );

    }
}