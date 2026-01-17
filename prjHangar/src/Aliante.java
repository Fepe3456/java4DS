public class Aliante extends Aeromobile{

    private float efficienza;

    Aliante(String codice_id, int postiAbitacolo, float dimensioneAbitacolo, float efficienza){
        super(codice_id, postiAbitacolo, dimensioneAbitacolo);
        this.efficienza = efficienza;
    }

    public float getEfficienza(){
        return efficienza;
    }

    public void setEfficienza(int efficienza){
        this.efficienza = efficienza;
    }

}
