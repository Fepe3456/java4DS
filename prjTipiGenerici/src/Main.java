public class Main {
    public static void main(String[] args) {

        Login login = new Login("federico", "password123");
        try{
            System.out.println( "getUtente() = " + login.getUtente() );
            System.out.println( "getPassword() = " + login.getPassword( login.getUtente() ) );
            login.cambiarePassword( login.getUtente(), "pass345");
            System.out.println( "getPassword() = " + login.getPassword( login.getUtente() ) );
        }catch(LoginException e){
            System.out.println( e.getMessage() );
        }



        //Creare una classe Utente che dato il suo numero viene fuori il suo nome
        //Aggregazione stretta
        Utente<Integer, String> utente = new Utente<>(800, "Federico");
        try{
            System.out.println( utente.trovaUtente(800) );
            System.out.println( utente.trovaUtente(100) );
        }catch(UtenteException e){
            System.out.println( e.getMessage() );
        }

        //Ereditarietà
        Utente2<Integer, String> utente2 = new Utente2<>(400, "Federico");
        try{
            System.out.println( "\n" + utente2.trovaUtente(400) );
            System.out.println( utente2.trovaUtente(101) );
        }catch(UtenteException e){
            System.out.println( e.getMessage() );
        }

        //Implementazione interfaccia
        Utente3<Integer, String> utente3 = new Utente3<>(680, "Federico");
        try{
            System.out.println( "\n" + utente3.trovaUtente(680) );
            System.out.println( utente3.trovaUtente(102) );
        }catch(UtenteException e){
            System.out.println( e.getMessage() );
        }

        Utente0 utente0 = new Utente0(800, "Federico");
        try{
            System.out.println( "\n" + utente0.trovaUtente(800) );
            System.out.println( utente0.trovaUtente(100) );
        }catch(UtenteException e){
            System.out.println( e.getMessage() );
        }



        //Classe Login, coppia Login Password. Conoscere utente, conoscere password data utente. Cambiare password data utente


    }
}

/*

        Box<Integer> integerBox = new Box<Integer>(4);
        Box<String> stringBox = new Box<String>("ciao");

        System.out.println( "Integer" + integerBox.toString() );
        integerBox.setContent(7);
        System.out.println( integerBox.getContent() );

        System.out.println( "String" + stringBox.toString() );
        //stringBox.setContent(3); //Errore, suggerisce --> stringBox.setContent(String.valueOf(3));
            //java: incompatible types: int cannot be converted to java.lang.String
        stringBox.setContent("3");
        System.out.println( stringBox.getContent() );


        OrderedPair<Integer, String> orderedPair = new OrderedPair<Integer, String>(5, "ciao");
        OrderedPair<Integer, Integer> orderedPair2 = new OrderedPair<Integer, Integer>(5, 6);

* */