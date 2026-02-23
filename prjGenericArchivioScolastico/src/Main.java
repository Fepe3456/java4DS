import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Archivio<Integer> archivioVoti = new Archivio(4);
        Archivio<Integer> archivioAssenze = new Archivio(3);
        Archivio<String> archivioNoteDisciplinari = new Archivio(5);

        int scelta = -1;
        do {
            System.out.println("1. Aggiungi all'archivio voti\n" +
                    "2. Leggi elemento in posizione x nell'archivio voti\n" +
                    "3. Rimuovi elemento in archivio voti\n" +
                    "4. Aggiungi all'archivio assenze\n" +
                    "5. Leggi elemento in posizione x nell'archivio assenze\n" +
                    "6. Rimuovi elemento in archivio assenze\n" +
                    "7. Aggiungi all'archivio note disciplinari\n" +
                    "8. Leggi elemento in posizione x nell'archivio note disciplinari\n" +
                    "9. Rimuovi elemento in archivio note disciplinari\n" +
                    "10. Spazio libero archivio voti\n" +
                    "11. Spazio libero archivio assenze\n" +
                    "12. Spazio libero archivio note disciplinari\n" +
                    "20. Visualizza archivio voti\n" +
                    "21. Visualizza archivio assenze\n" +
                    "22. Visualizza archivio note disciplinari\n" +
                    "Scelta: ");
            scelta = input.nextInt();
            switch (scelta) {
                case 1:
                    System.out.println("Voto: ");
                    archivioVoti.addElement(input.nextInt());
                    break;
                case 2:
                    try {
                        System.out.println("Indice: ");
                        System.out.println("Elemento: " + archivioVoti.findElementByIndex(input.nextInt()).toString());
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println(e.getMessage());
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break; 
                case 3:
                    System.out.println("Elemento: ");
                    archivioVoti.removeElement(input.nextInt());
                    break;
                case 4:
                    System.out.println("Voto: ");
                    archivioAssenze.addElement(input.nextInt());
                    break;
                case 5:
                    try {
                        System.out.println("Indice: ");
                        System.out.println("Elemento: " + archivioAssenze.findElementByIndex(input.nextInt()).toString());
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println(e.getMessage());
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                case 6:
                    System.out.println("Elemento: ");
                    archivioAssenze.removeElement(input.nextInt());
                    break;
                case 7:
                    System.out.println("Voto: ");
                    archivioNoteDisciplinari.addElement(input.next());
                    break;
                case 8:
                    try {
                        System.out.println("Indice: ");
                        System.out.println("Elemento: " + archivioNoteDisciplinari.findElementByIndex(input.nextInt()).toString());
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println(e.getMessage());
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                case 9:
                    System.out.println("Elemento: ");
                    archivioNoteDisciplinari.removeElement(input.next());
                    break;
                case 10:
                    System.out.println("Spazio disponibile archivio voti --> " + archivioVoti.getNullElements());
                    break;
                case 11:
                    System.out.println("Spazio disponibile archivio assenze --> " + archivioAssenze.getNullElements());
                    break;
                case 12:
                    System.out.println("Spazio disponibile archivio note disciplinari --> " + archivioNoteDisciplinari.getNullElements());
                    break;
                case 20:
                    System.out.println(archivioVoti.toString());
                    break;
                case 21:
                    System.out.println(archivioAssenze.toString());
                    break;
                case 22:
                    System.out.println(archivioNoteDisciplinari.toString());
                    break;
                case 0:
                    System.exit(0);
                    break;
            }
        }while( scelta != 0 );

    }
}

        /*
        //          ARCHIVIO VOTI           //
        System.out.println( archivioVoti.toString() );
        archivioVoti.addElement(1);
        archivioVoti.addElement(2);
        try {
            System.out.println("Elemento in posizione 0 in archivio voti: " + archivioVoti.findElementByIndex(0).toString() );
            System.out.println("Elemento in posizione 2 in archivio voti: " + archivioVoti.findElementByIndex(2).toString() );
        }catch(IndexOutOfBoundsException e){
            System.out.println( e.getMessage() );
        }catch(Exception e){
            System.out.println( e.getMessage() );
        }
        archivioVoti.addElement(3);
        try {
            System.out.println("Elemento in posizione 4 in archivio voti: " + archivioVoti.findElementByIndex(4).toString() );
        }catch(Exception e){
            System.out.println( e.getMessage() );
        }
        System.out.println( archivioVoti.toString() );
        System.out.println( "Nell'archivio voti sono disponibili " + archivioVoti.getNullElements() + " posti");
        // archivioVoti.addElement("1"); // 'addElement(java.lang.Integer)' in 'Archivio' cannot be applied to '(java.lang.String)'
        System.out.println("Rimozione elemento con valore 2 ... ");
        archivioVoti.removeElement(2);
        System.out.println( archivioVoti.toString() );



        //          ARCHIVIO ASSENZE           //
        System.out.println( "\n" + archivioAssenze.toString() );
        archivioAssenze.addElement(10);
        archivioAssenze.addElement(11);
        try {
            System.out.println("Elemento in posizione 0 in archivio voti: " + archivioAssenze.findElementByIndex(0).toString() );
            System.out.println("Elemento in posizione 2 in archivio voti: " + archivioAssenze.findElementByIndex(2).toString() );
        }catch(IndexOutOfBoundsException e){
            System.out.println( e.getMessage() );
        }catch(Exception e){
            System.out.println( e.getMessage() );
        }
        archivioAssenze.addElement(12);
        try {
            System.out.println("Elemento in posizione 4 in archivio voti: " + archivioAssenze.findElementByIndex(4).toString() );
        }catch(Exception e){
            System.out.println( e.getMessage() );
        }
        System.out.println( archivioAssenze.toString() );
        System.out.println( "Nell'archivio assenze sono disponibili " + archivioAssenze.getNullElements() + " posti");
        // archivioAssenze.addElement("10"); // 'addElement(java.lang.Integer)' in 'Archivio' cannot be applied to '(java.lang.String)'



        //          ARCHIVIO NOTE DISCIPLINARI           //
        System.out.println( "\n" + archivioNoteDisciplinari.toString() );
        archivioNoteDisciplinari.addElement("Nota 1");
        archivioNoteDisciplinari.addElement("Nota 2");
        try {
            System.out.println("Elemento in posizione 0 in archivio voti: " + archivioNoteDisciplinari.findElementByIndex(0).toString() );
            System.out.println("Elemento in posizione 2 in archivio voti: " + archivioNoteDisciplinari.findElementByIndex(2).toString() );
        }catch(IndexOutOfBoundsException e){
            System.out.println( e.getMessage() );
        }catch(Exception e){
            System.out.println( e.getMessage() );
        }
        archivioNoteDisciplinari.addElement("Nota 3");
        try {
            System.out.println("Elemento in posizione 4 in archivio voti: " + archivioNoteDisciplinari.findElementByIndex(4).toString() );
        }catch(Exception e){
            System.out.println( e.getMessage() );
        }
        System.out.println( archivioNoteDisciplinari.toString() );
        System.out.println( "Nell'archivio note disciplinari sono disponibili " + archivioNoteDisciplinari.getNullElements() + " posti");
        // archivioNoteDisciplinari.addElement(4); // 'addElement(java.lang.String)' in 'Archivio' cannot be applied to '(int)'

         */