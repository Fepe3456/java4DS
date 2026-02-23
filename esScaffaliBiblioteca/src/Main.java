import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Scaffale scaffale = new Scaffale(5);

        int scelta;
        String titolo;
        int pagine, annoPubblicazione;
        float prezzo;
        do{
            System.out.println("\n1. Crea e Aggiungi Libro" +
                    "\n2. Rimuovi Libro" +
                    "\n3. Crea e Aggiungi .." +
                    "\n4. Rimuovi .." +
                    "\5. Visualizza Scaffale" +
                    "\n0. Esci");
            scelta = input.nextInt();
            switch( scelta ){
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    System.out.println("Titolo: ");
                    titolo = input.next();
                    System.out.println("Numero pagine: ");
                    pagine = input.nextInt();
                    System.out.println("Anno pubblicazione: ");
                    annoPubblicazione = input.nextInt();
                    System.out.println("Prezzo: ");
                    prezzo = input.nextFloat();
                    Libro libro = new Libro(titolo, pagine, annoPubblicazione, prezzo);
                    scaffale.add(libro);
                case 2:
                    
            }
        }while(scelta != 0);

    }
}

/*
    1️⃣ Biblioteca universitaria con scaffali generici

    Una biblioteca universitaria gestisce diversi scaffali, ciascuno dedicato a una tipologia di materiale:
        libri cartacei,
        riviste scientifiche e
        tesi di laurea.

    Si realizzi una classe generica Scaffale<T> che consenta di:

        memorizzare un numero massimo di elementi;

        aggiungere un elemento allo scaffale;

        rimuovere un elemento dato l’indice;

        visualizzare tutti gli elementi presenti.

    Si definiscano le classi Libro, Rivista e Tesi, ciascuna con almeno titolo e autore.
    Nel main creare:

        uno scaffale di Libro,

        uno di Rivista,

        uno di Tesi,
    e testare tutte le funzionalità.
* */