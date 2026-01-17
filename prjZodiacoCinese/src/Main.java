import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Data data;
        ZodiacoCinese z = new ZodiacoCinese();
        int giorno, mese, anno;

        System.out.println("Giorno: ");
        giorno = input.nextInt();
        System.out.println("Mese: ");
        mese = input.nextInt();
        System.out.println("Anno: ");
        anno = input.nextInt();

        data = new Data(giorno, mese, anno);

        System.out.println("Segno --> " + z.getSegno(data) );

    }
}
