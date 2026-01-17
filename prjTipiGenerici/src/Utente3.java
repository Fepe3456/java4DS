public class Utente3<K,V> implements Pair<K, V>{

    private K key;
    private V value;

    public Utente3(K key, V value){
        this.key = key;
        this.value = value;
    }
    public K getKey(){
        return key;
    }
    public V getValue(){
        return value;
    }

    public V trovaUtente(K numero) throws UtenteException{
        if( numero.equals( this.key) ){
            return this.value;
        }
        else{
            throw new UtenteException("Utente non trovato!");
        }
    }

}
