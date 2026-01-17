import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Bosco bosco = null;
        Lupo lupo;
        Orso orso;
        String nome, localita, nomeBranco;
        char sesso='?';
        float estensione, peso=0;
        boolean boscoCreato = false, tfException = false, radiocollare;
        int quantiAnimali, giornoNascita, meseNascita, annoNascita;
        int scelta;

        do{
            System.out.println("\n1. Creazione bosco" +
                    "\n2. Aggiungi lupo al bosco" +
                    "\n3. Aggiungi orso al bosco" +
                    "\n4. Rimuovi animale dal bosco (lupo o orso)" +
                    "\n5. Ottieni informazioni bosco" +
                    "\n0. Esci");
            System.out.println("Scelta: ");
            scelta = input.nextInt();
            switch(scelta){
                case 0: // ESCI
                    System.exit(0);
                case 1: // CREARE IL BOSCO
                    System.out.println("Nome: ");
                    nome = input.nextLine();
                    input.nextLine();
                    System.out.println("Località: ");
                    localita = input.nextLine();
                    input.nextLine();
                    System.out.println("Estensione: ");
                    estensione = input.nextFloat();
                    System.out.println("Quanti animali: ");
                    quantiAnimali = input.nextInt();
                    bosco = new Bosco(nome, localita, estensione, quantiAnimali);
                    boscoCreato = true;
                    break;
                case 2: // AGGIUNGERE LUPO
                    try{
                        if( !boscoCreato ){
                            throw new BoscoNonCreatoException("Non è stato creato ancora nessun bosco!");
                        }
                        else{
                            System.out.println("Nome: ");
                            nome = input.nextLine();
                            input.nextLine();
                            do{
                                try{
                                    tfException = false;
                                    System.out.println("Peso: ");
                                    peso = input.nextFloat();
                                    if( peso<=0 ){
                                        tfException = true;
                                        throw new ValoreNegativoException("Il peso non può essere un valore negativo o uguale a zero!");
                                    }
                                }catch(ValoreNegativoException e){
                                    System.out.println("Errore --> " + e.getMessage() );
                                }
                            }while( tfException );
                            do{
                                try{
                                    tfException = false;
                                    System.out.println("Sesso: ");
                                    sesso = Character.toLowerCase(input.next().charAt(0));
                                    if( !(sesso=='f' || sesso=='m') ){
                                        tfException = true;
                                        throw new CarattereNonValidoException("Questo carattere non è valido come carattere per scelta di sesso!");
                                    }
                                }catch(CarattereNonValidoException e){
                                    System.out.println("Errore --> " + e.getMessage() );
                                }
                            }while( tfException );
                            System.out.println("Giorno di nascita: ");
                            giornoNascita = input.nextInt();
                            System.out.println("Mese di nascita: ");
                            meseNascita = input.nextInt();
                            System.out.println("Anno di nascita: ");
                            annoNascita = input.nextInt();
                            System.out.println("Nome branco: ");
                            nomeBranco = input.nextLine();
                            input.nextLine();
                            lupo = new Lupo(nome, peso, sesso, giornoNascita, meseNascita, annoNascita, nomeBranco);
                            try{
                                bosco.aggiungiLupo(lupo);
                            }catch(IndexOutOfBoundsException e){
                                System.out.println("Errore --> " + e.getMessage());
                            }
                        }
                    }catch(BoscoNonCreatoException e){
                        System.out.println( "Errore --> " + e.getMessage() );
                    }
                    break;
                case 3: // AGGIUNGERE ORSO
                    try{
                        if( !boscoCreato ){
                            throw new BoscoNonCreatoException("Non è stato creato ancora nessun bosco!");
                        }
                        else{
                            System.out.println("Nome: ");
                            nome = input.nextLine();
                            input.nextLine();
                            do{
                                try{
                                    tfException = false;
                                    System.out.println("Peso: ");
                                    peso = input.nextFloat();
                                    if( peso<=0 ){
                                        tfException = true;
                                        throw new ValoreNegativoException("Il peso non può essere un valore negativo o uguale a zero!");
                                    }
                                }catch(ValoreNegativoException e){
                                    System.out.println("Errore --> " + e.getMessage() );
                                }
                            }while( tfException );
                            do{
                                try{
                                    tfException = false;
                                    System.out.println("Sesso: ");
                                    sesso = Character.toLowerCase(input.next().charAt(0));
                                    if( !(sesso=='f' || sesso=='m') ){
                                        tfException = true;
                                        throw new CarattereNonValidoException("Questo carattere non è valido come carattere per scelta di sesso!");
                                    }
                                }catch(CarattereNonValidoException e){
                                    System.out.println("Errore --> " + e.getMessage() );
                                }
                            }while( tfException );
                            System.out.println("Giorno di nascita: ");
                            giornoNascita = input.nextInt();
                            System.out.println("Mese di nascita: ");
                            meseNascita = input.nextInt();
                            System.out.println("Anno di nascita: ");
                            annoNascita = input.nextInt();
                            System.out.println("Indossa un radiocollare (true=sì, false=no): ");
                            radiocollare = input.nextBoolean();
                            orso = new Orso(nome, peso, sesso, giornoNascita, meseNascita, annoNascita, radiocollare);
                            try{
                                bosco.aggiungiOrso(orso);
                            }catch(IndexOutOfBoundsException e){
                                System.out.println("Errore --> " + e.getMessage());
                            }
                        }
                    }catch(BoscoNonCreatoException e){
                        System.out.println( "Errore --> " + e.getMessage() );
                    }
                    break;
                case 4: // RIMUOVERE ANIMALE (LUPO O ORSO)
                    try{
                        if( !boscoCreato ){
                            throw new BoscoNonCreatoException("Non è stato creato ancora nessun bosco!");
                        }
                        else{
                            System.out.println("Nome animale (lupo o orso): ");
                            nome = input.nextLine();
                            input.nextLine();
                            try{
                                bosco.rimuoviAnimale(nome);
                            }catch(ArrayVuotoException e){
                                System.out.println("Errore --> " + e.getMessage());
                            }catch(ValoreNonTrovatoException e){
                                System.out.println("Errore --> " + e.getMessage());
                            }
                        }
                    }catch(BoscoNonCreatoException e){
                        System.out.println( "Errore --> " + e.getMessage() );
                    }
                    break;
                case 5: // VISUALIZZARE LE INFORMAZIONI SUL BOSCO
                    try{
                        if( !boscoCreato ){
                            throw new BoscoNonCreatoException("Non è stato creato ancora nessun bosco!");
                        }
                        else{
                            System.out.println( bosco.toString() );
                        }
                    }catch(BoscoNonCreatoException e){
                        System.out.println( "Errore --> " + e.getMessage() );
                    }
                    break;
                default:
                    System.out.println("Opzione non valida!");
                    break;
            }
        }while(scelta != 0);
    }
}

/*
Progettare in Java le seguenti classi:

Una classe Animale, che rappresenta le caratteristiche generali di un animale:
    nome, peso, sesso; inoltre si vuole poter conoscere l'età e la rappresentazione testuale dell'Animale stesso.
    ogni animale emette un particolare verso.

Una classe Orso che possiede le caratteristiche di un Animale e in più possiede:
    dataNascita (formato: giorno, mese, anno)
    radiocollare (si/no)

Una classe Lupo che possiede le caratteristiche di un Animale e in più possiede:
    dataNascita (formato: giorno, mese, anno)
    nome branco

Una classe Bosco che descrive:
    nome, localita, estensione (in ettari) e tutti gli animali (lupi e orsi) che lo abitano.
    ad ogni nuova nascita o morte l'elenco degli animali viene aggiornato
    deve essere possibile conoscere i dati dei vari orsi, dei vari lupi o di tutti gli animali presenti.
* */