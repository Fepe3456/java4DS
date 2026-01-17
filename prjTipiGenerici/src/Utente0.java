public class Utente0 {

    private OrderedPair<Integer, String> orderedPair;

    Utente0(Integer numero, String nome){
        orderedPair = new OrderedPair<Integer, String>(numero, nome);
    }

    public Integer getNumero(){
        return orderedPair.getKey();
    }
    public String getNome(){
        return orderedPair.getValue();
    }

    public String trovaUtente(Integer numero) throws UtenteException{
        if( numero.equals( orderedPair.getKey() ) ){
            return orderedPair.getValue();
        }
        else{
            throw new UtenteException("Utente non trovato!");
        }
    }

}