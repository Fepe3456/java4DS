import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try{

            Scanner input = new Scanner(System.in);

            CronometroGiri c;
            int nGiri, count=0;
            int durata;

            System.out.println("Quanti giri? ");
            nGiri = input.nextInt();

            c = new CronometroGiri(nGiri);

            System.out.println("Cronometro partito!");
            c.partito();

            while( count<nGiri ){
                count++;
                System.out.println("\nDurata giro numero " + count + "? ");
                durata = input.nextInt();
                c.marcaGiro(durata);
                System.out.println( "Tempo totale: " + c.getTempoTotale() +
                        "\nGiri rimanenti: " + c.getGiriRimanenti() +
                        "\nDurata ultimo giro: " + c.getDurataUltimoGiro() );
            }

        }catch(Exception e){
            System.out.println( "Si è verificato un errore: \n     " + e.getMessage() );
        }

    }
}
