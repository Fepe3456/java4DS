public class Utente2<K, V> extends OrderedPair<K, V> {

    Utente2(K key, V value){
        super(key, value);
    }

    public V trovaUtente(K numero) throws UtenteException{
        V ris;
        if( numero.equals( getKey() ) ){
            ris = getValue();
        }
        else{
            throw new UtenteException("Utente non trovato!");
        }
        return ris;
    }

}
