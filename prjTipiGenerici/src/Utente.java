public class Utente<K, V> {

    private OrderedPair<K, V> orderedPair;
    //private OrderedPair<Integer, String> orderedPair;

    Utente(K numero, V nome){
        orderedPair = new OrderedPair<K, V>(numero, nome);
    }

    public K getNumero(){
        return orderedPair.getKey();
    }
    public V getNome(){
        return orderedPair.getValue();
    }

    public V trovaUtente(K numero) throws UtenteException{
        if( numero.equals( orderedPair.getKey() ) ){
            return orderedPair.getValue();
        }
        else{
            throw new UtenteException("Utente non trovato!");
        }
    }

}

/*
    private T nome;
    private T2 numero;

    Utente(T nome, T2 numero){
        this.nome = nome;
        this.numero = numero;
    }

    public T trovaUtente(T2 numero) throws UtenteException{
        T ris;
        if( numero == this.numero ){
            ris = nome;
        }
        else{
            throw new UtenteException("Utente non trovato!");
        }
        return ris;
    }
* */