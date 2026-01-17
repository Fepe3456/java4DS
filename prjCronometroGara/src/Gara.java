public class Gara {

    private CronometroGiri cronometro;
    private Giro[] giri;
    private int dl;
    private Pilota pilota;
    private int nGiri;

    Gara(String nome, int numeroGiri){
        this.nGiri = numeroGiri;
        this.cronometro = new CronometroGiri(nGiri);
        this.giri = new Giro[nGiri];
        this.dl = 0;
        for(int i=0; i<nGiri; i++){
            giri[i] = new Giro(0,i+1);
        }
        this.pilota = new Pilota(nome);
    }

    public void avvia(){
        try{
            cronometro.partito();
        }catch(CronometroGiaPartitoException e){
            System.out.println( e.getMessage() );
        }
    }

    public void marcaGiro(float durata){
        try{
            cronometro.marcaGiro(durata);
            giri[dl].setDurata( durata );
            dl++;
        }catch(GiriCompletatiException e){
            System.out.println( e.getMessage() );
        }catch(ValoreNegativoException e){
            System.out.println( e.getMessage() );
        }
    }

    public void assegnaPilota(Pilota p){
        this.pilota = p;
    }
    public Pilota getPilota(){
        return pilota;
    }

    public int getGiriCompletati(){
        return cronometro.getGiriCompletati();
    }
    public int getGiriRimanenti(){
        return cronometro.getGiriRimanenti();
    }
    public float getTempoTotale(){
        return cronometro.getTempoTotale();
    }

    public Giro[] getGiri(){
        return giri;
    }

    public String toStringGiri(){
        String str = "";
        for(int i=0; i<dl; i++){
            str += "   Giro numero " + giri[i].getNumeroGiro() + ": " + giri[i].getDurata() + "secondi\n";
        }
        return str;
    }

}
