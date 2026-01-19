import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Gioco g;
        Dado d;
        Utente g1, g2;
        String n1, n2;
        int facceDado, maxLanci;

        System.out.println("Nome utente 1: ");
        n1 = input.next();
        System.out.println("Nome utente 2: ");
        n2 = input.next();
        System.out.println("Numero facce dado: ");
        facceDado = input.nextInt();
        System.out.println("Numero massimo lanci: ");
        maxLanci = input.nextInt();

        g1 = new Utente( n1 );
        g2 = new Utente( n2 );
        d = new Dado( facceDado );
        g = new Gioco(g1, g2, d, maxLanci, facceDado);

        System.out.println("g1=" + g1.toString());
        System.out.println("g2=" + g2.toString());

        g.gioca();

        System.out.println( g.toString() );


        //Per verificare il funzionamento dell'aggregazione stretta o lasca
        g1.setNome( "Prova" );
        g2.setNome( "prova2" );

        System.out.println("g1=" + g1.toString());
        System.out.println("g2=" + g2.toString());

        System.out.println( g.toString() );

    }
}