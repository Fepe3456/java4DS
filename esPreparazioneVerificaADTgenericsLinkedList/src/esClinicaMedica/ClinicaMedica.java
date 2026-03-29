package esClinicaMedica;

import java.util.*;

public class ClinicaMedica {

    private List<Paziente> pazienti;
    private Queue<RichiestaVisita> richiesteNormali;
    private Queue<RichiestaVisita> richiesteUrgenti;
    private Stack<String> storicoOperazioni;

    ClinicaMedica(){
        pazienti = new ArrayList<>();
        richiesteNormali = new LinkedList<>();
        richiesteUrgenti = new LinkedList<>();
        storicoOperazioni = new Stack<>();
    }

    public void registraPaziente(Paziente paziente){
        pazienti.add(paziente);
    }

    public void addRichiesta(RichiestaVisita richiesta){
        if( richiesta.isUrgente() ){
            richiesteUrgenti.offer(richiesta);
        }
        else{
            richiesteNormali.offer(richiesta);
        }
    }

    public void processaUnaRichiesta() throws Exception{
        if( richiesteUrgenti.isEmpty() && richiesteNormali.isEmpty() ){ //Se non ci sono richieste da processare
            throw new Exception("Non ci sono richieste da processare!");
        }
        else {
            String desc_op = "Processamento richiesta (";
            if (!richiesteUrgenti.isEmpty()) { //Se la coda con le richieste urgenti non è vuota, quindi ci sono ancora richieste urgenti da eseguire, viene eseguita una richiesta urgente
                desc_op += richiesteUrgenti.poll().toString() + ")";
            } else { //Se non ci sono richieste urgenti vengono processate le richieste normali
                desc_op += richiesteNormali.poll().toString() + ")";
            }
            storicoOperazioni.push(desc_op);
        }
    }

    public void annullaRichiestaNonProcessata(RichiestaVisita richiesta){
        if( richiesta.isUrgente() ){
            richiesteUrgenti.remove(richiesta);
        }
        else{
            richiesteNormali.remove(richiesta);
        }
    }

    public String visualizzaRichiesteInCoda(){
        return "Richieste Urgenti: \n" + richiesteUrgenti.toString() + "\nRichieste normali: \n" + richiesteNormali.toString();
    }

    public String visualizzaOperazioniEffettuate(){
        return "Storico operazioni: \n" + storicoOperazioni.toString();
    }

    public String visualizzaElencoPazienti(){
        return "Pazienti: \n" + pazienti.toString();
    }

    public Paziente getPaziente(String id) throws Exception {
        Paziente p = null;
        int i=0;
        boolean trovato = false;
        while( !trovato && i< pazienti.size() ){
            if( pazienti.get(i).getCodice_id() .equals(id) ){
                trovato = true;
                p = pazienti.get(i);
            }
            i++;
        }
        if(!trovato){
            throw new Exception("Non è stato trovato nessun paziente con questo id all'interno del registro pazienti!");
        }
        return p;
    }

    public RichiestaVisita getRichiesta(Paziente paziente) throws Exception{
        RichiestaVisita richiesta = null;
        boolean trovato = false;
        for( RichiestaVisita r : richiesteUrgenti ){
            if( r.getPaziente() .equals(paziente) ){
                richiesta = r;
                trovato = true;
            }
        }
        if( !trovato ){
            for( RichiestaVisita r : richiesteNormali ){
                if( r.getPaziente() .equals(paziente) ){
                    richiesta = r;
                    trovato = true;
                }
            }
        }
        if( !trovato ){
            throw new Exception("Non è stata trovata nessuna richiesta di visita da questo paziente!");
        }
        return richiesta;
    }

}
