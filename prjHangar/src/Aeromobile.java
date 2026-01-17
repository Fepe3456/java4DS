public class Aeromobile {

    private String codice_id;
    private Abitacolo abitacolo;

    Aeromobile(String codice_id, int postiAbitacolo, float dimensioneAbitacolo){
        this.codice_id = codice_id;
        this.abitacolo = new Abitacolo(postiAbitacolo, dimensioneAbitacolo);
    }

    public String getCodice_id(){
        return codice_id;
    }

    public Abitacolo getAbitacolo(){
        return abitacolo;
    }

    public void setCodice_id(String codice_id){
        this.codice_id = codice_id;
    }

    public void setAbitacolo(int posti, float dimensione){
        this.abitacolo.setPosti(posti);
        this.abitacolo.setDimensione(dimensione);
    }

}
