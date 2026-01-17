import java.util.Scanner;

import static java.lang.Character.toLowerCase;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        //      DICHIARAZIONE (o inizializzazione) VARIABILI     //
        Casa casa=null;
        Proprietario proprietario=null;
        String nome, cognome;
        String nomeStanza, occupazioneStanza;
        Data dataNascita=null, dataCostruzioneCasa=null;
        char sesso=' ';
        float lunghezzaStanza=0, larghezzaStanza=0;
        int giorno, mese, anno;
        int numeroStanze=0, scelta=-1;

        boolean tf = true; //Serve per verificare se i dati inseriti in inout sono valido oppure se è necessario mandare un'eccezione

        do{
            try{
                //      MENU'       //
                System.out.println("\n1. Crea proprietario" +
                        "\n2. Crea casa" +
                        "\n3. Aggiungi stanza" +
                        "\n4. Rimuovi stanza" +
                        "\n5. Mostra informazioni casa" +
                        "\n6. Mostra informazioni proprietario" +
                        "\n0. Esci");
                System.out.println("Scelta: ");
                scelta = input.nextInt();

                switch(scelta){
                    case 0: // ESCI //
                        System.exit(0);
                    case 1: // CREAZIONE PROPRIETARIO //
                        System.out.println("Chi è il proprietario della stanza? \n   Nome: ");
                        nome = input.next();
                        System.out.println("   Cognome: ");
                        cognome = input.next();
                        do{
                            try{
                                tf = true;
                                System.out.println("   Sesso: ");
                                sesso = input.next().charAt(0);
                                if( toLowerCase(sesso)!='f' && toLowerCase(sesso)!='m' ){
                                    tf = false;
                                    throw new CarattereNonValidoException("Bisogna selezionare M o F!");
                                }
                                System.out.println("Quando è nato il propretario? \n   Giorno: ");
                                giorno = input.nextInt();
                                System.out.println("   Mese: ");
                                mese = input.nextInt();
                                System.out.println("   Anno: ");
                                anno = input.nextInt();
                                dataNascita = new Data(giorno, mese, anno);
                                if( !( dataNascita.dataValida() ) ){
                                    tf = false;
                                    throw new DataNonValidaException("La data non è valida!");
                                }
                            }catch(CarattereNonValidoException e){
                                System.out.println( e.getMessage() );
                            }catch(DataNonValidaException e){
                                System.out.println( e.getMessage() );
                            } catch (Exception e) {
                                throw new Exception( e.getMessage() );
                            }
                        }while( !tf );
                        proprietario = new Proprietario(nome, cognome, dataNascita, sesso);
                        break;
                    case 2: // COSTRUZIONE CASA //
                        if(proprietario==null){
                            throw new VariabileNecessariaNonCreataException("Non è stato creato nessun proprietario da assegnare alla casa");
                        }
                        do{
                            try{
                                tf = true;
                                System.out.println("Quando è stata costruita la casa? \n   Giorno: ");
                                giorno = input.nextInt();
                                System.out.println("   Mese: ");
                                mese = input.nextInt();
                                System.out.println("   Anno: ");
                                anno = input.nextInt();
                                dataCostruzioneCasa = new Data(giorno, mese, anno);
                                if( !( dataCostruzioneCasa.dataValida() ) ){
                                    tf = false;
                                    throw new DataNonValidaException("La data non è valida!");
                                }
                            }catch(DataNonValidaException e){
                                System.out.println( e.getMessage() );
                            }catch (Exception e) {
                                throw new Exception(e.getMessage());
                            }
                        }while( !tf );

                        do{
                            try{
                                System.out.println("Quante stanze ha la casa? ");
                                numeroStanze = input.nextInt();
                                if( numeroStanze<=0 ){
                                    tf = false;
                                    throw new ValoreNegativoException("Non si può inserire un valore negativo o uguale a 0 di stanze!");
                                }
                            }catch(ValoreNegativoException e){
                                System.out.println( e.getMessage() );
                            }catch (Exception e) {
                                throw new Exception(e.getMessage());
                            }
                        }while( !tf );
                        casa = new Casa(dataCostruzioneCasa, proprietario, numeroStanze);
                        break;
                    case 3: // AGGIUNGI STANZA //
                        if( casa == null ){
                            throw new CasaNullException("La casa non è stata creata!");
                        }
                        if( proprietario == null ){
                            throw new ProprietarioNullException("Il proprietario non è stato creato!");
                        }
                        System.out.println("Nome della stanza: ");
                        nomeStanza = input.next();
                        System.out.println("Occupazione della stanza: ");
                        occupazioneStanza = input.next();
                        try{
                            System.out.println("Lunghezza della stanza: ");
                            lunghezzaStanza = input.nextFloat();
                            System.out.println("Larghezza della stanza: ");
                            larghezzaStanza = input.nextFloat();
                            if( lunghezzaStanza<=0 ){
                                throw new ValoreNegativoException("La lunghezza della stanza non può essere un valore negativo o uguale a 0!");
                            }else if( larghezzaStanza<=0 ){
                                throw new ValoreNegativoException("La larghezza della stanza non può essere un valore negativo o uguale a 0!");
                            }
                        }catch(ValoreNegativoException e){
                            System.out.println( e.getMessage() );
                        }
                        casa.aggiungiStanza(nomeStanza, occupazioneStanza, lunghezzaStanza, larghezzaStanza);
                        break;
                    case 4: // RIMUOVI STANZA //
                        if( casa == null ){
                            throw new CasaNullException("La casa non è stata creata!");
                        }
                        if( proprietario == null ){
                            throw new ProprietarioNullException("Il proprietario non è stato creato!");
                        }
                        try{
                            System.out.println("Nome della stanza: ");
                            nomeStanza = input.next();
                            casa.rimuoviStanza(nomeStanza);
                        }catch(StanzaException e){
                            System.out.println( e.getMessage() );
                        }
                        break;
                    case 5: // MOSTRA INFORMAZIONI CASA //
                        if( casa == null ){
                            throw new CasaNullException("La casa non è stata creata!");
                        }
                        System.out.println( casa.toString() );
                        break;
                    case 6: // MOSTRA INFORMAZIONI PROPRIETARIO //
                        if( proprietario == null ){
                            throw new ProprietarioNullException("Il proprietario non è stato creato!");
                        }
                        System.out.println( proprietario.toString() );
                        break;
                }

            } catch (Exception e) {
                System.out.println( e.getMessage() );
            }
        }while(scelta != 0);

    }
}

/*      RACCOLTA ECCEZIONI CREATE
    MAIN:
        - ValoreNegativoException --> per: lunghezza e larghezza, numero di stanze
        - VariabileNecessariaNonCreata --> per: proprietario non creato (non si può assegnare a casa),
        - CarattereNonValidoException --> per: char sesso
        - DataNonValidaException --> per: data di nascita e di costruzione casa
        - CasaNullException --> per: casa non ancora creata (quindi ancora a null)
        - ProprietarioNullException --> per: proprietario non ancora creato (quindi ancora a null)
    CASA:
        - StanzaException --> per: stanza non trovata in rimuoviStanza()
    STANZA:
        -
    PROPRIETARIO:
        -
    DATA:
        -
* */

/*
Progetta e implementa una classe Casa che rappresenti un’abitazione composta da più Stanze e collegata a un Proprietario.
Ogni casa deve possedere alcune informazioni fondamentali:
    la data di costruzione,
    il proprietario a cui appartiene,
    la metratura totale e
    l’elenco delle stanze che la compongono.
Il proprietario è descritto da
    un nome,
    una data di nascita e
    un sesso, e può esistere indipendentemente dalla casa: la relazione tra Casa e Proprietario è quindi di tipo aggregazione lasca.
Le stanze costituiscono invece una composizione della casa, poiché la loro esistenza dipende da quella dell’abitazione.
Ogni stanza deve contenere le informazioni relative
    alla metratura,
    al nome (ad esempio “Camera”, “Cucina”, “Bagno”) e
    alla propria occupazione, che indica la funzione della stanza. L’occupazione può essere, ad esempio, ricreativa per ambienti come il salotto o la cucina, riposo per le camere da letto, oppure benessere personale per il bagno o locali simili.

Il programma deve prevedere un opportuno sistema di gestione delle eccezioni personalizzate, analogamente all’esercizio precedente.
Devono essere sollevate eccezioni nel caso in cui si tenti di creare una stanza con metratura non valida,
di inserire una stanza duplicata o di accedere a una stanza non esistente.

La casa dovrà inoltre fornire i metodi necessari per
    calcolare la metratura totale,
    aggiungere o rimuovere stanze e
    visualizzare in modo leggibile le informazioni generali dell’abitazione e del proprietario.
* */