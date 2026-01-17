import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        CronometroGiri cronometro;
        Gara gara;
        Pilota pilota;
        int nGiri = 0, count = 0, scelta;
        float durata;
        String nome;

        try{
            System.out.println("Quanti giri? ");
            nGiri = input.nextInt();
            if( nGiri < 0 ){
                throw new ValoreNegativoException("Il numero di giri deve essere maggiore di 0 (nGiri>0)");
            }
        }catch(ValoreNegativoException e){
            System.out.println("Si è verificato un errore:\n     " + e.getMessage() );
            nGiri = 1;
        }catch(Exception e){
            System.out.println("Si è verificato un errore:\n     " + e.getMessage() );
        }

        cronometro = new CronometroGiri(nGiri);
        gara = new Gara("default", 10);
        pilota = new Pilota("default");
        try{
            do{
                System.out.println("\n1. Creare una gara" +
                        "\n2. Assegnare / Cambiare pilota" +
                        "\n3. Avviare la gara" +
                        "\n4. Marcare un giro" +
                        "\n5. Mostrare stato");
                System.out.print("\nNumero scelta: ");
                scelta = input.nextInt();
                switch(scelta){
                    case 0:
                        System.exit(0);
                    case 1:

                        break;
                    case 2:
                        System.out.println("Nome pilota: ");
                        nome = input.next();
                        pilota = new Pilota(nome);
                        gara.assegnaPilota(pilota);
                        break;
                    case 3:
                        gara.avvia();
                        break;
                    case 4:
                        System.out.println("Durata giro numero " + (gara.getGiriCompletati()+1) );
                        durata = input.nextFloat();
                        gara.marcaGiro(durata);
                        break;
                    case 5:
                        System.out.println("Pilota: " + pilota.getNome() +
                                "\nGiri completati: " + cronometro.getGiriCompletati() +
                                "\nGiri rimanenti: " + cronometro.getGiriRimanenti() +
                                "\nTempo totale: " + cronometro.getTempoTotale() +
                                "\nGiri: \n" + gara.toStringGiri() );
                        //mostrare stato (pilota, giri completati/rimanenti, tempo totale, elenco dei giri)
                        break;
                }
            }while( cronometro.getGiriRimanenti()!=0 );

        }catch(GiriCompletatiException e){
            System.out.println("Si è verificato un errore:\n     " + e.getMessage() );
        }catch(ValoreNegativoException e){
            System.out.println("Si è verificato un errore:\n     " + e.getMessage() );
        }catch(Exception e){
            System.out.println("Si è verificato un errore:\n     " + e.getMessage() );
        }

    }
}

