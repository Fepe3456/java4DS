import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        CartaBrano c;
        int nBrani;
        boolean ioOkay = false;

        do{
            System.out.println("Inserisci il numero di brani: ");
            nBrani = input.nextInt();

            //Il costruttore di CartaBrano (il metodo che voglio chiamare) può restituire un'eccezione, quindi devo fare all'interno di try catch
            try{
                c = new CartaBrano( nBrani );
                ioOkay = true; //Questa riga si esegue solo se la riga precedente va a buon fine, altrimenti non si esegue

                c.attiva();
                c.attiva();
                c.compraBrano();

                System.out.println("Brani rimanenti: " + c.braniRimanenti());

                c.compraBrano();

                System.out.println("Brani rimanenti: " + c.braniRimanenti());

            }catch(CartaGiaAttivata e){
                System.out.println( e.getMessage() );
                //Proseguo con il programma
            }catch(Exception e){
                System.out.println( e.getMessage() );
            }
        }while( !ioOkay );

    }
}

/*
    Creare una classe CartaBrano che rappresenta una carta prepagata per l'acquisto di brani musicali online. Deve avere le seguenti variabili di istanza private:
    brani - il numero di brani sulla carta;
    attivata - vero se la carta è stata attivata;
    Inoltre deve avere i seguenti metodi:
    CartaBrano(n)
    attivata()
    compraBrano()
    braniRimanenti() -
* */