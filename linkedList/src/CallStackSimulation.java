public class CallStackSimulation {
    public static int fattoriale(int n){
        int risultato = 1;
        LLStack<ActivationRecord> stack = new LLStack<>();
        //Aggiunto allo stack
        while( n > 0 ){
            ActivationRecord current = new ActivationRecord( n );
            stack.push( current );
            n--;
        }
        //Rimozione dallo stack + calcolo
        while( stack.count() > 0 ){
            risultato *= stack.pop().getN();
        }
        return risultato;
    }
}
