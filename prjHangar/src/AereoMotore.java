public class AereoMotore extends Aeromobile {

    private float potenza;

    AereoMotore(String codice_id, int postiAbitacolo, float dimensioneAbitacolo, float potenza){
        super(codice_id, postiAbitacolo, dimensioneAbitacolo);
        this.potenza = potenza;
    }

    public float getPotenza(){
        return potenza;
    }

    public void setPotenza(int potenza){
        this.potenza = potenza;
    }

}
