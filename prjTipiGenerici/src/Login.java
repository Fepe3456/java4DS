public class Login {

    private OrderedPair<String, String> orderedPair;

    Login(String utente, String password){
        orderedPair = new OrderedPair<String, String>(utente, password);
    }

    public String getUtente(){
        return orderedPair.getValue();
    }

    public String getPassword(String utente) throws LoginException{
        if( utente.equals( orderedPair.getKey() ) ){ //Se gli utenti corrispondono
            return orderedPair.getValue();
        }
        else{
            throw new LoginException("Utente non corrisponde!");
        }
    }

    public void cambiarePassword(String utente, String password) throws LoginException{
        if( utente.equals( orderedPair.getKey() ) ){ //Se gli utenti corrispondono
            orderedPair.setValue( password );
        }
        else{
            throw new LoginException("Utente non corrisponde!");
        }
    }

}
