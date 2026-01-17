import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{

        Scanner input = new Scanner(System.in);

        PrenotazioneCampo prenotazioneCampo = null;
        PrenotazioneTerraBattuta pcTerraBattuta;
        PrenotazioneErbaSintetica pcErbaSintetica;
        PrenotazioneCoperta pcCoperta;
        Data dataPrenotazione = null;
        String nomeGiocatore = "Federico";
        Orario orarioInizio=null, orarioFine=null;
        int orarioOre, orarioMinuti, orarioSecondi=0, dataGiorno, dataMese, dataAnno,  scelta;

        boolean exceptionVerificata = false;
        do{
            System.out.println("\n1. Prenotazione terra battuta" +
                    "\n2. Prenotazione erba sintetica" +
                    "\n3. Prenotazione coperta" +
                    "\n4. Calcola costo prenotazione" +
                    "\n5. Stampa dettagli" +
                    "\n0. Esci");
            System.out.println("Scelta: ");
            scelta = input.nextInt();

            if( scelta==0 ){
                System.exit(0);
            }
            else if( scelta==5 ){
                try{
                    if( prenotazioneCampo==null ){
                        //exceptionVerificata = true; //In questo caso non è necessario
                        throw new PrenotazioneNonEffettuataException("Errore --> Non ci sono prenotazioni su cui fornire dati!");
                    }
                    System.out.println( prenotazioneCampo.stampaDettagli() );
                }catch(PrenotazioneNonEffettuataException e){
                    System.out.println( e.getMessage() );
                }
            }
            else if( scelta==4 ){
                try{
                    if( prenotazioneCampo==null ){
                        //exceptionVerificata = true; //In questo caso non è necessario
                        throw new PrenotazioneNonEffettuataException("Errore --> Non ci sono prenotazioni su cui fornire dati!");
                    }
                    System.out.println( prenotazioneCampo.stampaDettagli() );
                }catch(PrenotazioneNonEffettuataException e){
                    System.out.println( e.getMessage() );
                }
            }
            else if( scelta>=1 && scelta<=3 ){
                System.out.println("Nome giocatore: ");
                nomeGiocatore = input.next();
                do{
                    try{
                        exceptionVerificata = false;
                        System.out.println("Data: ");
                        System.out.println("   Giorno --> ");
                        dataGiorno = input.nextInt();
                        System.out.println("   Mese --> ");
                        dataMese = input.nextInt();
                        System.out.println("   Anno --> ");
                        dataAnno = input.nextInt();
                        dataPrenotazione = new Data(dataGiorno, dataMese, dataAnno);
                    }catch(DataNonValidaException e){
                        exceptionVerificata = true;
                        System.out.println( e.getMessage() );
                    }
                }while( exceptionVerificata );
                do{
                    try{
                        exceptionVerificata = false;
                        System.out.println("Orario inizio: ");
                        System.out.println("   Ora --> ");
                        orarioOre = input.nextInt();
                        System.out.println("   Minuti --> ");
                        orarioMinuti = input.nextInt();
                        orarioInizio = new Orario(orarioOre, orarioMinuti, orarioSecondi);
                    }catch(OrarioNonValidoException e){
                        exceptionVerificata = true;
                        System.out.println( e.getMessage() );
                    }
                }while( exceptionVerificata );
                do{
                    try{
                        exceptionVerificata = false;
                        System.out.println("Orario fine: ");
                        System.out.println("   Ora --> ");
                        orarioOre = input.nextInt();
                        System.out.println("   Minuti --> ");
                        orarioMinuti = input.nextInt();
                        orarioFine = new Orario(orarioOre, orarioMinuti, orarioSecondi);
                    }catch(OrarioNonValidoException e){
                        exceptionVerificata = true;
                        System.out.println( e.getMessage() );
                    }
                }while( exceptionVerificata );

                if( scelta==1 ){
                    pcTerraBattuta = new PrenotazioneTerraBattuta(nomeGiocatore, dataPrenotazione, orarioInizio, orarioFine);
                    prenotazioneCampo = pcTerraBattuta;
                }
                else if( scelta==2 ){
                    pcErbaSintetica = new PrenotazioneErbaSintetica(nomeGiocatore, dataPrenotazione, orarioInizio, orarioFine);
                    prenotazioneCampo = pcErbaSintetica;
                }
                else if( scelta==3 ){
                    pcCoperta = new PrenotazioneCoperta(nomeGiocatore, dataPrenotazione, orarioInizio, orarioFine);
                    prenotazioneCampo = pcCoperta;
                }
            }

        }while(scelta!=0);


    }
}

/*
Un circolo sportivo vuole gestire le prenotazioni dei propri campi da tennis, che possono essere di diversi tipi
                                                                                (campo in terra battuta, in erba sintetica o coperto).
Progetta un sistema orientato agli oggetti che permetta di registrare e gestire queste prenotazioni.
Definisci una classe PrenotazioneCampo con:
    attributi: nomeGiocatore, data, oraInizio, oraFine;
    un metodo calcolaCosto() (il costo dipende dal tipo di campo e dalla durata);
    un metodo stampaDettagli() che mostra i dati comuni della prenotazione.
Crea tre classi derivate:
    PrenotazioneTerraBattuta
    PrenotazioneErbaSintetica
    PrenotazioneCoperta
Ognuna implementa calcolaCosto() in modo diverso, ad esempio:
    Terra battuta → 15 €/ora
    Erba sintetica → 18 €/ora
    Coperta → 25 €/ora
Nel programma principale:
    crea un elenco di prenotazioni miste (una per ogni tipo di campo);
    calcola e mostra il costo per ciascuna;
    stampa le informazioni complete richiamando i metodi tramite riferimenti alla classe PrenotazioneCampo.
* */