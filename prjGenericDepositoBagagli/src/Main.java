import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int dfDeposito;
        int identificativo;
        float peso, capienza;

        System.out.println("Numero elementi massimi nel deposito: ");
        dfDeposito = input.nextInt();

        DepositoBagagli depositoBagagli = new DepositoBagagli(10);

        int scelta = -1;
        do{
            System.out.println("\n0. Esci" +
                    "\n1. Crea e aggiungi valigia al deposito" +
                    "\n2. Crea e aggiungi zaino al deposito" +
                    "\n3. Crea e aggiungi pacco al deposito" +
                    "\n4. Visualizza deposito");
            scelta = input.nextInt();
            switch( scelta ){
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    System.out.println("... Creazione valigia ...\n Identificativo: ");
                    identificativo = input.nextInt();
                    System.out.println("\nPeso: ");
                    peso = input.nextFloat();
                    Valigia valigia = new Valigia(identificativo, peso);
                    depositoBagagli.addElement(valigia);
                    break;
                case 2:
                    System.out.println("... Creazione zaino ...\n Identificativo: ");
                    identificativo = input.nextInt();
                    System.out.println("\nPeso: ");
                    peso = input.nextFloat();
                    System.out.println("\nCapienza: ");
                    capienza = input.nextFloat();
                    Zaino zaino = new Zaino(identificativo, peso, capienza);
                    depositoBagagli.addElement(zaino);
                    break;
                case 3:
                    System.out.println("... Creazione pacco ...\n Identificativo: ");
                    identificativo = input.nextInt();
                    System.out.println("\nPeso: ");
                    peso = input.nextFloat();
                    System.out.println("\nCapienza: ");
                    capienza = input.nextFloat();
                    Pacco pacco = new Pacco(identificativo, peso, capienza);
                    depositoBagagli.addElement(pacco);
                    break;
                case 4:
                    System.out.println( depositoBagagli.toString() );
                    break;
                default:
                    System.out.println("Opzione non valida!");
                    break;
            }
        }while(scelta != 0);

    }
}