public class Abitacolo {

    private int posti;
    private float dimensione;

    Abitacolo(int posti, float dimensione){
        this.posti = posti;
        this.dimensione = dimensione;
    }

    public int getPosti(){
        return posti;
    }

    public float getDimensione(){
        return dimensione;
    }

    public void setPosti(int posti){
        this.posti = posti;
    }

    public void setDimensione(float dimensione){
        this.dimensione = dimensione;
    }

}
