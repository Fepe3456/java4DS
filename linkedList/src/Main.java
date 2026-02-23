import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        LinkedList linkedList = new LinkedList();

        int scelta;
        int value;
        do{
            System.out.println("\n1. Append() (an integer)" +
                    "\n2. Prepend() (an integer)" +
                    "\n3. DeleteWithValue() (integer)" +
                    "\n4. ToString()" +
                    "\n0. Exit" +
                    "\nScelta: ");
            scelta = input.nextInt();
            switch( scelta ){
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    System.out.println("Value (integer): ");
                    value = input.nextInt();
                    linkedList.append( value );
                    break;
                case 2:
                    System.out.println("Value (integer): ");
                    value = input.nextInt();
                    linkedList.prepend( value );
                    break;
                case 3:
                    System.out.println("Value (integer): ");
                    value = input.nextInt();
                    linkedList.deleteWithValue( value );
                    break;
                case 4:
                    System.out.println( linkedList.toString() );
                    break;
                default:
                    System.out.println("Not valid option!");
                    break;
            }
        }while( scelta != 0 );

    }
}