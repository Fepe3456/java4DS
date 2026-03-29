package esClinicaMedica;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ClinicaMedica clinica_medica = new ClinicaMedica();

        String nome, cognome, codice_id;
        String specialitaMedica;
        boolean urgente;
        Paziente paziente = null;
        RichiestaVisita richiesta = null;

        int scelta;
        do{
            System.out.println("\n     ===== OPERAZIONI =====\n" +
                    "\n1. Crea e registra paziente " +
                    "\n2. Crea e inserisci richiesta visita " +
                    "\n3. Annulla richiesta " +
                    "\n4. Processa una richiesta " +
                    "\n5. Visualizza elenco delle richieste in coda " +
                    "\n6. Visualizza elenco pazienti " +
                    "\n7. Visualizza lo storico delle operazioni " +
                    "\n0. Esci");
            System.out.println("Scelta: ");
            scelta = input.nextInt();
            switch (scelta){
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    System.out.println("  ... Creazione e Registrazione Paziente ...\n Nome: ");
                    nome = input.next();
                    System.out.println("Cognome: ");
                    cognome = input.next();
                    System.out.println("Codice identificativo: ");
                    codice_id = input.next();
                    paziente = new Paziente(nome, cognome, codice_id);
                    clinica_medica.registraPaziente(paziente);
                    break;
                case 2:
                    System.out.printf("  ... Creazione Richiesta Visita ...\n Identificativo paziente: ");
                    codice_id = input.next();
                    try{
                        paziente = clinica_medica.getPaziente(codice_id);

                        System.out.println("Specialità medica: ");
                        specialitaMedica = input.next();
                        System.out.println("Urgente (sì=true | no=false): ");
                        urgente = input.nextBoolean();
                        RichiestaVisita richiestaVisita = new RichiestaVisita(paziente, specialitaMedica, urgente);
                        clinica_medica.addRichiesta(richiestaVisita);
                    }catch(Exception e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    System.out.println(" ... Rimozione Richiesta dalla Coda ...\n Identificativo paziente: ");
                    codice_id = input.next();
                    try{
                        paziente = clinica_medica.getPaziente(codice_id);
                        richiesta = clinica_medica.getRichiesta(paziente);

                        clinica_medica.annullaRichiestaNonProcessata(richiesta);
                    }catch(Exception e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    System.out.println("   ... Processamento Richiesta In Corso ... ");
                    try{
                        clinica_medica.processaUnaRichiesta();
                        System.out.println("   ... Richiesta Processata ... ");
                    }catch (Exception e){
                        System.out.println( e.getMessage() );
                    }
                    break;
                case 5:
                    System.out.println( clinica_medica.visualizzaRichiesteInCoda() );
                    break;
                case 6:
                    System.out.println( clinica_medica.visualizzaElencoPazienti() );
                    break;
                case 7:
                    System.out.println( clinica_medica.visualizzaOperazioniEffettuate() );
                    break;
                default:
                    System.out.println("Opzione non valida!");
                    break;
            }
        }while( scelta != 0 );

    }
}
