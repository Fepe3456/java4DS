public class Main {
    public static void main(String[] args) {

        Cassaforte<String> cassaforteDocumenti = new Cassaforte<>(3);
        Cassaforte<Integer> cassaforteBanconote = new Cassaforte<>(3);
        Cassaforte<Float> cassaforteMonete = new Cassaforte<>(3);

        try{
            cassaforteDocumenti.aggiungi("Documento 1");
            System.out.println( cassaforteDocumenti.toString() );
            cassaforteDocumenti.aggiungi("Documento 2");
            System.out.println( cassaforteDocumenti.toString() );
            cassaforteDocumenti.aggiungi("Documento 3");
            System.out.println( cassaforteDocumenti.toString() );
            cassaforteDocumenti.aggiungi("Documento 4");
        }catch(CassaforteException e){
            System.out.println( e.getMessage() );
        }


        try {
            cassaforteBanconote.aggiungi(20);
            System.out.println(cassaforteBanconote.toString());
            cassaforteBanconote.aggiungi(50);
            System.out.println(cassaforteBanconote.toString());
            cassaforteBanconote.aggiungi(100);
            System.out.println(cassaforteBanconote.toString());

            cassaforteBanconote.rimuovi(50);
            System.out.println( cassaforteBanconote.toString() );
            cassaforteBanconote.rimuovi(30);
            System.out.println( cassaforteBanconote.toString() );
            //cassaforteBanconote.rimuovi("50");
            //System.out.println( cassaforteBanconote.toString() );
        }catch(CassaforteException e){
            System.out.println( e.getMessage() );
        }


        try{
            System.out.println( cassaforteMonete.toString() );
            cassaforteMonete.rimuovi(0.5f);
        }catch(CassaforteException e){
            System.out.println( e.getMessage() );
        }

    }
}