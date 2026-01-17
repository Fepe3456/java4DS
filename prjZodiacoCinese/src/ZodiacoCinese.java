public class ZodiacoCinese {

    private String[] segni;


    ZodiacoCinese(){
        segni = new String[]{"Topo", "Bue", "Tigre", "Coniglio", "Drago", "Serpente", "Cavallo", "Capra", "Scimmia", "Gallo", "Cane", "Maiale"};
    }

    public String getSegno(Data data){
        int anno = data.getAnno();
        if( checkCapodanno(data) ){ //Se la data ‘data’ viene prima del capodanno, si considera il segno dell’anno precedente
            anno = anno - 1;
        }
        return segni[ ( anno - 1900 ) % 12 ];
    }

    public boolean checkCapodanno(Data data){
        boolean tf = false;
        if( data.giorniPassatiDa( calcolaCapodanno( data.getAnno() ) ) < 0 ){
            tf = true;
        }
        return tf;
    }

    private Data calcolaCapodanno(int anno){
        Data capodanno = new Data(1,1,200); //Temporaneo
        /*Il capodanno cinese corrisponde alla prima luna nuova dopo il solstizio d’inverno,
        quindi bisognerebbe avere conoscenza di questi dati*/
        return capodanno;
    }

}
