import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        CampoMinato campoMinato;
        int nR, nC, maxMine;
        float livello;
        int r=0, c=0;

        System.out.println("Numero di righe del campo: ");
        nR = input.nextInt();
        System.out.println("Numero di colonne del campo: ");
        nC = input.nextInt();
        System.out.println("Livello (0,33 / 0,5 / 0,66): ");
        livello = input.nextFloat();
        System.out.println("Numero massimo di mine del campo: ");
        maxMine = input.nextInt();

        campoMinato = new CampoMinato(nR, nC, livello, maxMine);

        System.out.println("PER INTERROMPERE, INSERIRE -1 COME VALORE DI RIGA O COLONNA DELLA CELLA DA SELEZIONARE");

        System.out.println( campoMinato.toStringAll() );
        System.out.println( campoMinato.toString() );

        do{
            do{
                System.out.print("Posizione cella: \n   riga: ");
                r = input.nextInt();
                System.out.print("   colonna: ");
                c = input.nextInt();
                System.out.println( campoMinato.mossa(r,c) );
            }while( r>=campoMinato.getNfiori() && c>=campoMinato.getNmine() );
        }while( r!=-1 && c!=-1 );

    }
}