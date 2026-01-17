import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Hangar hangar;
        Aeromobile[] aeromobili;
        String codice_id;
        int dl=0, numAeromobili, nPostiAbitacolo;
        float dimAbitacolo, efficienza, potenza;

        System.out.println("Numero aerei nell'hangar? ");
        numAeromobili = input.nextInt();

        hangar = new Hangar(numAeromobili);
        aeromobili = new Aeromobile[numAeromobili];

        int scelta = 0;
        do{
            try{

                System.out.println("\n1. 'Crea' veivolo" +
                        "\n2. Aggiungi un veivolo all'hangar" +
                        "\n3. hangar.toString()" +
                        "\n0. Esci");
                System.out.println("Scelta: ");
                scelta = input.nextInt();
                switch(scelta){
                    case 0:
                        System.exit(0);
                    case 1:
                        System.out.println("\n1. Aeromobile" +
                                "\n2. Aliante" +
                                "\n3. Aereo motore");
                        System.out.println("Scelta: ");
                        scelta = input.nextInt();
                        System.out.println("Codice identificativo veivolo: ");
                        codice_id = input.next();
                        System.out.println("Posti abitacolo: ");
                        nPostiAbitacolo = input.nextInt();
                        System.out.println("Dimensione abitacolo (m2): ");
                        dimAbitacolo = input.nextFloat();
                        switch(scelta){
                            case 1:
                                aeromobili[dl] = new Aeromobile(codice_id, nPostiAbitacolo, dimAbitacolo);
                                break;
                            case 2:
                                System.out.println("Efficienza: ");
                                efficienza = input.nextFloat();
                                aeromobili[dl] = new Aliante(codice_id, nPostiAbitacolo, dimAbitacolo, efficienza);
                                break;
                            case 3:
                                System.out.println("Potenza: ");
                                potenza = input.nextFloat();
                                aeromobili[dl] = new AereoMotore(codice_id, nPostiAbitacolo, dimAbitacolo, potenza);
                                break;
                        }
                        break;
                    case 2:
                        System.out.println("Inserisci il codice identificativo del veivolo che vuoi aggiungere all'hangar");
                        codice_id = input.next();
                        boolean tf = false;
                        int i = 0;
                        while( i<dl && !tf ){
                            if( Objects.equals( aeromobili[i].getCodice_id(), codice_id ) ){
                                tf = true;
                            }
                        }
                        if( tf ){
                            hangar.aggiungiAereo( aeromobili[i] );
                            System.out.println("Aereo aggiunto all'hangar!");
                        }
                        else{
                            throw new CodiceIdentificativoVeivoloException("Non è stato trovato nessun aereo disponibile con il seguente codice identificativo del veivolo: nessun '" + codice_id + "' trovato");
                        }
                        break;
                    case 3:
                        System.out.println( hangar.toString() );
                        break;
                }

            } catch (CodiceIdentificativoVeivoloException e) {
                System.out.println( e.getMessage() );
            } catch (Exception e) {
                System.out.println( e.getMessage() );
            }
        }while(scelta != 0);

    }
}