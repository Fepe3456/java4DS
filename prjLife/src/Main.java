import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Life life, life2;
        int r, c, n_gen, maxVicini, minVicini, numNascita;

        System.out.println("Quanto è larga la colonia (numero righe)? ");
        r = input.nextInt();
        System.out.println("Quanto è lunga la colonia (numero colonne)? ");
        c = input.nextInt();
        System.out.println("Di quante generazione si evolve la colonia? ");
        n_gen = input.nextInt();
        System.out.println("REGOLE EVOLUZIONE\n" +
                "   1. Quanti vicini minimi si devono avere? ");
        minVicini = input.nextInt();
        System.out.println("   2. Quanti vicini massimi si devono avere? ");
        maxVicini = input.nextInt();
        System.out.println("   2. Quanti vicini vivi deve avere una cella morta per poter vivere? ");
        numNascita = input.nextInt();

        life = new Life(r, c);

        System.out.println("life: ");
        System.out.println("\nColonia all'inizio:" +
                life.toString());

        life.evoluzione(n_gen, maxVicini, minVicini, numNascita);

        System.out.println("\nColonia evoluta: " +
                life.toString());


        //Costruttore senza parametri
        life2 = new Life();
        System.out.println("life: ");
        System.out.println("\nColonia all'inizio:" +
                life2.toString());
        life2.evoluzione(n_gen, maxVicini, minVicini, numNascita);
        System.out.println("\nColonia evoluta: " +
                life2.toString());


    }
}