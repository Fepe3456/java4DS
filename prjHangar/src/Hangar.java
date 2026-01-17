public class Hangar {

    private Aeromobile[] aeromobili;
    private int dl;

    Hangar(int numeroAeromobili){
        this.aeromobili = new Aeromobile[numeroAeromobili];
        this.dl = 0;
    }

    public void aggiungiAereo(Aeromobile aereo){ //Corretto utilizzare Aeromobile --> polimorfismo fra dati
        aeromobili[dl] = aereo;
        dl++;
    }

    public void spostaAereo(String codice_id, int nuovaPosizione){

    }

    public boolean findAeromobile(String codice_id){
        boolean tf = false;
        for(int i=0; i<dl; i++){
            if(aeromobili[i].getCodice_id() == codice_id){
                tf = true;
            }
        }
        return tf;
    }

    public String toString(){
        String str = "";
        if( dl == 0 ){
            str = "Hangar vuoto!";
        }
        else{
            for(int i=0; i<dl; i++){
                str += "\nAeromobile '" + aeromobili[i].getCodice_id() + "': \n   Posizione: " + dl + "\n   Posti abitacolo: " + aeromobili[i].getAbitacolo().getPosti() + "posti\n   Dimensione abitacolo: " + aeromobili[i].getAbitacolo().getDimensione() + "m2";
            }
        }
        return str;
    }

}
